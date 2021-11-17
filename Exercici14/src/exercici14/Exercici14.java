/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici14;

import java.util.Scanner;

/**
 *14.	Dibuja un ordinograma que lee dos números y 
 * nos dice cuál es el mayor o si son iguales.
 * 
 * @author alumne
 */
public class Exercici14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;
        System.out.println("Posa el primer numero: ");
        Scanner entrada = new Scanner (System.in);
        n1 = entrada.nextInt();
        System.out.println("Posa el segon numero: ");
        Scanner entrada2 = new Scanner (System.in);
        n2 = entrada2.nextInt();
        
        if (n1 > n2) {
            System.out.println("El numero " + n1 +" es mayor que " + n2);
        }
        else if (n1 == n2) {
            System.out.println("El numeros son iguals");
        }
        else {
            System.out.println("El numero " + n2 +" es mayor que " + n1);
        }
    }
    
}
