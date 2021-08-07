/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author 59399
 */
public class Punto {
    
    private int x;
    private int y;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
   
    public double distanciaEntreDosPuntos(int x1 , int x2 , int y1 , int y2 ){
        
        double d;
        d=Math.sqrt((Math.pow(((double)(x2)- (double)(x1)),2))+(Math.pow(((double)(y2)- (double)(y1)),2)));
        return d; 
        
    }
            
}
