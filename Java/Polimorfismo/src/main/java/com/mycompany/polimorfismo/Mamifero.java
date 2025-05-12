package com.mycompany.polimorfismo;

public class Mamifero extends Animal{
    
    private String corPelo;

    public Mamifero(String corPelo, double peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "corPelo=" + corPelo + '}';
    }

    @Override
    public void locomover() {
        System.out.println("Cachorro andou");
    }

    @Override
    public void alimentar() {
        System.out.println("nhami nhami");
    }

    @Override
    public void emitirSom() {
        System.out.println("au au au");
    }
    
}
