/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millas;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Millas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double milles;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Pasa de milles a kilometres");
        milles = teclado.nextDouble();
        System.out.println(millas_a_kilometros(milles) + " kilometres");
    }
    public static double millas_a_kilometros(double milles) {
        double total;
        total = milles * 1.60934;
        return total;
    }
    
}
