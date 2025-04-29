package com.mycompany.guilhermefranca;

public class DiasMeses {

    public static void main(String[] args) {
        
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int dia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int i = 0; i < mes.length; i++) {
            
            //System.out.println(mes[i] + " tem " + dia[i] + " dias.");
            System.out.format("%s tem %d dias.\n", mes[i], dia[i]);
            //String mensagem = String.format("%s tem %d dias.", mes[i], dia[i]);
            //System.out.println(mensagem);
            
        }
        
    }
    
}
