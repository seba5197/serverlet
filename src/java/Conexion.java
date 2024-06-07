
import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Conexion {
    String bd="";
    String url="jdbc:mysql://localhost:3306/";
    String user="seba";
    String pass="sebastian5197";
    String driver="com.mysql.cj.jdbc.Driver";
 Connection cx;   

 
 public Conexion (){
 }
     public Connection conectar(){
        try {
            Class.forName(driver);
            cx=DriverManager.getConnection(url+bd,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
 
 
 
 
}
