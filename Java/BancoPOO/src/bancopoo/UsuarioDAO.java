package bancopoo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    private Connection connection;

    public UsuarioDAO() {
        this.connection = new ConnectionFactory().conectaBD();
    }

    public void criarUsuario(Usuario usuario) throws SQLException {

        String sql = "INSERT INTO usuarios (nome, idade, sexo, email, senha, saldo)"
                + "VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement pstm = null;

        try {
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getIdade());
            pstm.setString(3, usuario.getSexo());
            pstm.setString(4, usuario.getEmail());
            pstm.setString(5, usuario.getSenha());
            pstm.setString(6, Double.toString(usuario.getSaldo()));

            pstm.executeUpdate();
            System.out.println("Usuário criado com sucesso!");
        } catch (SQLException erro) {
            System.out.println("ERRO ao criar usuário: " + erro.getMessage());
        } finally {
            if (pstm != null) {
                pstm.close();
            }
        }

    }

    public Usuario buscarUsuarioPorId(int id) throws SQLException {

        String sql = "SELECT * FROM usuarios WHERE id = ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Usuario usuario = null;

        try {

            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();

            if (rs.next()) {

                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setIdade(rs.getString("idade"));
                usuario.setSexo(rs.getString("sexo"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSaldo(rs.getDouble("saldo"));

            }

        } catch (SQLException erro) {
            
            System.out.println("ERRO ao buscar usuário " + erro.getMessage());
            
        } finally {
            
            if (rs != null) rs.close();
            if (pstm != null) pstm.close();
            
        }

        return usuario;
    }
    
}
