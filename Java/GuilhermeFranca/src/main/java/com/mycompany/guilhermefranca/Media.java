package com.mycompany.guilhermefranca;

import java.util.Scanner;

public class Media {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        double valor1 = entrada.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double valor2 = entrada.nextDouble();
        
        double media = (valor1 + valor2) / 2;
        
        System.out.format("Média: %.2f\n", media);
        
        entrada.close();
    }
}
