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
    
    public static Individuo cruza(Individuo madre,Individuo padre){
    int mask[] = new int[]{1,1,1,0,0,0};
    int genotipo1[] = new int[padre.getGenotipo().length];
    int genotipo2[] = new int[padre.getGenotipo().length];
    Individuo hijo1,hijo2;
     
    for(int x=0;x<mask.length;x++){
    if(mask[x]==1){
    genotipo1[x]=madre.getGenotipo()[x];
    genotipo2[x]=padre.getGenotipo()[x];
    }else{
    genotipo1[x]=padre.getGenotipo()[x];
    genotipo2[x]=madre.getGenotipo()[x];
    
    }
    
    }
    hijo1 = new Individuo(genotipo1);
    hijo2 = new Individuo(genotipo2);
    if (hijo1.getFitness()>hijo2.getFitness()){
    return hijo1;
    }
     return hijo2;
    }
    
    public static Individuo selecciónAleatorio(ArrayList<Individuo> poblacion){
        Random ran = new Random();
        int pos = ran.nextInt(poblacion.size());
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
}
