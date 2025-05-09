package objetos;

public class ParImpar {

    public String verificar (int numero) {
        if (numero % 2 == 0) {
            return numero + " é par.";
        } else {
            return numero + " é ímpar.";
        }
    }
    
}
