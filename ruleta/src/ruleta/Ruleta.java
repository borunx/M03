/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruleta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int dinero_tengo=0;
        //Pedir_numero_apuesta();
        //pedir_dinero_apuesta(dinero_tengo);
    }
    public static int Tirar_bola() {
        int tirada;
        Random r = new Random();
        tirada = r.nextInt(37);
        return tirada;
    }
    public static int Pedir_numero_apuesta() {
        int num_apuesta, aceptar;
        Scanner teclado = new Scanner (System.in);
        
        do {
            aceptar = 1;
            System.out.println("Pon un valor entre 0 y 38 (38 par y 37 impar)");
            num_apuesta = teclado.nextInt();
            
            if (num_apuesta < 0 || num_apuesta > 38) 
            {
                aceptar = 0;
            }
        } while (aceptar == 0);
        
        return num_apuesta;              
    }
    public static int pedir_dinero_apuesta(int dinero_tengo) {
        int dinero_disponible=50, seguir;
        Scanner teclado = new Scanner (System.in);
        
        do {
            seguir=1;
            System.out.println("Cuanto dinero quieres apostar?");
            dinero_tengo = teclado.nextInt();
            
            if (dinero_tengo < 0) 
            {
                System.out.println("Tiene que ser positivo");
                seguir = 0;
            }
            else if (dinero_tengo > dinero_disponible) 
            {
                System.out.println("No tiene fondos suficientes");
                seguir = 0;
            }
        } while (seguir==0);
        
        return dinero_tengo;
    }
    /*public static boolean Comprobar_resultado(int numero_apostado, int bola) {
        
    }*/
    public static int Calcular_premio(int num_apostado,int cantidad) {
        if (num_apostado == 38 || num_apostado == 37) 
        {
            cantidad = cantidad * 2;
        }
        else  
        {
            cantidad = cantidad * 36;
        }
        
        return cantidad;
    }
    public static int Actualizar_dinero(int dinero_tienes, int dinero_ganado, boolean ganado) {
        if (ganado == true) 
        {
            dinero_tienes = dinero_tienes + dinero_ganado;
        }
        else if (ganado == false) 
        {
            dinero_tienes = dinero_tienes - dinero_ganado;
        }
        return dinero_tienes;
        
    }
    
}
