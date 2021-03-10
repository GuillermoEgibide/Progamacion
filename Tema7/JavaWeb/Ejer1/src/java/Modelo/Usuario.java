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
public class Usuario {
    private String nombre;
    private String DNI;
    
    private ArrayList<Login> listaLogin;

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public ArrayList<Login> getListaLogin() {
        return listaLogin;
    }

    public void setListaLogin(ArrayList<Login> listaLogin) {
        this.listaLogin = listaLogin;
    }
    
    
}
