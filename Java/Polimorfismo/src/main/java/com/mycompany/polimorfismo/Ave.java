package com.mycompany.polimorfismo;

public class Ave extends Animal {

    private String corPena;

    public Ave(String corPena, double peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    public void fazerNinho(){
        System.out.println("Passarinho fez ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        return "Ave{" + "corPena=" + corPena + '}';
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
