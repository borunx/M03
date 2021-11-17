/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recogerletraporteclado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class RecogerLetraPorTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Eres mayor de edad?(s/n)");
        char mayorEdat;
        int dinero;
        /*Recoge la frase que pongas pero devuelve
        la letra que esta en la primera posición*/
        mayorEdat = entrada.nextLine().charAt(0);
        System.out.println("Has escogido " + mayorEdat);
        System.out.println("Cuanto dinero tienes '(en euros)':");
        dinero = entrada.nextInt();
        
        if((mayorEdat=='s' || mayorEdat=='S') && (dinero>=10))
        {
            System.out.println("Chiste2?");
            System.out.println("Respuesta2");
        }
        else if (mayorEdat=='n' || mayorEdat=='N')
        {
            System.out.println("Chiste?");
            System.out.println("Respuesta");
        }
        else
        {
            System.out.println("Solo puedes poner 's' o 'n'");
        }        
        /*System.out.println("Chiste2?");
        System.out.println("Respuesta2");
        
        System.out.println("Chiste?");
        System.out.println("Respuesta");*/
    }
    
}
