/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        double suma = 0,x,y;
        
        Scanner leerporteclado = new Scanner(System.in);
        
        System.out.println("Digite el valor de X: ");
        x = leerporteclado.nextDouble();
        
        System.out.println("Digite el valor de Y: ");
        y = leerporteclado.nextDouble();
        suma= suma+x;
        x= x +(Math.pow(y, 2)) ;
        
        suma = suma + (x/y);
        
        System.out.println("El valor de la suma es:  "+suma);
        
    }
}
