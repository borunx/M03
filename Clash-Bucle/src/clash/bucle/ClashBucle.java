/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clash.bucle;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ClashBucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int lenyador, torre, vida=0, dany = 0, golpes=0, ataque_torre = 0, vida_lenyador = 0;
        System.out.print("Quin és el nivell del leñador: ");
        Scanner teclado = new Scanner (System.in);
        lenyador = teclado.nextInt();
        System.out.print("Quin nivell es la torre: ");
        torre = teclado.nextInt();
        
        //Daño leñador
        if (lenyador == 9) 
        {
            dany = 200;
            vida_lenyador = 1060;
        }
        else if (lenyador == 10) 
        {
            dany = 220;
            vida_lenyador = 1166;;
        }
        else if (lenyador == 11) 
        {
            dany = 242;
            vida_lenyador = 1282;
        }
        else if (lenyador == 12) 
        {
            dany = 266;
            vida_lenyador = 1409;
        }
        else if (lenyador == 13) 
        {
            dany = 292;
            vida_lenyador = 1547;
        }
        else 
        {
            System.out.println("Posa un valor correcte");
        }
        
        //Vida torre
        if (torre == 9) 
        {
            vida = 2534;
            ataque_torre = (90*2);
        }
        else if (torre == 10) 
        {
            vida = 2786;
            ataque_torre = (99*2);
        }
        else if (torre == 11) 
        {
            vida = 3052;
            ataque_torre = (109*2);
        }
        else if (torre == 12) 
        {
            vida = 3346;
            ataque_torre = (119*2);
        }
        else if (torre == 13) 
        {
            vida = 3668;
            ataque_torre = (131*2);
        }
        else 
        {
            System.out.println("Posa un valor correcte");    
        }
        
        //Bucle
        //System.out.println("La vida es " + vida + ", el daño es" + dany + "el ataque de torre es" + ataque_torre );
        while (vida > 0) 
        {
            Thread.sleep(500);
            System.out.println("Leñador ataco con fuerza " + dany);
            vida = vida - dany;
            System.out.println("Torre ataco con fuerza " + ataque_torre);
            vida_lenyador = vida_lenyador - ataque_torre;
            //System.out.println("Al leñador le queda de vida " + vida_lenyador);
            //System.out.println("A la torre le queda de vida " + vida);
            golpes++;
        }
        if (vida <= 0)
            {
                System.out.println("Gana el leñador");
            }
            else if (vida_lenyador <= 0) 
            {
                System.out.println("Gana la torre");
            }
        System.out.println("El leñador ha dado " + golpes + " golpes para tumbar la torre");
    }
    
}
