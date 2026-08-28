/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciafiguras;
/**
 *
 * @author usuario
 */
public class Cuadrado extends Figuras{
    //Formula para calcular el area de un Cuadrado
    @Override
    void area() {
        
        
        System.out.println("Introduce el valor de un lado: \n");
        lado = entrada.nextInt();
        area = lado*lado;
        System.out.println("El área del cuadrado es: " +area);
    
    }
        
    @Override
    void perimetro(){
        perimetro = lado * 4;
        System.out.println("El perimetro del cuadrado es: "+perimetro);
        
    }    
    
    private void elementos(){
        
    }
}