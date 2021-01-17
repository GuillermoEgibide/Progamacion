/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Guillermo
 */
public class Estudio {
    private String nombre;
    private String ciudad;
    private String direccion;
    private String drWeb;
    private Date fechaFundacion;
    private String pais;
    private ArrayList<String> Telefono;

    public Estudio() {
    }

    public Estudio(String nombre, String ciudad, String direccion, String drWeb, Date fechaFundacion, String pais, ArrayList<String> Telefono) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.drWeb = drWeb;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;
        this.Telefono = Telefono;
    }

    public void modificaEstudio() {
    
    }
    
    public void cierraEstudio() {
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDrWeb() {
        return drWeb;
    }

    public void setDrWeb(String drWeb) {
        this.drWeb = drWeb;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<String> getTelefono() {
        return Telefono;
    }

    public void setTelefono(ArrayList<String> Telefono) {
        this.Telefono = Telefono;
    }
    
    
}
