/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.println("Cual es el radio?");
         double radio = entrada.nextDouble();
         double pi = 3.1416;
         double longitud = 2 * radio * pi;
         double area = pi * (radio * radio);
         double volumen = 4/3 * pi * (radio * radio * radio);
         System.out.println("Longitud = " + longitud);
         System.out.println("Area = " + area);
         System.out.println("Volumen = " + volumen);
    }
    
}
