/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici15;

import java.util.Scanner;

/**
 *
 * 15.	Dibuja un ordinograma que lea tres 
 * números distintos y nos diga cuál es el mayor.
 * @author alumne
 */
public class Exercici15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, n3;
        System.out.println("Posa el primer numero: ");
        Scanner entrada = new Scanner (System.in);
        n1 = entrada.nextInt();
        System.out.println("Posa el segon numero: ");
        Scanner entrada2 = new Scanner (System.in);
        n2 = entrada2.nextInt();
        System.out.println("Posa el tercer numero: ");
        Scanner entrada3 = new Scanner (System.in);
        n3 = entrada3.nextInt();
        
        //System.out.println("hr " + n1);
        //System.out.println("hjhn " + n2);
        //System.out.println("hff " + n3);
        if (n1 > n2 && n1 > n3) {
            System.out.println("El mayor numero es " + n1);
        }
        else if (n2 > n1 && n2 > n3) {
            System.out.println("El mayor numero es " + n2);
        }
        else {
            System.out.println("El mayor numero es " + n3);
        }
    }
    
}
