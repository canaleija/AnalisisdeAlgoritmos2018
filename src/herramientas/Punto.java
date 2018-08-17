/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Punto {
    private double x;
    private double y;

    
    public Punto() {
        this.x = 0;
        this.y = 0;
        
    }

    
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    
    
}
