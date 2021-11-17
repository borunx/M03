/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedir0;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Pedir0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, acumulandoSuma = 0;
        boolean finalBucle = false;
        Scanner teclado = new Scanner (System.in);
        
        do 
        {
            System.out.println("Boolean: Introduce numeros cuando acumulado sume mas de 100: ");
            num = teclado.nextInt();
            acumulandoSuma = acumulandoSuma + num;
            
            if (acumulandoSuma>=100) 
            {
                finalBucle = true;
            }
        }while (!finalBucle); 
                
        System.out.println("El total de la suma es " + acumulandoSuma);

    }
    
}
