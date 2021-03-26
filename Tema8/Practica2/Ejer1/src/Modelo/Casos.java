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
public class Casos {
    private int numExpediente;
    private Cliente c;
    private ArrayList<Abogado> listaAbogado;
    private Juicio j;

    public Casos() {
    }

    public Casos(Cliente c) {
        this.c = c;
    }

    public Juicio getJ() {
        return j;
    }

    public void setJ(Juicio j) {
        this.j = j;
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
        return "Casos{" + "numExpediente=" + numExpediente + ", c=" + c + ", listaAbogado=" + listaAbogado + ", j=" + j + '}';
    }
    
}
