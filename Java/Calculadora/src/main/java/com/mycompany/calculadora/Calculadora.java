package com.mycompany.calculadora;

public class Calculadora {

    public static void main(String[] args) {
        
        Calculo conta = new Calculo();
        
        conta.metric(5, 10);
        conta.metric(1, -1, 12); 
        conta.metric(10, 10, 5, 7);
        
        System.out.println(conta.metric(5, 10));
        System.out.println(conta.metric(1, -1, 12));
        System.out.println(conta.metric(10, 10, 5, 7));
        
    }
}
