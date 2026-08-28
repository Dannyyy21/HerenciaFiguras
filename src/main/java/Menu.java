/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciafiguras;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Menu {
    
    Scanner entrada = new Scanner(System.in);
    
    public void menu(){
        
        int operacion = 0;
        
        System.out.println("*** Selecciona una Opcion *** \n"
                + "1-Cuadrado \n"
                + "2-Rectangulo \n"
                + "3-Triangulo \n"
                + "4-Circulo \n"
                + "5-Salir \n\n");
        System.out.println("Selecciona tu opcion: ");
        operacion = entrada.nextInt();
                
        switch(operacion){
    case 1:
        System.out.println("**Area y Perimetro de un Cuadrado**");
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.area();
        cuadrado.perimetro();
        break;

    case 2:
        System.out.println("**Area y Perimetro de un Rectangulo**");
        Rectangulo rec = new Rectangulo();
        rec.area();
        rec.perimetro();
        break;

    case 3:
        System.out.println("**Area y Perimetro de un Triangulo**");
        Triangulo tri = new Triangulo();
        tri.area();
        tri.perimetro();
        break;

    case 4:
        System.out.println("**Area y Perimetro de un Circulo**");
        Circulo cir = new Circulo();
        cir.area();
        cir.perimetro();
        break;

    case 5:
        System.exit(0);
        break;

    default:
        JOptionPane.showMessageDialog(null, "Opcion Invalida!!!");
        break;
}
        
        
        
    }
    public static void main(String args[]){
        
        Menu menu = new Menu();
        menu.menu();
        
    }
}