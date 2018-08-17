/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdealgoritmos2018;

import herramientas.Grafica;
import herramientas.Punto;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class AnalisisdeAlgoritmos2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
            Punto[] puntos1 = new Punto[100];
            Punto[] puntos2 = new Punto[100];
            Random ran = new Random();
            for(int x=0; x<100;x++){
              puntos1[x] = new Punto(ran.nextInt(100), ran.nextInt(100));
              puntos2[x] = new Punto(ran.nextInt(100), ran.nextInt(100));
            }
            
            Grafica g = new Grafica("Ejemplo", "n","tiempo");
            g.agregarSerie("Serie1", puntos1);
            g.agregarSerie("Serie2", puntos2);
            g.crearGrafica();
        
    }

  
    
}
