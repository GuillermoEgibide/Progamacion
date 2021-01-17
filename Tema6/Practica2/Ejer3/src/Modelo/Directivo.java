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
public class Directivo extends Empleado {
    private String categoria;
    private ArrayList<Empleado> empleado;
    
    public Directivo() {
    }
    
    public Directivo(String categoria, ArrayList<Empleado> empleado, double sueldoBruto, String nombre, int edad) {
        super(sueldoBruto, nombre, edad);
        this.categoria = categoria;
        this.empleado = empleado;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String mostrar() {
        return super.toString() + "Directivo{" + "categoria=" + categoria + '}';
    }
    
    
}
