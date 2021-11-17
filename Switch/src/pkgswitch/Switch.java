/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("1.Nueva partida");
        System.out.println("2.Cargar partida guardada");
        System.out.println("3.Record");
        System.out.println("0.Salir");
        
        System.out.println("Escoge opción: ");
        
        int opcion;
        Scanner teclado = new Scanner (System.in);
        opcion = teclado.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Empezando partida");
                break;
            case 2:
                System.out.println("Recuperando partida");
                break;
            case 3:
                System.out.println("El record esta en 5000 puntos");
                break;
            case 0:
                System.out.println("Saliendo del juego");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
        
        
        
        
    }
    
}
