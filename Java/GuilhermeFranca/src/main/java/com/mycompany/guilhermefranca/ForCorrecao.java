package com.mycompany.guilhermefranca;

public class ForCorrecao {

    public static void main(String[] args){

            int linhas = 5;

                    for (int i = 1; i <= linhas; i++) {
                        // Espaços iniciais para alinhar à direita
                        for (int j = 1; j <= linhas - i; j++) {
                            System.out.print(" ");
                        }

                        // Imprime os asteriscos do lado esquerdo
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }

                        // Espaço entre os dois lados
                        System.out.print(" ");

                        // Imprime os asteriscos do lado direito
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*");
                        }

                        System.out.println(); // Pula para a próxima linha
            }
        }
}
        