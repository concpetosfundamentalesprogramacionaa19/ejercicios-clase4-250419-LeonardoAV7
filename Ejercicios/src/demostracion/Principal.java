/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;

import java.util.Scanner;

/**
 *
 * @author Leonardo Aguilar
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        // Declaramos las variables
        int mensajes;
        double total;
        double mensajes_40;
        double mensajes_200;
        double totalFinal;
        
        // Solicitamos ingresar el numero de mensajes enviados en el mes
        System.out.println("Ingrese el numero de mensajes enviados en el mes:");
        mensajes = entrada.nextInt();
        
        
        if (mensajes <= 40){ // Si son maximo 40 mensajes solo se cobra $3
            total = 3;
        }else{
            if(mensajes > 40 && mensajes <= 200){ // Cuando va de 40 hasta 200 
                mensajes_40 = mensajes - 40;      // Sacamos el exceso y lo 
                total = 3 + (mensajes_40 * 0.05); // multiplicamos por 5 cent.
            }else{
                mensajes_200 = mensajes - 200;  // Sacamos el exceso de los 
                                                // que pasan de 200
                mensajes_40 = 160 * 0.05;       // El valor de los 160 mensajes 
                                                // que valen 5 cent.
                total = 3 + mensajes_40 +(mensajes_200 * 0.1);  // sumamos los  
                                                                // valores base
                                                                // mas el valor 
                                                                // del exceso
            }                                                   // de 200
        }
        
        // Le agregamos el IVA al precio a pagar
        totalFinal= total +(total * 0.12);
        // Visualizamos el total mensual a pagar
        System.out.printf("El valor mensual final a pagar es: %.2f \n", 
                totalFinal);
        
    }
}
