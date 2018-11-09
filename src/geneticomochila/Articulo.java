/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticomochila;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Articulo {
    
    private int peso;
    private double beneficio;

    public Articulo() {
        this.peso = 0;
        this.beneficio =0;
                
    }

    public Articulo(int peso, double beneficio) {
        this.peso = peso;
        this.beneficio = beneficio;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the beneficio
     */
    public double getBeneficio() {
        return beneficio;
    }

    /**
     * @param beneficio the beneficio to set
     */
    public void setBeneficio(double beneficio) {
        this.beneficio = beneficio;
    }
    
    
    
}
