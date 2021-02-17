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
public class Empleado {
    private String DNI;
    private String NSS;
    private String Nombre_Apellido;
    private String Direccion;
    private String Telefono;
    private String Sexo;
    private String EstadoCivil;
    private ArrayList<Contrato> TipoContrato;
    private ArrayList<Departamento> Departamento;
    private String FechaAlta;
    private int NumeroEmpleado;

    public Empleado(String DNI, String NSS, String Nombre_Apellido, String Direccion, String Telefono, String Sexo, String EstadoCivil, ArrayList<Contrato> TipoContrato, ArrayList<Departamento> Departamento, String FechaAlta, int NumeroEmpleado) {
        this.DNI = DNI;
        this.NSS = NSS;
        this.Nombre_Apellido = Nombre_Apellido;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Sexo = Sexo;
        this.EstadoCivil = EstadoCivil;
        this.TipoContrato = TipoContrato;
        this.Departamento = Departamento;
        this.FechaAlta = FechaAlta;
        this.NumeroEmpleado = NumeroEmpleado;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getNombre_Apellido() {
        return Nombre_Apellido;
    }

    public void setNombre_Apellido(String Nombre_Apellido) {
        this.Nombre_Apellido = Nombre_Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public ArrayList<Contrato> getTipoContrato() {
        return TipoContrato;
    }

    public void setTipoContrato(ArrayList<Contrato> TipoContrato) {
        this.TipoContrato = TipoContrato;
    }

    public ArrayList<Departamento> getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(ArrayList<Departamento> Departamento) {
        this.Departamento = Departamento;
    }

    public String getFechaAlta() {
        return FechaAlta;
    }

    public void setFechaAlta(String FechaAlta) {
        this.FechaAlta = FechaAlta;
    }

    public int getNumeroEmpleado() {
        return NumeroEmpleado;
    }

    public void setNumeroEmpleado(int NumeroEmpleado) {
        this.NumeroEmpleado = NumeroEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "DNI=" + DNI + ", NSS=" + NSS + ", Nombre_Apellido=" + Nombre_Apellido + ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", Sexo=" + Sexo + ", EstadoCivil=" + EstadoCivil + ", TipoContrato=" + TipoContrato + ", Departamento=" + Departamento + ", FechaAlta=" + FechaAlta + ", NumeroEmpleado=" + NumeroEmpleado + '}';
    }
    
    
}
