/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversor2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Conversor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double criptos;
        int tipo;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Cuantas criptomonedas tienes? ");
        criptos = teclado.nextDouble();
        System.out.println("Son Bitcoin(0) o XMR(1): ");
        tipo = teclado.nextInt();
        
        if (tipo == 0) 
        {
            criptos = criptos * 49561;
            System.out.println("Tus Bitcoins en euros son " + criptos);
        }
        else if (tipo == 1) 
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
