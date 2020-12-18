/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos;

/**
 *
 * @author 1GDAW12
 */
public class Alumno {
    private int codigo;
    private String Nombre;
    private String Domicilio;
    private int Telefono;

    public Alumno() {
    }

    public Alumno(int codigo, String Nombre, String Domicilio, int Telefono) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Telefono=" + Telefono + '}';
    }
    
}
