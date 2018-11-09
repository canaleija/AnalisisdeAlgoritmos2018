/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticomochila;

import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Genetico {
    
    public static ArrayList<Articulo> articulos;
    private int numArticulos;
    private int tamPoblacion;
    private int numGeneraciones;
    private double probMuta;
    private ArrayList<Individuo> poblacionActual;

    public Genetico(int tamPoblacion, int numGeneraciones, double probMuta, int numArt) {
        this.tamPoblacion = tamPoblacion;
        this.numGeneraciones = numGeneraciones;
        this.probMuta = probMuta;
        this.poblacionActual = new ArrayList<>();
        this.numArticulos = numArt;
    }
    
    public void evolucionar(){
        
        // generar una población aleatoria 
        for(int x=0; x<this.tamPoblacion;x++){
            Individuo aux = new Individuo(this.numArticulos);
            aux.calcualrFitness();
            this.poblacionActual.add(aux);
        }
        
        // generamos un proceso evolutivo 
        for(int g=0;g<this.numGeneraciones;g++){
            // construir una población nueva 
            double mejor = -1;
            ArrayList<Individuo> nuevaPoblación = new ArrayList<>();
            for(int i=0;i<this.tamPoblacion;i++){
                Individuo madre = OperadoresGenetico.selecciónAleatorio(this.poblacionActual);
                Individuo padre = OperadoresGenetico.selecciónAleatorio(this.poblacionActual);
                Individuo hijo = OperadoresGenetico.cruza(madre, padre);
                if(Math.random()<=this.probMuta){
                OperadoresGenetico.mutar(hijo);
                }
                if(hijo.getFitness()>mejor)mejor=hijo.getFitness();
                nuevaPoblación.add(hijo);
                
            }
        System.out.println(mejor);
            // atualizar la generación
        this.poblacionActual.clear();
        this.poblacionActual = (ArrayList<Individuo>)nuevaPoblación.clone();
        //this.poblacionActual =() nuevaPoblación.;
      
        }
       
    
    
    }

    private boolean imprimirMasAlto(ArrayList<Individuo> poblacionActual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
