/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Guillermo
 */
public class Empleado extends Persona{
    private double sueldoBruto;
   

    public Empleado() {
    }

    public Empleado(double sueldoBruto, String nombre, int edad) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
 
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String mostrar() {
        return super.toString() + "Empleado{" + "sueldoBruto=" + sueldoBruto + '}';
    }
    
}
