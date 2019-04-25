/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import paquetedos.Operacion;
/**
 *
 * @author Leonardo Aguilar
 */
public class SeleccionSimple {
    public static void main(String[] args) {
        // Metodo principal
        // Importamos el scanner
        Scanner entrada = new Scanner(System.in);
        
        // Declaramos las variables
        String miMensaje = Operacion.mensaje;
        int calificacion;
        int calificacion_2;
        
        // Ingresamos por teclado la primera nota
        System.out.println("Ingrese su nota: ");
        calificacion = entrada.nextInt();
        
        if (calificacion >=85){
            System.out.printf("%s %d\n",miMensaje, calificacion );
        }
        
        // Ingresamos por teclado la segunda nota
        System.out.println("Ingrese su nota: ");
        calificacion_2 = entrada.nextInt();
        
        if (calificacion_2 >=85){
            System.out.printf("%s %d\n", miMensaje, calificacion_2 );
        }
        
             
    } 
    
}
