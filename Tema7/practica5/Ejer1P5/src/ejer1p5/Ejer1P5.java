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
    private static Personal[] listaPersonal;
    private static ArrayList<Empleado> listaEmpleado;
    private static Contrato[] listaContrato;
    private static Departamento[] listaDepartamento;
    
    private static VistaEntrada v1;
    private static VentanaPrincipal v2;
    
     private static Empleado empleado;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        generarDatos();
        
        v1 = new VistaEntrada();
        v1.setVisible(true);
    }

    private static void generarDatos() {
        
        listaContrato = new Contrato[2];
        listaContrato[0] = new Contrato();
        listaContrato[0].setNombre("Indefinido");
        listaContrato[1]= new Contrato();
        listaContrato[0].setNombre("Relevo");
 
        
        listaDepartamento = new Departamento[3];
        listaDepartamento[0] = new Departamento();
        listaDepartamento[0].setNombre("Personal");
        listaDepartamento[1] = new Departamento();
        listaDepartamento[1].setNombre("Produccion");
        listaDepartamento[2] = new Departamento();
        listaDepartamento[2].setNombre("Informatica");
        
        listaEmpleado = new ArrayList<Empleado>();
       
        
        
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
        v1.dispose();
        v1 = new VistaEntrada();
        v1.setVisible(true);
    }

    public static boolean validarNombre(String usuario) {
        int x;
        for(x = 0; x < listaPersonal.length && listaPersonal[x].getUsuario().compareToIgnoreCase(usuario)!= 0; x++){}
        if (x == listaPersonal.length)
        {
            personal = null;
            return false;
        }
        return true;
    }

    public static boolean validarContraseña(String contraseña) {
        int x;
        for(x = 0; x < listaPersonal.length && listaPersonal[x].getUsuario().compareToIgnoreCase(contraseña)!= 0; x++){}
        if (x == listaPersonal.length)
        {
            personal = null;
            return false;
        }
        return true;
    }

    public static void cerrarVentana() {
       v2.dispose();
       System.exit(0);
    }
    
}
