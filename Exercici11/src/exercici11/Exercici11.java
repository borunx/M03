/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici11;

import java.util.Scanner;

/**
 *
 * 11.	Dibuja el ordinograma de un programa que lee 2 números y muestra el mayor.
 * @author alumne
 */
public class Exercici11 {

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
            System.out.println("El nombre mayor es " + n1);
        }
        else {
            System.out.println("El nombre mayor es " + n2);
        }
    }
    
}
