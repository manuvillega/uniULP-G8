
package universidadgrupo8.accesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "universidadulp";
    private static final String USUARIO = "root";
    private static final String PASS = "";
    private static Connection connection;
    
    //conexion para prueba gonza
   /* private static final String URL = "jdbc:mysql://localhost:3306/universidadulp?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false&useTimezone=true&serverTimezone=UTC";
    private static final String USUARIO = "gonza";
    private static final String PASS = "Metallica.1";
    */
    
    
    private Conexion (){}
    
    
    public static Connection getconexion(){
        
        if(connection == null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                //Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB, USUARIO, PASS);
              //conexion para prueba gonza
                //connection = DriverManager.getConnection(URL, USUARIO, PASS);
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Driver");
        }   catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");  
            }
    }
        return connection;
}
}

