/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 1;
        boolean negativo = false;
        int num;
        Scanner teclado = new Scanner (System.in);
        
        do 
        {
            if (contador<=10) 
            {   
                System.out.println("Pon un numero: ");
                num = teclado.nextInt();
            
            if (num<0) 
            {
                negativo=true;
            }
            contador++;
            }
        } while (contador<=10);
        
        if (negativo=true) 
        {
            System.out.println("Has puesto un negativo");
        }
        else 
        {
            System.out.println("No has puesto ningun negativo");
        }
        
    }
    
}
