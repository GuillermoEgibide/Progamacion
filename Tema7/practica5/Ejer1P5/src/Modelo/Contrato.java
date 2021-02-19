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
public class Contrato {
    private String nombre;


    public Contrato(String nombre) {
        this.nombre = nombre;
    }

    public Contrato() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Contrato{" + "nombre=" + nombre + '}';
    }


    
    
}
