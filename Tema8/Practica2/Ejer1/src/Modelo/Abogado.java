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
public class Abogado {
    private String dni;
    private String nombre;
    private String apellidos;
    private String correo;
    private ArrayList<Casos> listaCasos;

    public Abogado() {
    }

    public Abogado(String dni, String nombre, String apellidos, String correo, ArrayList<Casos> listaCasos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.listaCasos = listaCasos;
    }

    public Abogado(String dni, String nombre, String apellidos, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public void eliminiarCaso(Casos c){
        listaCasos.remove(c);
    }
    
    
}
