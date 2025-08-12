package herança;

public class Herança {

    public static void main(String[] args) {
        Cachorro titan = new Cachorro();
        Gato mingal = new Gato();
        
        titan.setNome("Titan");
        titan.emitirSom();
        
        System.out.println(titan.getNome());
        
        mingal.setNome("Mingal");
        mingal.emitirSom();
        
        System.out.println(mingal.getNome());
    }
    
}
