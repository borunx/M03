/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici12;

import java.util.Scanner;

/**
 *
 * 12.	Dibuja el ordinograma de un programa que lee un número y 
 * me dice si es positivo o negativo, consideraremos el cero como positivo.
 * @author alumne
 */
public class Exercici12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Posa un numero: ");
        n1 = entrada.nextInt();
        
        if (n1 >= 0) {
            System.out.println("Es positivo");
        }
        else {
            System.out.println("Es negativo");
        }
    }
    
}
