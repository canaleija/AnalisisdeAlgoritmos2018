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
public class InsertSort implements Algoritmo{
    
    private long tiempo_inicio;
    private long tiempo_final;
    private long tiempo_total;

    public InsertSort() {
        this.tiempo_final = 0;
        this.tiempo_inicio = 0;
        this.tiempo_total = 0;
    }
    
    @Override
    public void ordenar (double[] arreglo){
        this.tiempo_inicio = System.currentTimeMillis();
        double aux;
        for(int i=1; i <arreglo.length;i++){	
	for(int j = i; j > 0;j--){
	// comparaciones
	if (arreglo[j]<arreglo[j-1]){
	aux = arreglo[j];
	arreglo[j] = arreglo[j-1];
	arreglo[j-1] = aux;
	
	}
	}

       this.tiempo_final = System.currentTimeMillis();
       this.tiempo_total = this.tiempo_final-this.tiempo_inicio;
        
    }
    }
    @Override
    public long getTiempo_total() {
        return tiempo_total;
    }
    
    
    
    
}
