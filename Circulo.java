/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udes.edu.co.taller_clase_b2;

/**
 *
 * @author LabSispc02
 */
public class Circulo {
       private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }
}
