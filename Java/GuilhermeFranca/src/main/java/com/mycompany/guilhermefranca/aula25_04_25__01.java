package com.mycompany.guilhermefranca;

import java.util.Scanner;

public class aula25_04_25__01 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int operador;
        
        do {
        
            System.out.println("\n\n-=-=-=-=-=-=-=-=-=-\n1 - Par ou impar\n2 - Bhaskara\n3 - Maior de idade\n0 - Sair\nSelecione o script: ");
            operador = entrada.nextInt();
            
            switch (operador) {
            
                case 1:
                    System.out.println("\n\nSript - Par ou Impar");


                    System.out.println("Digite um número");
                    int numero = entrada.nextInt();

                    String paridade = (numero % 2 == 0) ? numero + " Par": numero + " Impar";
                    
                    /*
                    if (numero % 2 == 0) {
                        System.out.println("O número " + numero + " é par");
                    } else {
                        System.out.println("O número " + numero + " é impar");
                    }
                    */
                    
                    System.out.println(paridade);

                    break;

                case 2:
                    System.out.println("\n\nSript - Bhaskara");

                    double a, b, c, x1, x2, delta;

                    System.out.println("Digite o valor de A: ");
                    a = entrada.nextInt();

                    System.out.println("Digite o valor de B: ");
                    b = entrada.nextInt();

                    System.out.println("Digite o valor de C: ");
                    c = entrada.nextInt();

                    delta = Math.pow(b, 2)-4*a*c;
                    x1 = (-b+Math.sqrt(delta))/(2*a);
                    x2 = (-b-Math.sqrt(delta))/(2*a);

                    if (delta <= 0) {
                        System.out.println("Raiz negativa");
                    } else {           
                        System.out.format("O delta: %.2f\nx1: %2f\nx2: %2f", delta, x1, x2);
                        /*
                        System.out.format("O delta: " + delta);
                        System.out.println("x1: " + x1);
                        System.out.println("x2: " + x2);
                        */
                    }

                    break;

                case 3:
                    System.out.println("\n\nSript - Maior de idade");

                    System.out.println("Digite sua idade:");
                    int idade = entrada.nextInt();

                    if (idade >= 18) {
                        System.out.format("%d Tem que votar", idade);
                    } else if (idade >= 16 && idade <= 18) {
                        System.out.format("%d Pode votar", idade);
                    } else {
                        System.out.format("%d Não tá podendo votar", idade);
                    }

                    break;

                default:
                    System.out.println("\n\nValor incorreto!");

            }
            
        } while (operador != 0);
        
        System.out.println("-=-=-=-=-=-=-=-=-=-\nFim do Script\n-=-=-=-=-=-=-=-=-=-");

        
        entrada.close();
        
    }
    
}
