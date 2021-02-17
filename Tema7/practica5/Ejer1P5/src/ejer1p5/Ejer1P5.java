/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1p5;

import Modelo.*;
import Vista.*;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW12
 */
public class Ejer1P5 {
    private static ArrayList<Personal> listaPersonal;
    private static ArrayList<Empleado> listaEmpleado;
    private static ArrayList<Contrato> listaContrato;
    private static ArrayList<Departamento> listaDepartamento;
    
    private static VistaEntrada v1;
    private static VentanaPrincipal v2;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        generarDatos();
        
        v1 = new VistaEntrada();
        v1.setVisible(true);
    }

    private static void generarDatos() {
        listaContrato = new ArrayList<Contrato>();
        listaContrato.add(new Contrato("Indefinido"));
        listaContrato.add(new Contrato("Temporal"));
        listaContrato.add(new Contrato("Por obra o servicio"));
        listaContrato.add(new Contrato("Eventual"));
        listaContrato.add(new Contrato("Interinidad"));
        listaContrato.add(new Contrato("Relevo"));
        listaContrato.add(new Contrato("Formacion y aprandizaje"));
        listaContrato.add(new Contrato("Practicas"));

        listaDepartamento = new ArrayList<Departamento>();
        listaDepartamento.add(new Departamento("Personal"));
        listaDepartamento.add(new Departamento("Limpieza"));
        listaDepartamento.add(new Departamento("Jefe"));
        listaDepartamento.add(new Departamento("Personal"));
        
        
 
    }

    public static void salir() {
        v1.dispose();
        System.exit(0);
    }

    public static void ventanaPrincipal() {
        v1.dispose();
        
        v2 = new VentanaPrincipal();
        v2.setVisible(true);
    }

    public static void volverEmpezar() {
        v1 = new VistaEntrada();
        v1.setVisible(true);
    }
    
}
