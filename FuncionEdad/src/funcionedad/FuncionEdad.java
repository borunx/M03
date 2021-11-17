/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionedad;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class FuncionEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El numero mes petit es " + minimo());
    }
    public static int minimo(int a, int b) 
    {
        int mayor, menor;
        Scanner num = new Scanner (System.in);
        System.out.println("Posa el primer numero");
        a = num.nextInt();
        System.out.println("Posa el segundo numero");
        b = num.nextInt();
        
        if (a > b) 
        {
            mayor = a;
            menor = b;
        }
        else 
        {
            mayor = b;
            menor = a;
        }
        return menor;
    }
    
}
