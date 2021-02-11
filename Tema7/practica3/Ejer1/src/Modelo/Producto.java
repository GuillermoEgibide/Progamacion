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
public class Producto {
    private String Nombre;
    private int NumUnidades;
    private double PrecioUnitario;
    
    private ArrayList<Proveedores> listaProveedores;

    public Producto(String Nombre, int NumUnidades, double PrecioUnitario) {
        this.Nombre = Nombre;
        this.NumUnidades = NumUnidades;
        this.PrecioUnitario = PrecioUnitario;
    }

    public Producto(String Nombre, int NumUnidades, double PrecioUnitario, ArrayList<Proveedores> listaProveedores) {
        this.Nombre = Nombre;
        this.NumUnidades = NumUnidades;
        this.PrecioUnitario = PrecioUnitario;
        this.listaProveedores = listaProveedores;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumUnidades() {
        return NumUnidades;
    }

    public void setNumUnidades(int NumUnidades) {
        this.NumUnidades = NumUnidades;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public ArrayList<Proveedores> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(ArrayList<Proveedores> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }
   
    @Override
    public String toString() {
        return "Proveedores{" + "Nombre=" + Nombre + ", NumUnidades=" + NumUnidades + ", PrecioUnitario=" + PrecioUnitario + '}';
    }
}
