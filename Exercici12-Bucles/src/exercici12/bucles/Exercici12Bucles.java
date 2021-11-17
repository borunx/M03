/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici12.bucles;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici12Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,acumular,contador;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Posa la base: ");
        a = teclado.nextInt();
        System.out.print("Quin es el seu exponent: ");
        b = teclado.nextInt();
        
        for (contador = 1; contador <= b; contador++) 
        {
            acumular = a * b;
        }
        
        /*while (contador <= b) 
        {
            a = a + b;
            //System.out.println(a);
            contador++;
        }
        System.out.println(a);*/
    }
    
}
