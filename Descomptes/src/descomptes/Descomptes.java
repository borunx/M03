/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descomptes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Descomptes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double factura;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Cuanto has gastado en el supermercado: ");
        factura = entrada.nextDouble();
        
        if (factura < 800) 
        {
            System.out.println("No te aplican descuento");
        }
        else if ((factura > 800) && (factura < 1500))
        {
            System.out.println("Tienes un descuento del 6%");
            factura = factura - (factura * 0.06);
        }
        else if ((factura > 1500) && (factura <= 3000))
        {
            System.out.println("Tienes un descuento del 8%");
            factura = factura - (factura * 0.08);
        }
        else if (factura > 3000)        
        {
            System.out.println("Tienes un descuento del 10%");
            factura = factura - (factura * 0.1);
        }
        System.out.println("La compra te saldra a:  " + factura);
    }
    
}
