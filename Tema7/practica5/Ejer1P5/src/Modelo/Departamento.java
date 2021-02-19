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
public class Departamento {
    private String Nombre;


    public Departamento(String Nombre) {
        this.Nombre = Nombre;
    }

    public Departamento() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Departamento{" + "Nombre=" + Nombre + '}';
    }    
    
}
