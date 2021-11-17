/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dimesigno;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class DimeSigno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Pon un numero entero: ");
        a = teclado.nextInt();
        System.out.println(dimeSigno(a));
        
    }
    public static int dimeSigno(int a) {
        if (a > 0) 
        {
            a = 1;
        }
        else if (a == 0) 
        {
            a = 0;
        }
        else if (a < 0) 
        {
            a = -1;
        }
        else 
        {
            System.out.println("Opcion no valida");
        }
        return a;
    }
    
}
