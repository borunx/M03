/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaraleatorios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class GenerarAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Random r = new Random();
        int aleatorio = r.nextInt(20)+1;
        int adivinar;
        //System.out.println(aleatorio);
        do {
            System.out.print("Quin numero he escollit: ");
            adivinar = teclado.nextInt();

            if (aleatorio == adivinar) 
            {
                System.out.println("Has encertat");
            }
            else if (aleatorio <= adivinar) 
            {
                System.out.println("Inferior");
            }
            else if (aleatorio >= adivinar) 
            {
                System.out.println("Superior");
            }
        } while (aleatorio != adivinar);
    }
    
}
