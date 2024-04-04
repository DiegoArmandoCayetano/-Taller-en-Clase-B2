/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package udes.edu.co.taller_clase_b2;

import java.time.LocalDate;

/**
 *
 * @author LabSispc02
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     // Persona
        Persona años = new Persona(LocalDate.of(1980, 2, 3));
        int[] edad = años.calcularEdad();
        System.out.println("Edad: " + edad[0] + " años, " + edad[1] + " meses, " + edad[2] + " días");

        // Cuadrado
        Cuadrado cuadrado = new Cuadrado(3);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        // Círculo
        Circulo circulo = new Circulo(7);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        // Triángulo
        Triangulo triangulo = new Triangulo(5, 6, 9);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        System.out.println("Hipotenusa del triángulo: " + triangulo.calcularHipotenusa());
    }
    
}
