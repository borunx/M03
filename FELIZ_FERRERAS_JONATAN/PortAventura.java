/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portaventura;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PortAventura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int persones, adult, infantil; 
        double preu;
        
        //introduir per teclat
        Scanner teclado = new Scanner (System.in);
        System.out.print("Cuantes persones sou? ");
        persones = teclado.nextInt();
        System.out.print("I cuants sou menors? ");
        infantil = teclado.nextInt();
        
        //calculs
        adult = persones - infantil;
        preu = (adult * 20) + (infantil * 10);
       
        //condicions
        if (persones >= 10 && persones <= 25) 
        {
            preu = preu * 0.75;
            System.out.println("Et fan un descompte del 25%");
        }
        else if (persones > 25) 
        {
            adult = adult - 1;
            preu = (adult * 20) + (infantil * 10);
            preu = preu * 0.75;
            System.out.println("Et regalen una entrada i un descompte del 25%");
        }
        System.out.println("El preu final són " + preu);
    }
    
}
