package objetos;

public class Triangulo {

    public String tipoTriangulo (double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Não é um triângulo.";
        }
        if (a == b && b == c) {
            return "Triângulo Equilátero.";
        } else if (a == b || a == c || b == c) {
            return "Triângulo Isósceles";
        } else {
            return "Triângulo Escaleno.";
        }
    }
    
}
