/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacioambmenu;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class AplicacioAmbMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int opcion, copiar, cont=0, cuentAtras, num1, num2;
        
        //menu
        System.out.println("******* MENU *******");
        System.out.println("0-Salir");
        System.out.println("1-Escribir 10 veces");
        System.out.println("2-Cuenta atrás timbre");
        System.out.println("3-Numero pares entre 2 valores");
        System.out.print("Elije una opción: ");
        
        //scanner
        Scanner teclado = new Scanner (System.in);
        opcion = teclado.nextInt();
        
        //if
        if (opcion == 0) 
        {
            System.out.println("Fin del programa");
        }
        else if (opcion == 1) 
        {
            for (copiar= 1; copiar <= 10; copiar++) {
                cont++;
                System.out.println(cont + ".A clase se viene a trabajar");
            }
        }
        else if (opcion == 2) 
        {
            for (cuentAtras = 10; cuentAtras >= 0; cuentAtras--) {
                System.out.print(cuentAtras + " ");
            }
            System.out.print("RIIIIINGGGG!!!!!");
        }
        else if (opcion == 3) 
        {   System.out.print("Posa el primer numero: ");
            num1 = teclado.nextInt();
            System.out.print("Posa el segon numero: ");
            num2 = teclado.nextInt();
            
            System.out.println("numero 1 = " + num1);
            System.out.println("numero 2 = " + num2);
            
            if (num1 > num2) 
            {
                while (num2 <= num1) 
                {
                    num2++;
                    if (num2 % 2 == 0) 
                    {
                        System.out.print(num2 + " ");
                    }
                }
            }
            else 
            {
                while (num1 <= num2) 
                {
                    num1++;
                    if (num1 % 2 == 0) 
                    {
                        System.out.print(num1 + " ");
                    }
                }
            }
        }
        else 
        {
            System.out.println("Opcion No Valida");
        }
    }
    
}
