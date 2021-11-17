/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici17;

import java.util.Scanner;

/**
 *
 * 17.	Dibuja un ordinograma que recibe como datos de entrada una hora expresada en horas, minutos y segundos
 * que nos calcula y escribe la hora, minutos y segundos que serán, transcurrido un segundo.
 * @author alumne
 */
public class Exercici17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas, minutos, segundos;
        Scanner tiempo = new Scanner (System.in);
        System.out.print("Expresa la hora: ");
        horas = tiempo.nextInt();
        //System.out.println(horas);
        System.out.print("Expresa los minutos: ");
        minutos = tiempo.nextInt();
        //System.out.println(minutos);
        System.out.print("Expresa los segundos: ");
        segundos = tiempo.nextInt();
        //System.out.println(segundos);
        
        segundos = segundos + 1;
        
        if (segundos == 60) {
            segundos = 0;
            minutos = minutos + 1;
            if (minutos == 60) {
                minutos = 0;
                horas = horas + 1;
                if (horas == 24) {
                    horas = 0;
                    System.out.println("La hora complerta es " + horas + "h " + minutos + "min " + segundos + "s");
                }
                else {
                    System.out.println("La hora complerta es " + horas + "h " + minutos + "min " + segundos + "s");
                }
            }
            else {
                System.out.println("La hora complerta es " + horas + "h " + minutos + "min " + segundos + "s");
            }
        }
        else {
            System.out.println("La hora complerta es " + horas + "h " + minutos + "min " + segundos + "s");
        }
    }
    
}
