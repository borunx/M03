/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superficietotalcasa;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class SuperficieTotalCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int metros_cuadrados,cont = 0;
        char resposta;
        
        //Scanner
        Scanner teclado = new Scanner (System.in);
        
        //bucle
        do {
            System.out.print("Metres cuadrats habitació: ");
            metros_cuadrados = teclado.nextInt();
            teclado.nextLine();
            //System.out.println(metros_cuadrados);
            System.out.print("Tens mes habitacions: ");
            resposta = teclado.nextLine().charAt(0);
            
            cont = cont + metros_cuadrados;
        } while (resposta == 's' || resposta == 'S');
        System.out.println("La teva casa mideix " + cont + "metres cuadrats");
    }
    
}
