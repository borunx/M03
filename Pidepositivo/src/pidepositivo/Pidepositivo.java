/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pidepositivo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Pidepositivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El numero positivo es " + positivo());
    }
    public static int positivo () 
    {
        int n1;
        Scanner sc = new Scanner (System.in);
        do 
        {
            System.out.println("Pon un numero positivo");
            n1 = sc.nextInt();
            
            if (n1 < 0) 
            {
                System.out.println("Incorrecto, el numero es negativo");
            }
        } while (n1 < 0);
        return n1;
    }
    
}
