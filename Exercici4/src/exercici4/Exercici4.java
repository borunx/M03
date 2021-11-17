/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Pon el primer numero:");
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Pon el segundo numero:");
        
        int num1 = entrada1.nextInt();
        int num2 = entrada2.nextInt();
        
        int sumar, restar, producto;
        double dividir;
        sumar = num1 + num2;
        restar = num1 - num2;
        dividir = (double) num1 / num2;
        producto = num1 % num2;
        
        System.out.println("Suma = " + sumar);
        System.out.println("resta = " + restar);
        System.out.println("División = " + dividir);
        System.out.println("Producto = " + producto);
    }
    
}
