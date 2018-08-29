/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

import java.util.ArrayList;
import ordenamiento.Algoritmo;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Comparador {
    
    private int cantidadComparaciones;
    private Grafica grafica;

    public Comparador(int cantidadComparaciones) {
        this.cantidadComparaciones = cantidadComparaciones;
        this.grafica = new Grafica("comparacion ordenamientos",
                 "tamaño arreglo", "Tiempo ms");
    }
    
    public void comparar(ArrayList<Algoritmo> algoritmos ){
        ArrayList<Punto[]> coleccionPuntos = new ArrayList<>();
       
        for (int c=0;c<cantidadComparaciones;c++){
         // ejeuación de todos los algoritmos
        double[] datos = GenerarDatos.generarDatosAleatorios(c,501); 
        Punto[] puntos = new Punto[cantidadComparaciones];
        for (Algoritmo algo : algoritmos){
        algo.ordenar(datos.clone());
        puntos[c] = new Punto(x,insert.getTiempo_total());
        
        }
        }
        
        
    }
    
    
    
}
