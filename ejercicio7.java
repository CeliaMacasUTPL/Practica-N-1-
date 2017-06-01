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
public class ejercicio7 {
     public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        //Declarar variables.
        int fact=0;
        int x=0, a=0, b=0;

        System.out.println("Ingrese el limite ");
        int limite = datos.nextInt();
        int [] lista;
        int [] lista_A;
        int [] lista_B;
        lista = new int [limite];
        lista_A = new int [limite];
        lista_B = new int [limite];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("ingrese el valor de la lista [] "+i);
            lista[i] = datos.nextInt();
        }
        
        System.out.println("LISTA A");
        for (int i = 0; i < lista.length; i=i+2) {
            System.out.println(""+lista[i]);
            a=a+lista[i];
            lista_A[x]=lista[i];
            lista_A[x]=a;
            
        }
        System.out.println(""+lista_A[x]);
        System.out.println("suma"+a);
        
        System.out.println("LISTA B");
        for (int i = 1; i < lista.length; i=i+2) {
            System.out.println(""+lista[i]);
            b=lista[i]+b;
            lista_B[x]=lista[i];
            lista_B[x]=b;

            
        }
}
}
