/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Enciso Suarez
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        int n1, n2, resultado; // se declaran las variables a usar. 
         Scanner teclado = new Scanner(System.in);
      
        System.out.println("Ingresa primer numero");// se solicita al usuario 
        n1 = teclado.nextInt();// se almacena el valor ingresado en n1
        System.out.println("Ingresa segundo numero");
        n2 = teclado.nextInt();// se almacena el numero ingresado en n2
        resultado = n1+n2;// se realiza la operacion matematica
        System.out.println("el resultado es: "+resultado);// se imprime el resultado al usuario
    }
}
