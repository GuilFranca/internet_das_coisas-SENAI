package projetobiblio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection conectaBD() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/cadastro?useSSL=false";
            String user = "root";
            String password = "Magnemite_EM1";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException erro) {
            System.out.println("Erro" + erro.getMessage());
        }
        return conn;
    }
    
}
