/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class GenerarDatos {
    
    public static Random ran = new Random();
   
    public static double[] generarDatosAleatorios (int dim,
                  int limite){
        
        double[] datos = new double[dim];
        for(int i=0; i < dim;i++)
            datos[i]=ran.nextInt(limite);
        
        return datos;
     
    }
    
}
