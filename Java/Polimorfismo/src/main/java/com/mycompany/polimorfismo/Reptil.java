package com.mycompany.polimorfismo;

public class Reptil extends Animal {

    private String corEscama;

    public Reptil(String corEscama, double peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {
        return "Reptil{" + "corEscama=" + corEscama + '}';
    }

    @Override
    public void locomover() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void emitirSom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
