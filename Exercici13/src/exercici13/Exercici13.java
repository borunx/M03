/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici13;

import java.util.Scanner;

/**
 * 13.	Dibuja un ordinograma de un programa que lee dos números y 
 * los visualiza en orden ascendente.
 * @author alumne
 */
public class Exercici13 {

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
        
        if (n1>n2) {
            System.out.println(n2 + ", " + n1);
        }
        else {
            System.out.println(n1 + ", " + n2);
        }
    }
    
}
