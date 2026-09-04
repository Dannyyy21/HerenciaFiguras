/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciafiguras;

/**
 *
 * @author dpena
 */
public class Piramide extends Figuras {

    // Formula para calcular el área de una Pirámide Triangular
    @Override
    void area() {

        System.out.println("Introduce el valor de un lado: \n");
        lado = entrada.nextInt();

        area = lado * lado;
        System.out.println("El área de la pirámide triangular es: " + area);
    }

    @Override
    void perimetro() {

        perimetro = lado * 3;
        System.out.println("El perímetro de la base triangular es: " + perimetro);
    }

    private void elementos() {

    }
}
