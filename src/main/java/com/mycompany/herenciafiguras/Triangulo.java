/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciafiguras;

/**
 *
 * @author usuario
 */
public class Triangulo extends Figuras {
    
    @Override
    void area() {
        System.out.println("Introduce un valor para la base: \n");
        base = entrada.nextInt();
        
        System.out.println("Introduce  un valor para altura: \n");
        altura = entrada.nextInt();
        
        //Formula para calcular el área de un triangulo
        area = (base*altura)/2;
        System.out.println("El area del triangulo es: " +area);
        
    }   
    
    @Override
    void perimetro() { 
   
    while (contador <= 3) {
    System.out.println("Introduce el valor del lado del triangulo");
    lado = entrada.nextInt();

    perimetro = perimetro + lado;
    contador++;
}

System.out.println("El perimetro del triangulo es: " + perimetro);
    }
    
}