package projetobiblio;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    
    private Connection connection;
    
    public UsuarioDAO() {
        this.connection = new ConnectionFactory().conectaBD();
    }
    
    public void criarUsuario(Usuario usuario) throws SQLException {
        
        String sql = "INSERT INTO usuarios (nome, email, telefone, tipo_usuario)" 
                + "VALUES (?, ?, ?, ?)";
        
        PreparedStatement pstm = null;
        
        try {
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail());
            pstm.setString(3, usuario.getTelefone());
            pstm.setString(4, usuario.getTipo_usuario());
                    
            pstm.executeUpdate();
            System.out.println("Usuário criado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar usuário: " + e.getMessage());
        } finally {
            if (pstm != null) pstm.close();
        }
        
    }
    
}
