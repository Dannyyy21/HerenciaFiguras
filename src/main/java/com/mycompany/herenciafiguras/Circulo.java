/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciafiguras;

/**
 *
 * @author usuario
 */
public class Circulo extends Figuras {
    @Override
    void area() {
        System.out.println("Introduce un valor para el radio: \n");
        radio = entrada.nextInt();
        
        //Formula para calcular el área de un rectangulo
        area = pi *(radio * radio);
        System.out.println("El area del circulo es: " +area);
        
    }   
    
    @Override
    void perimetro() {   
        System.out.println("Introduce el valor del diametro: \n");
        diametro = entrada.nextInt();
        perimetro =  pi * diametro;
        System.out.println("El perimetro del circulo es: " +perimetro);
    
    }
    
}