/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import paquetedos.Operacion2;
/**
 *
 * @author Junior Aguilar
 */
public class SeleccionAnidada {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String miMensaje = Operacion2.mensaje;
        String miMensaje2 = Operacion2.mensaje2;
        String miMensaje3 = Operacion2.mensaje3;
        String miMensaje4 = Operacion2.mensaje4;
        String miMensaje5 = Operacion2.mensaje5;
        int calificacion;
        
        System.out.println("Ingrese su calificacion: ");
        calificacion = entrada.nextInt();
        
        if (calificacion >= 90){
            System.out.printf("%s%s %d\n",miMensaje,miMensaje3, calificacion );
        }else{
            if (calificacion < 90 && calificacion >= 80){
                System.out.printf("%s%s %d\n",miMensaje,miMensaje4, calificacion );
            }else{
                if (calificacion < 80 && calificacion >= 50){
                    System.out.printf("%s%s %d\n",miMensaje,miMensaje5, calificacion );
                }else{
                    System.out.printf("%s %d\n",miMensaje2, calificacion );
                }
            }
        }
        
    }
}
