/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticomochila;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class OperadoresGenetico {
    
    public static Individuo cruza(Individuo madre,Individuo padre, int capacidadMocila){
   
    Individuo hijo1 = generarIndividuoValido(madre,padre,capacidadMocila);
    Individuo hijo2 = generarIndividuoValido(madre,padre,capacidadMocila);
     
    if (hijo1.getFitness()>hijo2.getFitness()){
    return hijo1;
    }
     return hijo2;
     
    
    }
    
    public static Individuo selecciónAleatorio(ArrayList<Individuo> poblacion, int capacidad){
              
        Random ran = new Random();
        int pos;
        do{
            pos = ran.nextInt(poblacion.size());
        }while(!poblacion.get(pos).esValido(capacidad));
        return poblacion.get(pos);
    }
    
    public static void mutar(Individuo ind){
    
        Random ran = new Random();
        int pos = ran.nextInt(ind.getGenotipo().length);
        if(ind.getGenotipo()[pos]==1){
            ind.getGenotipo()[pos]=0;
        }else {
        ind.getGenotipo()[pos]=1;
        }
       ind.calcualrFitness();
    
    }

    private static Individuo generarIndividuoValido(Individuo madre, Individuo padre, int capacidadMocila) {
     Individuo hijo;  
     int mask[] = new int[madre.getGenotipo().length];
     int genotipo1[] = new int[padre.getGenotipo().length];
     Random ran = new Random();
   
     do{
   
    for(int x=0;x< mask.length;x++)
        mask[x]= ran.nextInt(2);
    
     for(int x=0;x<mask.length;x++){
    if(mask[x]==1){
    genotipo1[x]=madre.getGenotipo()[x];
    }else{
    genotipo1[x]=padre.getGenotipo()[x];
    }
    }
    hijo = new Individuo(genotipo1);
    // validar al individuo 
    //System.out.println(h++);
    }
    while(!hijo.esValido(capacidadMocila));
     return hijo;
    }
}
