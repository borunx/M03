/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorbitcoin;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ConversorBitcoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double criptos;
        int tipo;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Cuantas criptomonedas tienes? ");
        criptos = teclado.nextDouble();
        System.out.println("===Menú de conversión===");
        System.out.println("========1. Bitcoins a euros====");
        System.out.println("========2. XMR a euros====");
        System.out.print("Opción:");
        tipo = teclado.nextInt();
        
        if (tipo == 1) 
        {
            criptos = criptos * 49561;
            System.out.println("Tus Bitcoins en euros son " + criptos);
        }
        else if (tipo == 2) 
        {
            criptos = criptos * 233.81;
            System.out.println("Tus XMR en euros son " + criptos);
        }
        else 
        {
            System.out.println("Opción incorrecta");
        }
    }
    
}
