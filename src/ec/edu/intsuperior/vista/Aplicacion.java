/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Circulo;
import ec.edu.intsuperior.modelo.Punto;
import java.util.Scanner;

/**
 *
 * @author 59399
 */
public class Aplicacion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Punto p1 = new Punto(5, 7);
        Punto p2 = new Punto();

        System.out.println("Ingresa el valor del punto 1 : ");
        p2.setX(input.nextInt());
        p2.setY(input.nextInt());
        System.out.println("La distancia entre los puntos son : "
                + p1.distanciaEntreDosPuntos(p1.getX(), p2.getX(), p1.getY(), p2.getY()));
        Circulo c1 = new Circulo(5, p1);
        
        System.out.println("El area del circulo es : "+c1.areaCirculo());
        

    }

}
