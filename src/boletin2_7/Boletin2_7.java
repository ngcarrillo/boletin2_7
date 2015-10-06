/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_7;

import java.util.Scanner;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Introduce el lado del cuadrado");
    Scanner ladoCuadrado = new Scanner(System.in);
    float lado = ladoCuadrado.nextFloat();
    double area = Math.pow(lado, 2); //Calculando la Potencia 
    System.out.println ("El area total del cuadrado es " +area);        
           
    }
    
}
