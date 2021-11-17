/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramultidivi;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CalculadoraMultiDivi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1,valor2;
        int resultado=0; //operacion 
        int opcion;
        double resultadoDiv = 0;
        System.out.println("Pon el primer valor ");
        valor1 = sc.nextInt();
        System.out.println("Pon el segundo valor ");
        valor2 = sc.nextInt();
        System.out.println("1.- Calcular multiplicación");
        System.out.println("2.- Calcular división");
        System.out.print("Pon opcion ");
        opcion = sc.nextInt();
        
        if (opcion == 1)
        {
            resultado = multiplicacio(valor1, valor2);
            System.out.println("El resultado de la operación elegida es " + resultado);
        }
        else if (opcion == 2) 
        {
            resultadoDiv = divisio(valor1, valor2);
            System.out.println("El resultado de la operación elegida es " + resultadoDiv);
            //resultadoDiv = resultado;
        }
    }
    public static int multiplicacio(int valor1, int valor2) 
    {
        return valor1 * valor2;
    } 
    public static double divisio(double valor1, double valor2) 
    {
        return (valor1 / valor2);
    } 
}
