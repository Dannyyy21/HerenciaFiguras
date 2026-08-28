/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciafiguras;

/**
 *
 * @author usuario
 */
public class Rectangulo extends Figuras{
    
    @Override
    void area() {
        System.out.println("Introduce un valor para la base: \n");
        base = entrada.nextInt();
        
        System.out.println("Introduce  un valor para altura: \n");
        altura = entrada.nextInt();
        
        //Formula para calcular el área de un rectangulo
        area = base*altura;
        System.out.println("El area del rectangulo es: " +area);
        
    }   
    
    @Override
    void perimetro() {    
        perimetro = 2 * (base + altura);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    
    }
    
}
