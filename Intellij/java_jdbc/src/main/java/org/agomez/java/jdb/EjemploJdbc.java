package org.agomez.java.jdb;

import org.agomez.java.jdb.util.ConexionBaseDatos;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {

        try (Connection conn = ConexionBaseDatos.getInstance()){


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}




