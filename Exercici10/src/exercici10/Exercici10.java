/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici10;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota;
        boolean nota_10 = true;
        Scanner teclado = new Scanner (System.in);
        
        do 
        {
            System.out.println("Posa una nota");
            nota = teclado.nextDouble();
            if (nota == 10) 
            {
                nota_10 = false;
            }
        } while (nota != -1);
        
        if (nota_10 == false) 
        {
            System.out.println("Has posat un 10");
        }
        else if (nota_10 == true) 
        {
            System.out.println("No has posat un 10");
        }
    }
    
}
