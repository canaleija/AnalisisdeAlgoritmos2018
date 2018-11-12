/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticomochila;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Individuo {
    
    private int[]genotipo;
    private double fitness;

    public Individuo(int num) {
        this.genotipo = new int[num];
        generarBytesAleatorios();
        this.fitness = 0;
    }
     public Individuo(Individuo ind) {
        this.genotipo = ind.getGenotipo().clone();
        this.fitness = ind.getFitness();
    }
     public Individuo(int[]genotipo) {
        this.genotipo = genotipo.clone();
        calcualrFitness();
    }

    /**
     * @return the genotipo
     */
    public int[] getGenotipo() {
        return genotipo;
    }

    /**
     * @param genotipo the genotipo to set
     */
    public void setGenotipo(int[] genotipo) {
        this.genotipo = genotipo;
    }

    /**
     * @return the fitness
     */
    public double getFitness() {
        return fitness;
    }

    /**
     * @param fitness the fitness to set
     */
    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    private void generarBytesAleatorios() {
        Random ran = new Random();
        for(int x=0; x<this.genotipo.length;x++){
           this.genotipo[x]=ran.nextInt(2);
        }
        
    }
    
    public boolean esValido(int capacidad){
    // recorrer el genotipo
        int acumulado = 0;
        for(int x=0; x<this.genotipo.length;x++){
            if(genotipo[x]==1){
                  acumulado+=Genetico.articulos.get(x).getPeso();
                if(acumulado>capacidad){
                return false;
            }
            }
          
        }
        return true;
    }
    
    public void calcualrFitness(){
       this.fitness = 0;
    // recorrer el genotipo
        for(int x=0; x<this.genotipo.length;x++){
            if(this.genotipo[x]==1){
                this.fitness+=Genetico.articulos.get(x).getBeneficio();
            }
        }
    }

    @Override
    public String toString() {
       int suma=0;
       for(int x=0;x<genotipo.length;x++){
           if(genotipo[x]==1)
           suma+=Genetico.articulos.get(x).getPeso();
       } 
       String aux = Arrays.toString(genotipo)+" F:"+this.fitness+" E:"+suma;
      return aux;       
    }
    
    
}
