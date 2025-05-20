package projetobiblio;

public class ProjetoBiblio {

    public static void main(String[] args) {
        
        ConnectionFactory conexao = new ConnectionFactory();
        if (conexao.conectaBD() != null) {
            System.out.println("Conexão realizada com sucesso!");
        } else {
            System.out.println("Falha ao conectar com o banco de dados");
        }
        
    }
    
}
