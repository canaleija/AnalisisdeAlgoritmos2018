/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdealgoritmos2018;

import herramientas.GenerarDatos;
import herramientas.Grafica;
import herramientas.Punto;
import java.util.ArrayList;
import java.util.Random;
import ordenamiento.Burbuja;
import ordenamiento.InsertSort;

/**
 *
 * @author Roberto Cruz Leija
 */
public class AnalisisdeAlgoritmos2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        InsertSort insert = new InsertSort();
        Burbuja burbuja = new Burbuja();
        Punto[] puntos = new Punto[10000];
        Punto[] puntos1 = new Punto[10000];
        for (int x=0;x<10000;x++){
        double[] datos = GenerarDatos.generarDatosAleatorios(x,501);
        insert.ordenar(datos.clone());
        burbuja.ordenar(datos);
        puntos[x] = new Punto(x,insert.getTiempo_total());
        puntos1[x] = new Punto(x,burbuja.getTiempo_total());
        System.out.println(x);
        }
       
        Grafica g = new Grafica("Ejemplo", "n","tiempo");
        g.agregarSerie("SerieInsert", puntos);
        g.agregarSerie("SerieBurbuja", puntos1);
        g.crearGrafica();
        
        
//            Punto[] puntos1 = new Punto[100];
//            Punto[] puntos2 = new Punto[100];
//            Random ran = new Random();
//            for(int x=0; x<100;x++){
//              puntos1[x] = new Punto(ran.nextInt(100), ran.nextInt(100));
//              puntos2[x] = new Punto(ran.nextInt(100), ran.nextInt(100));
//            }
//            
//            Grafica g = new Grafica("Ejemplo", "n","tiempo");
//            g.agregarSerie("Serie1", puntos1);
//            g.agregarSerie("Serie2", puntos2);
//            g.crearGrafica();
//        
    }

  
    
}
