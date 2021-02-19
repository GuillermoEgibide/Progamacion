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
public class Empleado {
    private String DNI;
    private String NSS;
    private String Nombre_Apellido;
    private String Direccion;
    private String Telefono;
    private Character Sexo;
    private Character EstadoCivil;
    private Contrato TipoContrato;
    private Departamento Departamento;
    private LocalDate FechaAlta;
    private String NumeroEmpleado;
    private Personal Usuario;

    public Empleado(String DNI, String NSS, String Nombre_Apellido, String Direccion, String Telefono, Character Sexo, Character EstadoCivil, Contrato TipoContrato, Departamento Departamento, LocalDate FechaAlta, String NumeroEmpleado, Personal Usuario) {
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
        this.Usuario = Usuario;
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

    public Character getSexo() {
        return Sexo;
    }

    public void setSexo(Character Sexo) {
        this.Sexo = Sexo;
    }

    public Character getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(Character EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public Contrato getTipoContrato() {
        return TipoContrato;
    }

    public void setTipoContrato(Contrato TipoContrato) {
        this.TipoContrato = TipoContrato;
    }

    public Departamento getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(Departamento Departamento) {
        this.Departamento = Departamento;
    }

    public LocalDate getFechaAlta() {
        return FechaAlta;
    }

    public void setFechaAlta(LocalDate FechaAlta) {
        this.FechaAlta = FechaAlta;
    }

    public String getNumeroEmpleado() {
        return NumeroEmpleado;
    }

    public void setNumeroEmpleado(String NumeroEmpleado) {
        this.NumeroEmpleado = NumeroEmpleado;
    }

    public Personal getUsuario() {
        return Usuario;
    }

    public void setUsuario(Personal Usuario) {
        this.Usuario = Usuario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "DNI=" + DNI + ", NSS=" + NSS + ", Nombre_Apellido=" + Nombre_Apellido + ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", Sexo=" + Sexo + ", EstadoCivil=" + EstadoCivil + ", TipoContrato=" + TipoContrato + ", Departamento=" + Departamento + ", FechaAlta=" + FechaAlta + ", NumeroEmpleado=" + NumeroEmpleado + '}';
    }
    
    
}
