/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg8;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ejercicio4 {
     public static void main(String[] args) {
        // ARREGLO
        Scanner datos  = new Scanner(System.in);
        //Declarar variables 
         int limite;
        System.out.println("Ingrese el limite del arreglo");
        limite = datos.nextInt();
        // para declarar un arreglo.
        int [] lista;
        lista = new int [limite];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("ingrese el numero: "+i);
            lista[i] = datos.nextInt();
        }
        
        System.out.println("Orden creciente la lista: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(""+lista[i]);
        }
        
        System.out.println("Orden decreciente la lista: ");
        for (int i = lista.length-1; i >= 0; i--) {
            System.out.println(""+lista[i]);
        }
       
    
     }  
}
