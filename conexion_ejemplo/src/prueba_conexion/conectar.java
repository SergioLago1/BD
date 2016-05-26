/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_conexion;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author slagogonzalez
 */
public class conectar {
    
    Connection conectar= null;
    
    public Connection conexion(){
        try{
        //cargar driver
          Class.forName("com.mysql.jdbc.Driver");
          conectar=DriverManager.getConnection("jdbc:mysql://10.0.0.254/slagogonzalez","slagogonzalez","slagogonzalez");
          System.out.println("Conexion estalbecida");
          JOptionPane.showMessageDialog(null, "Conexion establecida");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("error de conexion");
            JOptionPane.showMessageDialog(null, "Error de conexion"+e);
        }
        return conectar;
    }
}
