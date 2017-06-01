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
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        //Arreglos
        //Declarar variables
         int limit, fact=1;
        System.out.println("Ingrese el limite del arreglo");
        limit = datos.nextInt();
        // para declarar un arreglo.
        int [] lista;
        lista = new int [limit];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("ingrese el numero  "+i);
            lista[i] = datos.nextInt();
        }
        // para sacar el umero par y en numero impar.
        for (int i = 0; i < lista.length; i++) {
         if (lista[i] % 2 == 0){
           System.out.println("Numero par");
         }else{
           System.out.println("Numero impar");
           // para sacar el factorial
            if(lista[i]<=5){
             System.out.println(lista[i]+"!");
             while(lista[i]==0){
              fact=fact*i;
              i--;
                    }
                }
                fact=1;
            }
        }
        
    }
}
