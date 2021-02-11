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
    private String nombre;
    private int NumUnidades;
    private float precio;
    private ArrayList<Proveedores> listaProveedor;

    public Producto(String nombre, int NumUnidades, float precio) {
        this.nombre = nombre;
        this.NumUnidades = NumUnidades;
        this.precio = precio;
    }
    
    public Producto(String nombre, int NumUnidades, float precio, ArrayList<Proveedores> listaProveedor) {
        this.nombre = nombre;
        this.NumUnidades = NumUnidades;
        this.precio = precio;
        this.listaProveedor = listaProveedor;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumUnidades() {
        return NumUnidades;
    }

    public void setNumUnidades(int NumUnidades) {
        this.NumUnidades = NumUnidades;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public ArrayList<Proveedores> getListaProveedor() {
        return listaProveedor;
    }

    public void setListaProveedor(ArrayList<Proveedores> listaProveedor) {
        this.listaProveedor = listaProveedor;
    }
    
    
}
