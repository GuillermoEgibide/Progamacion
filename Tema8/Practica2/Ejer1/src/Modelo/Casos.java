/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW12
 */
public class Casos {
    private int numExpediente;
    private LocalDate fechaIncico;
    private LocalDate fechaFinalizacion;
    private Cliente c;
    private ArrayList<Abogado> listaAbogado;


    public Casos() {
    }

    public Casos(Cliente c) {
        this.c = c;
    }

    public Casos(int numExpediente, LocalDate fechaIncico, LocalDate fechaFinalizacion, Cliente c) {
        this.numExpediente = numExpediente;
        this.fechaIncico = fechaIncico;
        this.fechaFinalizacion = fechaFinalizacion;
        this.c = c;
    }

    
    
    public LocalDate getFechaIncico() {
        return fechaIncico;
    }

    public void setFechaIncico(LocalDate fechaIncico) {
        this.fechaIncico = fechaIncico;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
    
    

    public int getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public ArrayList<Abogado> getListaAbogado() {
        return listaAbogado;
    }

    public void setListaAbogado(ArrayList<Abogado> listaAbogado) {
        this.listaAbogado = listaAbogado;
    }

    @Override
    public String toString() {
        return "Casos{" + "numExpediente=" + numExpediente + ", fechaIncico=" + fechaIncico + ", fechaFinalizacion=" + fechaFinalizacion + ", c=" + c + ", listaAbogado=" + listaAbogado + '}';
    }
   
}
