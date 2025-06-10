package bancopoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public Connection conectaBD(){
        
         Connection conn = null;
   
        try {
            String url = "jdbc:mysql://localhost:3306/banco?useSSL=false";
            String user = "root";
            String password = "Magnemite_EM1";
            conn = DriverManager.getConnection(url, user, password);
        }
        catch (SQLException erro) {
            System.out.println("ERRO no ConnectionFactory " + erro.getMessage());
        }
        
        return conn;   
    }
    
}
