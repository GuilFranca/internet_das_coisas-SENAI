package objetos;

public class Objetos {

    public static void main(String[] args) {
     
        Bhaskara bhaskara = new Bhaskara();
        ParImpar parImpar = new ParImpar();
        Triangulo triangulo = new Triangulo();
        Arquivo arquivo = new Arquivo();

        String resultadoBhaskara = bhaskara.calcular(1, -3, 2);
        String resultadoParImpar = parImpar.verificar(7);
        String resultadoTriangulo = triangulo.tipoTriangulo(5, 5, 8);

        String conteudo = resultadoBhaskara + "\n" + resultadoParImpar + "\n" + resultadoTriangulo;
        arquivo.escrever(conteudo);

        // Lendo o conteúdo salvo
        arquivo.ler();
        
    }
    
}
