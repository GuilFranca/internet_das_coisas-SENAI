package projetobiblio;

import java.sql.SQLException;

public class Biblioteca {

    public static void main(String[] args) {
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
//        Usuario usuario = new Usuario(0, "Jubileu", "jubileu@gmail.com", "61-9976427772", "ADM");;
        
        Usuario usuario = new Usuario(0, "Maicon da Silva Jacson", "Typhlosion@gmail.com", "61-9976427772", "ADM");
        
        try{
            usuarioDao.criarUsuario(usuario);
        } catch (SQLException e) {
            System.out.println("Deu errado" + e.getMessage());
        }
        
    }
    
}
