/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer4;

import java.util.Scanner;

/**
 *
 * @author rusve
 */
public class POOER4 {

    public static void main(String[] args) {
        int edad_juan, edad_alberto, edad_ana, edad_mama;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese edad de Juan");
        edad_juan = entrada.nextInt();
        edad_alberto = 2 * (edad_juan/3);
        edad_ana = 4 * (edad_juan/3);
        edad_mama = edad_juan + edad_alberto + edad_ana;
        
        System.out.println("La edad de la mamá es: " + edad_mama);
        System.out.println("La edad de Juan es: " + edad_juan);
        System.out.println("La edad de Alberto es: " + edad_alberto);
        System.out.println("La edad de Ana es: " + edad_ana);
        
    }
}

