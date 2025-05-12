package herança;

public class Animal {
    
    protected String nome;
    
    public void emitirSom() {
        System.out.println("O animal faz um som...");
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
}
