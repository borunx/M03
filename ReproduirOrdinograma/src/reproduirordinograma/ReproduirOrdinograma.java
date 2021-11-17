/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reproduirordinograma;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ReproduirOrdinograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Posa un numero: ");
        num = teclado.nextInt();
        
        if (num % 2 == 0) 
        {
            if (num % 3 == 0) 
            {
                System.out.println("numero par y divisible por 3");
            }
            else 
            {
                System.out.println("numero par");
            }
        }
        else 
        {
            System.out.println("numero impar");
        }
    }
    
}
