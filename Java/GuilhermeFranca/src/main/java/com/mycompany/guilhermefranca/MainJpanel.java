package com.mycompany.guilhermefranca;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainJpanel {

    public static void main(String[] args) {

        // Cria um frame invisível só pra usar como "pai" das janelas
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // boa prática
        frame.setUndecorated(true); // tira borda
        frame.setVisible(true); // precisa estar visível p/ funcionar o alwaysOnTop
        frame.setLocationRelativeTo(null); // centraliza (caso mostre)

        Scanner entrada = new Scanner(System.in);

        int operador;

        do {
            System.out.println("\n\n-=-=-=-=-=-=-=-=-=-\n1 - Par ou impar\n2 - Bhaskara\n3 - Maior de idade\n0 - Sair\nSelecione o script: ");
            operador = entrada.nextInt();

            switch (operador) {
                case 1:
                    System.out.println("\n\nScript - Par ou Impar");
                    System.out.println("Digite um número:");
                    int numero = entrada.nextInt();

                    String paridade = (numero % 2 == 0) ? numero + " é Par" : numero + " é Ímpar";
                    JOptionPane.showMessageDialog(frame, paridade, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2:
                    System.out.println("\n\nScript - Bhaskara");

                    System.out.println("Digite o valor de A: ");
                    double a = entrada.nextDouble();

                    System.out.println("Digite o valor de B: ");
                    double b = entrada.nextDouble();

                    System.out.println("Digite o valor de C: ");
                    double c = entrada.nextDouble();

                    double delta = Math.pow(b, 2) - 4 * a * c;

                    if (delta < 0) {
                        JOptionPane.showMessageDialog(frame, "Delta negativo! Não existem raízes reais.", "Resultado", JOptionPane.WARNING_MESSAGE);
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        String resultado = String.format("Delta: %.2f\nx1: %.2f\nx2: %.2f", delta, x1, x2);
                        JOptionPane.showMessageDialog(frame, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    }

                    break;

                case 3:
                    System.out.println("\n\nScript - Maior de idade");
                    System.out.println("Digite sua idade:");
                    int idade = entrada.nextInt();

                    String resultadoIdade;
                    if (idade >= 18) {
                        resultadoIdade = idade + " anos - Tem que votar!";
                    } else if (idade >= 16) {
                        resultadoIdade = idade + " anos - Pode votar!";
                    } else {
                        resultadoIdade = idade + " anos - Não tá podendo votar!";
                    }

                    JOptionPane.showMessageDialog(frame, resultadoIdade, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 0:
                    break;

                default:
                    JOptionPane.showMessageDialog(frame, "Valor inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (operador != 0);

        JOptionPane.showMessageDialog(frame, "Fim do Script!", "Encerrando", JOptionPane.PLAIN_MESSAGE);

        entrada.close();
        frame.dispose(); // fecha a janela invisível
    }
}
