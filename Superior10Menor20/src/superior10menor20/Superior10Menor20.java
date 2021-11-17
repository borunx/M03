/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superior10menor20;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Superior10Menor20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, num3=1, cont=0, suma=0;
        
        do {
            System.out.println("Posa un numero: ");
            Scanner teclado = new Scanner (System.in);
            num = teclado.nextInt();

            if (num >10 && num <20) 
            {
                num3++;
                suma = suma + num;
            }
            cont++;
        } while (num3 < 4);
        System.out.println("Has introduit en total " + cont + " numeros");
        System.out.println("La suma dels 3 numeros és " + suma);
    }
    
}
