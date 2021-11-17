/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamulti;

/**
 *
 * @author alumne
 */
public class TablaMulti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabla, multiplicador, resultat = 0;
        
        for (multiplicador = 1; multiplicador <=10; multiplicador++) 
        {
            System.out.println("Nueva tabla");
            for (tabla = 1 ; tabla <=10; tabla++) 
            {   
                resultat = tabla * multiplicador;
                System.out.println(tabla + "*" + multiplicador + "=" + resultat);
            }
            
        }
    }
    
}
