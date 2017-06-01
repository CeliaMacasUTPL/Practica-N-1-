/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg8;

/**
 *
 * @author USUARIO
 */
public class ejercicio3 {
       public static void main(String[] args) {
        // ARREGLO
           int [] lista;
        lista = new int [6];
        
        lista[0] = 2;
        lista[1] = 3;
        lista[2] = 21;
        lista[3] = 7;
        lista[4] = 82;
        lista[5] = 90;
         //lenght para que lea automaticamente de cuanto es el arreglo
        for (int i = 0; i < lista.length; i++) {  
            //Presentar en pantalla.
              System.out.println("Lista "+lista[i]);
        }
        
       }  
}
