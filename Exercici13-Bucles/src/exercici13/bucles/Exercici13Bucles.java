/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici13.bucles;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Exercici13Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int minimo = 1, maximo = 100;
        int numAdivina;
        
        do
        {
            numAdivina = (minimo + maximo)/2;
            System.out.println("El umero adivina es " + numAdivina);
            System.out.println("Mayor (M), inFerior (F), Igual (I) al numero " + numAdivina);
        //char respuesta = 'A';
        Scanner respuesta = new Scanner (System.in);
            
        } while()
    }
    
}
