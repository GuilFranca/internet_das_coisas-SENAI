package com.mycompany.guilhermefranca;

import java.util.Scanner;

public class Forr {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite qual o tamanho da base do seu triangulo: ");
        int base = entrada.nextInt();
        
        //int base = 5;
    
        for (int i = 0; i <= base; i++){
            System.out.println("*".repeat(i));
            if (i == base) {
                for (i = 0; i <= base; i++){
                    System.out.println(" ".repeat(base - i) + "*".repeat(i));
                    if (base - i == 0) {
                        for (i = 0; i<= base; i++) {
                            System.out.println(" ".repeat(base - i) + "*".repeat(i) + " " + "*".repeat(i));    
                        }
                    }
                }
            }
        }   
        
        entrada.close();
        
    }
}
