/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Burbuja {
    
    private long tiempo_inicio;
    private long tiempo_final;
    private long tiempo_total;

    public Burbuja() {
        this.tiempo_final = 0;
        this.tiempo_inicio = 0;
        this.tiempo_total = 0;
    }
    
    public void ordenar (double[] datos){
        this.tiempo_inicio = System.currentTimeMillis();
        double temp;
        for (int i = 1; i < datos.length;i++)
            for(int j=0; j < datos.length-1;j++){
                // preguntamos
                if(datos[j]>datos[j+1]){
                    temp = datos[j];
                    datos[j]=datos[j+1];
                    datos[j+1] = temp;
                }
            }
       this.tiempo_final = System.currentTimeMillis();
       this.tiempo_total = this.tiempo_final-this.tiempo_inicio;
        
    }

    public long getTiempo_total() {
        return tiempo_total;
    }
    
    
    
     
}
