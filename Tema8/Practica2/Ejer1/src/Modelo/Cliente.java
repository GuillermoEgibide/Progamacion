/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 1GDAW12
 */
public class Cliente {
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private String correo; 
    private ArrayList<Casos> listaCasos;

    public Cliente() {
    }

    public Cliente(String dni, String nombre, String apellido, String direccion, int telefono, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Cliente(String dni, String nombre, String apellido, String direccion, int telefono, String correo, ArrayList<Casos> listaCasos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.listaCasos = listaCasos;
    }

    public ArrayList<Casos> getListaCasos() {
        return listaCasos;
    }

    public void setListaCasos(ArrayList<Casos> listaCasos) {
        this.listaCasos = listaCasos;
    }
    
     public void setCasos(Casos c) {
        if (listaCasos == null)
            listaCasos = new ArrayList();
        this.listaCasos.add(c);
    }
     
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
