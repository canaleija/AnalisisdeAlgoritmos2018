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
public interface Algoritmo {
    void ordenar (double[] datos);
    long getTiempo_total();
}
