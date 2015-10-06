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
    System.out.println("Se va a calcular la Renta mensual a pagar");
    System.out.println("Introduce los años");
    Scanner añosIntroducidos = new Scanner(System.in) ;
    byte años = añosIntroducidos.nextByte();
    System.out.println ("Introduce el interes anual en %");
    Scanner interesIntroducido = new Scanner(System.in);
    float interes = interesIntroducido.nextFloat();
    System.out.println("Introduce el nominal del prestamo");
    Scanner nominal = new Scanner(System.in);
    float n = nominal.nextFloat();
    int t = años * 12;
    float i = interes/1200;
    //System.out.println("La renta sería " +(n*(Math.pow(1+i,t)*i))/(Math.pow((1+i),t)-1));
    double total = ((n*(Math.pow(1+i,t)*i))/(Math.pow((1+i),t)-1)) ;
    
    System.out.printf("La renta sería %.2f %n",total); // printf se usa para redondear
    // el %.2 son los decimales
    // el f que es de tipo float
           
    }
    
}
