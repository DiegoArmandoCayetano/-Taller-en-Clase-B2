/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udes.edu.co.taller_clase_b2;

/**
 *
 * @author LabSispc02
 */
public class Triangulo {
    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularArea() {
        double s = (this.lado1 + this.lado2 + this.lado3) / 2;
        return Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
    }

    public double calcularPerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }

    public double calcularHipotenusa() {
        // Solo aplicable para triángulos rectángulos
        return Math.sqrt(this.lado1 * this.lado1 + this.lado2 * this.lado2);
    }
}
