/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cr_eleccion;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CR_Eleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char eleccion;
        int copas;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Cuantas copas tines? ");
        copas = entrada.nextInt();
        
        entrada.nextLine(); //limpiar el bufer
        
        if (copas < 2000) 
        {
            System.out.println("Escoge entre mago electrico(M/m) y esbirro(E/e): ");
            eleccion = entrada.nextLine().charAt(0);
            
            //eleccion mego electrico
            if ((eleccion == 'M') || (eleccion == 'm')) 
            {
                System.out.println("Has elegido mago electrico");
            } 
            // eleccion esbirro
            else if ((eleccion == 'E') || (eleccion == 'e')) 
            {
                System.out.println("Has elegido esbirro");
            } 
            //opcion incorrecta
            else 
            {
                System.out.println("Opcion incorrecta");
            }
        } 
        
        //entrada.nextLine();
        else if (copas >= 2000 && copas <3000) 
        {
            System.out.println("Escoge entre caballero(C/c) y principe(P/o):");
            eleccion = entrada.nextLine().charAt(0);
            
            //principe
            if ((eleccion == 'P') || (eleccion == 'p')) 
            {
                System.out.println("Has elegido principe");
            } 
            
            else if ((eleccion == 'C') || (eleccion == 'c')) 
            {
                System.out.println("Has elegido caballero");
            } 
            else 
            {
                System.out.println("Opcion incorrecta");
            }
        }
        else //copas mes de 3000
        {
            System.out.println("Escoge entre ejercito de esqueletos (E/e) y Gigante(G/g):");
            eleccion = entrada.nextLine().charAt(0);
            
            //ejercito de esqueletos
            if ((eleccion == 'E') || (eleccion == 'e')) 
            {
                System.out.println("Has elegido ejercito de esqueletos");
            } 
            
            else if ((eleccion == 'G') || (eleccion == 'g')) 
            {
                System.out.println("Has elegido gigante");
            } 
            else 
            {
                System.out.println("Opcion incorrecta");
            }
        }
                
                
        /*System.out.print("Elige entre 1 (esbirro) y 0 (mago electrico): ");
        eleccion = entrada.nextInt();
        
        if (eleccion==0) {
            System.out.println("Has elegido mago electrico");
        }
        else if (eleccion==1) {
            System.out.println("Has elegido esbirro");
        }
        else {
            System.out.println("Opcion incorrecta");
        }*/
        
        
        
    }
    
}
