package projetobiblio;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

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
    
    public List<Usuario> listarUsuarios() throws SQLException {
        
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {

            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario (0, "", "", "", "");
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setTipo_usuario(rs.getString("tipo_usuario"));
                
                lista.add(usuario);
            }
            
        } catch (SQLException e){
            System.out.println("Erro ao listar usuários: " + e.getMessage());
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
        }
        
        return lista;
        
    }
    
    public Usuario buscarUsurioPorId(int id) throws SQLException {
        
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        
        try {
            
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setTipo_usuario(rs.getString("tipo_usuario"));
            
            }
            
        } catch (SQLException e) {
            System.out.println("ERRO ao buscar usuário: " + e.getMessage());
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
        }
        
        return usuario;
        
    }
    
    public void atualizarUsuario(Usuario usuario) throws SQLException {
        
        String sql = "UPDATE usuarios SET nome = ?, email = ?, telefone = ?, tipo_usuario = ? WHERE id = ?";
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getTelefone());
            stmt.setString(4, usuario.getTipo_usuario());
            stmt.setInt(5, usuario.getId());
            
//            stmt.executeUpdate();
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0) {
                System.out.println("Usuário atualizado com sucesso!");
            } else {
                System.out.println("Nenhum usuário encontrado com o ID informado.");
            }
            
        } catch (SQLException e) {
            System.out.println("ERRO ao atualizar usuário: " + e.getMessage());
        } finally {
            if (stmt != null) stmt.close();
        }
        
    }
    
    public void deletarUsuario(int id) throws SQLException {
        
        String sql = "DELET FROM usuarios WHERE id = ?";
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Usuário deletado com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("ERRO ao deletar usuário: " + e.getMessage());
        } finally {
            if (stmt != null) stmt.close();
        }
        
    }
    
    public void fecharConexao() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
    
}
