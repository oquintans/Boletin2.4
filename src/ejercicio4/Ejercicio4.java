/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1,num2,suma,resta,producto,div;
        
        System.out.println("Número 1:");
        Scanner dato=new Scanner(System.in);
        num1=dato.nextFloat();
        
        System.out.println("Número 2:");
        num2=dato.nextFloat();
        
        suma=num1+num2;
        System.out.println("Suma="+suma);
        resta=num1-num2;
        System.out.println("Resta="+resta);
        producto=num1*num2;
        System.out.println("Producto="+producto);
        div=num1/num2;
        System.out.println("Cociente="+div);
    
    
    
    
    }
    
}
