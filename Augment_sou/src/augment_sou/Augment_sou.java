/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package augment_sou;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Augment_sou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sueldo;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Cuanto cobras: ");
        sueldo = entrada.nextDouble();
        
        if (sueldo < 18000) 
        {
            sueldo = sueldo + (sueldo * 0.12);
        }
        //System.out.println(sueldo);
        else if ((sueldo > 18000) && (sueldo < 30000)) 
        {
            sueldo = sueldo + (sueldo * 0.10);
        }
        else if ((sueldo > 30000) && (sueldo < 45000)) 
        {
            sueldo = sueldo + (sueldo * 0.08);
        }
        else if (sueldo >= 45000) 
        {
            sueldo = sueldo + (sueldo * 0.06);
        }
        System.out.println("El siguiente año tendras el siguiente sueldo: " + sueldo);
    }
    
}
