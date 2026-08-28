/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciafiguras;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public abstract class Figuras {
    int lado, base, altura, contador=1;
    final double pi = 3.1416;
    double area, radio, perimetro, diametro;
    
    //Entrada de Datos
    Scanner entrada = new Scanner(System.in);
    
    abstract void area();
    
    abstract void perimetro();
   
    
}