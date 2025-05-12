package reationdog;

public class Dog {

    public void falarFrase(String frase) {
        if (frase == "agradavel"){
            System.out.println("Abanar e latir");
        } else if (frase == "agressiva") {
            System.out.println("Rosnar");
        }
    }
    
    public void horarioDia(int horario) {
        if (horario <= 11 && horario > 0){
            System.out.println("Abanar");
        } else if (horario <= 18 && horario > 11) {
            System.out.println("Abanar e latir");
        } else if (horario <= 24 && horario > 18) {
            System.out.println("Ignorar");
        }       
    }
    
    public void dono(String dono) {
        if (dono == "dono"){
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }
    
    public void idadePeso(String idade, String peso) {
        if (idade == "novo" && peso == "leve"){
            System.out.println("Abanar");
        } else if (idade == "novo" && peso == "pesado") {
            System.out.println("Latir");
        } else if (idade == "velho" && peso == "leve") {
            System.out.println("Rosnar");
        } else if (idade == "valho" && peso == "pesado") {
            System.out.println("ignorar");
        } else {
            System.out.println("erro");
        }
   
    }
}