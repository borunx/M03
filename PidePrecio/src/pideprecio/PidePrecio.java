/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pideprecio;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PidePrecio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio;
        int num = 1;
        Scanner teclado = new Scanner (System.in);
        do {
            num++;
            System.out.println("Posa un numero");
            precio = teclado.nextDouble();
            System.out.println("Precio con IVA = " + precioConIVA(precio));
        } while (num <= 5);
            
            
        
    }
    public static double precioConIVA(double precio) {
        precio = precio + (precio * 0.21);
        return precio;
        
    }
}
