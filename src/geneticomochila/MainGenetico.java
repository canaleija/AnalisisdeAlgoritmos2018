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
public class MainGenetico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Genetico.articulos = new ArrayList<>();
      Genetico.articulos.add(new Articulo(15, 34));
      Genetico.articulos.add(new Articulo(4, 20));
      Genetico.articulos.add(new Articulo(3, 100));
      Genetico.articulos.add(new Articulo(56, 780));
      Genetico.articulos.add(new Articulo(23, 60));
      Genetico.articulos.add(new Articulo(4, 50));
      
      Genetico gen = new Genetico(50, 100000, 0.0003, 6,80);
      gen.evolucionar();
    }
    
}
