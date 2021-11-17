/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfor;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int multiplicador;
        System.out.println("Que tabla de multiplicar quieres: ");
        Scanner teclado = new Scanner (System.in);
        num = teclado.nextInt();
        
        //for
        for (multiplicador = 1; multiplicador < 11; multiplicador++) {
            System.out.println(num + "x" + multiplicador + "=" + (num*multiplicador));
        }
        
        System.out.println("con el while");
        //while
        multiplicador = 1;
        while (multiplicador < 11) {
            System.out.println(num + "x" + multiplicador + "=" + (num*multiplicador));
            multiplicador++;
        }
    }
    
}
