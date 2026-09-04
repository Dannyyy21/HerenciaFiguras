/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciafiguras;

/**
 *
 * @author dpena
 */
public class Esfera extends Figuras {

    // Formula para calcular el área de una Esfera
    @Override
    void area() {

        System.out.println("Introduce el valor del radio: \n");
        lado = entrada.nextInt();

        area = 4 * 3.1416 * lado * lado;
        System.out.println("El área de la esfera es: " + area);
    }

    @Override
    void perimetro() {

        perimetro = 2 * 3.1416 * lado;
        System.out.println("El perímetro de la esfera es: " + perimetro);
    }

    private void elementos() {

    }
}
