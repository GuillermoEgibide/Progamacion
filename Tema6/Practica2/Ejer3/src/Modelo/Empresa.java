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
public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleado;
    private ArrayList<Cliente> cliente;

    public Empresa() {
    }

    public Empresa(String nombre, ArrayList<Empleado> empleado, ArrayList<Cliente> cliente) {
        this.nombre = nombre;
        this.empleado = empleado;
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }
            
    
}
