/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guilhermefranca;

/**
 *
 * @author guilf
 */
import java.util.Scanner;

public class GuilhermeFranca {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
                
        double a = 4, b = 5, c = 12, x1, x2, delta;
        
        delta = Math.pow(b, 2)-4*a*c;
        x1 = (-b+Math.sqrt(delta))/(2*a);
        x2 = (-b-Math.sqrt(delta))/(2*a);
        
        if (delta <= 0) {
            System.out.println("Raiz negativa");
        } else {            
            System.out.format("O delta: " + delta);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
        
        entrada.close();
        
    }
}
