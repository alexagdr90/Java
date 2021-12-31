// circunferencias.java = dibuja 2 circunferencias
import java.awt.*;
import java.awt.event.*;
class circunferencias extends Frame {
    public circunferencias() {
        setTitle("Dos circunferencias");
    }
    public static void main(String [] args) {
        Frame f=new circunferencias();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setSize(300,200);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawOval(10,30,30,30);
        g.setColor(Color.blue);
        g.drawOval(35,30,30,30);
        g.drawString("Dos circunferencias",40,100);
    }
}