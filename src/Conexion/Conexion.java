
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
  public static final String URL = "jdbc:mysql://localhost:3306/inventario?useTimezone=true&serverTimezone=UTC";
  public static final String USER_NAME = "root";
  public static final String PASSWORD = "Root";
  
        public static Connection getConnection (){
    
        Connection con = null;
                
                try{
                    
                    con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                   // JOptionPane.showMessageDialog(null, "Conexion realizada");
                    
                }catch(Exception e){
                
                    System.out.println(e);
                }
                return con ;
        
    }
}
