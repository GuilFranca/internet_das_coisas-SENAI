package com.mycompany.guilhermefranca;

public class While {

    public static void main(String[] args) {
        
        int cont = 0;
        
        /*
        
        while (cont <= 10) {
            
            cont = cont + 1;
            
            if (cont == 6) {
                continue;
            }
            
            if (cont == 8) {
                break;
            }
            
            System.out.println("x" + cont);
            
        }
        
        */
        
        do {
            System.out.println("x:" + cont);
            cont++;
        } while (cont <= 5);
        
            
    }
    
}
