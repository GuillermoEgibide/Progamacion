/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Guillermo
 */
public class Cliente extends Persona{
    private int telefonDeContacto;

    public Cliente() {
    }

    public Cliente(int telefonDeContacto, String nombre, int edad) {
        super(nombre, edad);
        this.telefonDeContacto = telefonDeContacto;
    }

    public int getTelefonDeContacto() {
        return telefonDeContacto;
    }

    public void setTelefonDeContacto(int telefonDeContacto) {
        this.telefonDeContacto = telefonDeContacto;
    }

    @Override
    public String mostrar() {
        return super.toString() + "Cliente{" + "telefonDeContacto=" + telefonDeContacto + '}';
    }
    
    
}
