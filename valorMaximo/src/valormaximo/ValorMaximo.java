/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valormaximo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ValorMaximo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v1, v2, v3;
        Scanner sc = new Scanner (System.in);
        System.out.println("Posa un primer valor: ");
        v1 = sc.nextInt();
        System.out.println("Posa un segon valor: ");
        v2 = sc.nextInt();
        System.out.println("Posa un tercer valor: ");
        v3 = sc.nextInt();
        int major = maximDosValors(v1, v2);
        
        if (major >= v3) 
        {
            System.out.println("El numero major es " + major);
        }
        else 
        {
            System.out.println("El numero major es " + major);
        }
    }
    public static int maximDosValors(int v1, int v2) {
        int major;
        if (v1 >= v2) 
        {
            major = v1;
        }
        else 
        {
            major = v2;
        }
        return major;
    }
}
