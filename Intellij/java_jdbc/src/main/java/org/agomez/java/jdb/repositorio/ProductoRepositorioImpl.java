package org.agomez.java.jdb.repositorio;

import org.agomez.java.jdb.modelo.Producto;
import org.agomez.java.jdb.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements Repositorio<Producto> {


    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }



    @Override
    public List<Producto> listar() {
        List<Producto> productos=new ArrayList<>();

        try(Statement stmr=getConnection().createStatement();
        ResultSet rs = stmr.executeQuery("SELECT * FROM productos")){
            while (rs.next()) {
                Producto p=new Producto();
                p.setId(rs.getLong("id"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getInt("precio"));
                p.setFechaRegistro(rs.getDate("fecha_re"));
                productos.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }

    @Override
    public Producto porId(Long id) {
        return null;
    }

    @Override
    public void guardar(Producto producto) {

    }

    @Override
    public void eliminar(Long id) {

    }
}
