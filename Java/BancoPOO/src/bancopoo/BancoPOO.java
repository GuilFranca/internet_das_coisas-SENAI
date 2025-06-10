package bancopoo;

//import java.sql.Connection;
import java.sql.SQLException;

public class BancoPOO {

    public static void main(String[] args) {

        UsuarioDAO usuarioDao = new UsuarioDAO();
        
//        Connection connection = null;
        
        Usuario usuario = new Usuario(0, "Raquel", "22", "Feminino", "ququelson08@gmail.com", "kakauan", 3000.00);
        
        try {
            usuarioDao.criarUsuario(usuario);
        } catch (SQLException erro) {
            System.out.println("ERRO ao criar usuário: " + erro.getMessage());
        }
        
    }
    
}
