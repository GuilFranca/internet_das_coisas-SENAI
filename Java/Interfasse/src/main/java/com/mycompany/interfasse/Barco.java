package com.mycompany.interfasse;

public class Barco implements Transporte {

    @Override
    public void mover() {
        System.out.println("o barco esta na agua");
    }

}
