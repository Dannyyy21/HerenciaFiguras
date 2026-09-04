/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciafiguras;

/**
 *
 * @author dpena
 */
public class Cubo extends Figuras {

    // Formula para calcular el volumen de un Cubo
    @Override
    void area() {

        System.out.println("Introduce el valor de un lado: \n");
        lado = entrada.nextInt();

        area = lado * lado * 6;
        System.out.println("El área del cubo es: " + area);
    }

    @Override
    void perimetro() {

        perimetro = lado * 12;
        System.out.println("El perímetro del cubo es: " + perimetro);
    }

    private void elementos() {

    }
}
