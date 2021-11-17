/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapeltijeras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PiedraPapelTijeras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador_jugador = 0, contador_maquina=0;
        
        do {
            int jugada_usuario=tirada_usuario();
            System.out.println("Has elegido...");
            int jugada_maquina=tirar_ordenador();
            System.out.println("La maquina ha elegido...");
            mostrar_jugada(jugada_maquina);

            int ganador = comprobar_quien_gana(jugada_usuario, jugada_maquina);
            System.out.println(ganador);

            if (ganador == 1) 
            {
                contador_jugador=aumentar_contador(contador_jugador);
            }
            else if (ganador == -1)
            {
                contador_maquina=aumentar_contador(contador_maquina);
            }
        } while (seguir_jugando(contador_jugador, contador_maquina));
    }
    public static int tirar_ordenador() {
        int tirada;
        Random r = new Random();
        tirada = r.nextInt(3)+1;
        return tirada;
    }
    public static int tirada_usuario() {
        boolean rango;
        int respuesta;
        Scanner sc = new Scanner (System.in);
        do {
            rango = true;
            System.out.println("Tria un numero (1-3): ");
            respuesta = sc.nextInt();
            
            if(respuesta > 3 || respuesta < 1) 
            {
                rango = false;
            }
            
        } while (rango == false);
        return respuesta;
    }
    public static int comprobar_quien_gana (int tirada_jugador, int tirada_maquina) {
        int resultado = 0;
        if (tirada_jugador == tirada_maquina) 
        {
            resultado = 0;
        }
        else if (tirada_jugador == 1 && tirada_maquina == 2) 
        {
            resultado = -1;
        }
        else if (tirada_jugador == 1 && tirada_maquina == 3) 
        {
            resultado = 1;
        }
        else if (tirada_jugador == 2 && tirada_maquina == 1) 
        {
            resultado = 1;
        }
        else if (tirada_jugador == 2 && tirada_maquina == 3) 
        {
            resultado = -1;
        }
        else if (tirada_jugador == 3 && tirada_maquina == 1) 
        {
            resultado = -1;
        }
        else if (tirada_jugador == 3 && tirada_maquina == 2) 
        {
            resultado = 1;
        }
        
        return resultado;
        
    }
    public static int aumentar_contador (int contador) {
        contador++;
        return contador;
    }
    public static void mostrar_jugada(int jugada) {
        if (jugada == 1) 
        {
            System.out.println("Piedra");
        }
        else if (jugada == 2) 
        {
            System.out.println("Papel");
        }
        else if (jugada == 3) 
        {
            System.out.println("Tijera");
        }
    }
    public static boolean seguir_jugando(int contadorj, int contadorm) {
        if (contadorj >= 5 || contadorm >= 5) 
        {
            return false;
        }
        else 
        {
            return true;
        }
    }
}
