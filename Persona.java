/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udes.edu.co.taller_clase_b2;

/**
 *
 * @author LabSispc02
 */
import java.time.LocalDate;
import java.time.Period;
public class Persona {
    
   private LocalDate fechaNacimiento;

    public Persona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int[] calcularEdad() {
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento, hoy);
        int[] edad = {periodo.getYears(), periodo.getMonths(), periodo.getDays()};
        return edad;
    }
    
}
