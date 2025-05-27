package projetobiblio;

import java.util.List;
import java.sql.SQLException;
import java.sql.Connection;

public class Biblioteca {

    public static void main(String[] args) {
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        Connection connection = null;
        
        try {
       
            connection = new ConnectionFactory().conectaBD();
        
            UsuarioDAO dao = new UsuarioDAO();
            
            Usuario usuarioAtualizado = new Usuario();
            usuarioAtualizado.setId(1);
            usuarioAtualizado.setNome("Novo nome");
            usuarioAtualizado.setEmail("novoEmail@gmail.com");
            usuarioAtualizado.setTelefone("99999-9999");
            usuarioAtualizado.setTipo_usuario("Administrador");
            
            dao.atualizarUsuario(usuarioAtualizado);
            
        } catch (SQLException e) {
            System.out.println("ERRO na operação: " + e.getMessage());
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("ERRO ao fechar onexão: " + e.getMessage());
            } 
        }
        
        try {
            
            int idBuscado = 1;
            Usuario usuario = usuarioDao.buscarUsurioPorId(idBuscado);
            
            if (usuario != null) {
                
                System.out.println("Usuário encontrado: ");
                System.out.println("ID: " + usuario.getId());
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("Email: " + usuario.getEmail());
                System.out.println("Telefone: " + usuario.getTelefone());
                System.out.println("Tipo: " + usuario.getTipo_usuario());
                
            } else {
                System.out.println("Usuário com ID " + idBuscado + " não encontrado");
            }
            
        } catch (SQLException e) {
            System.out.println("ERRO ao buscar usuário: " + e.getMessage());
        }
        
        try {
            
            List<Usuario> usuarios = usuarioDao.listarUsuarios();
            if(usuarios.isEmpty()) {
                System.out.println("Nenhum usuários cadastrado.");
            } else {
                for (Usuario usuario: usuarios) {
                    System.out.println("ID: " + usuario.getId());
                    System.out.println("Nome: " + usuario.getNome());
                    System.out.println("Email: " + usuario.getEmail());
                    System.out.println("Telefone: " + usuario.getTelefone());
                    System.out.println("Tipo: " + usuario.getTipo_usuario());
                    System.out.println("--------------------------------------");
                }
            }
        } catch (SQLException e) {
            System.out.println("ERRO ao listar usuários: " + e.getMessage());
        }
        
//        Usuario usuario = new Usuario(0, "Jubileu", "jubileu@gmail.com", "61-9976427772", "ADM");;
        
        Usuario usuario = new Usuario(0, "Maicon da Silva Jacson", "Typhlosion@gmail.com", "61-9976427772", "ADM");
        
        try{
            usuarioDao.criarUsuario(usuario);
        } catch (SQLException e) {
            System.out.println("Deu errado" + e.getMessage());
        }
        
    }
    
}
