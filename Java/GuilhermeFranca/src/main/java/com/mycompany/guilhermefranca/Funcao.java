package com.mycompany.guilhermefranca;

public class Funcao {

    static String bhaskara (double a, double b, double c) {
        
                    System.out.println("\n\nScript - Bhaskara");

                    double delta = Math.pow(b, 2) - 4 * a * c;

                    if (delta < 0) {
                        System.out.println("Delta negativo! Não existem raízes reais.");
                        return "Delta negativo! Não existem raízes reais.";
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        String resultado = String.format("Delta: %.2f\nx1: %.2f\nx2: %.2f", delta, x1, x2);
                        System.out.println(resultado);
                        
                        return resultado;
                    }
                    
    }
    
    public static void main(String[] args) {
     
        bhaskara(1,1,-6);
        
    }
}
