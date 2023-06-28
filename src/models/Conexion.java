
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    
    private final String pass="1234";
    private final String root="victoria";
    private final String dB="ingles";
    private final String host="jdbc:mysql://192.168.1.73:3306/"+dB;
    private Connection con=null;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(host,root,pass);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "error al conectar con la database"+e);
        }
        
        
        
        return con;
    }
    
    
    
}
