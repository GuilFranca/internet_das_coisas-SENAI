package com.mycompany.interfasse;

public class Carro implements Transporte {

    @Override
    public void mover() {
        System.out.println("o carro esta na estrada");
    }

}
