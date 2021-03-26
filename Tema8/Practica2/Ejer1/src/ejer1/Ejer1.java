/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import BaseDatos.*;
import Modelo.*;
import Vistas.Abogados.*;
import Vistas.Clientes.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW12
 */
public class Ejer1 {
    private static BaseDatos bd;
    private static TablaCliente tc;
    private static TablaAbogados ta;
    
    private static VentanaPrincipal vp;
    private static VentanaClientes vc;
    private static VentanaBajaCliente vbc;
    private static VentanaConsultaCliente vcc;
    private static VentanaModificacionCliente vmc;
    
    private static VentanaAltaAbogados vaa;
    private static VentanaBajaAbogados vba;
    private static VentanaModificacionAbogados vma;
    private static VentanaConsultaAbogado vca;

    private static Cliente c;
    private static Abogado a;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try{
            bd = new BaseDatos();
            bd.conectar();
            
            tc = new TablaCliente(bd.getCon());
            /*ta = new TablaCliente(bd.getCon());*/
            
            vp = new VentanaPrincipal();
            vp.setVisible(true);
        }
        catch(Exception e){
            bd.desconectar();
            JOptionPane.showMessageDialog(null,"Error " +  e.getMessage());
        }
    }
    
     public static void abrirVentanaClientes() {
       vc = new VentanaClientes();
       vc.setVisible(true);
    }
     
     public static void cancelarAltaCliente() {
        vc.dispose();
    }
    
     public static void insertarPersona(String dni, String nombre, String apellido, String direccion, int telefono, String correo) throws Exception {
        c = new Cliente(dni,nombre,apellido,direccion,telefono,correo);
        tc.insertar(c);
    }

    public static void terminar() {
       vp.dispose();
       System.exit(0);
    }

    public static void abrirVentanaBajaCliente() {
        vbc = new VentanaBajaCliente();
        vbc.setVisible(true);
    }

    public static void cerrarVentanaConsultaCliente() {
        vcc.dispose();
    }

    public static void abrirVentanaConsultaCliente() {
        vcc = new VentanaConsultaCliente();
        vcc.setVisible(true);
    }

    public static void cerrarVentanaBajaCliente() {
       vbc.dispose();
    }

    public static void cerrarVentanaModificacionCliente() {
        vmc.dispose();
    }

    public static void abrirVentanaAltaAbogados() {
        vaa = new VentanaAltaAbogados();
        vaa.setVisible(true);
    }

    public static void abrirVentanaBajaAbogados() {
        vba = new VentanaBajaAbogados();
        vba.setVisible(true);
    }

    public static void abrirVentanaModificacionAbogados() {
       vma = new VentanaModificacionAbogados();
       vma.setVisible(true);
    }

    public static void cerrarVentanaAltaAbogados() {
        vaa.dispose();
    }

    public static void cerrarVentanaBajaAbogados() {
        vba.dispose();
    }

    public static void cerrarVentanaModificacionAbogados() {
        vma.dispose();
    }

    public static void insertarAbogado(String dni, String nombre, String apellido, String correo) throws Exception {
        a = new Abogado(dni,nombre,apellido,correo);
        ta.insertar(a);
    }

    public static void abrirVentanaModificacionACliente() {
       vmc = new VentanaModificacionCliente();
       vmc.setVisible(true);
    }

    public static void abrirVentanaConsultaAbogado() {
        vca = new VentanaConsultaAbogado();
        vca.setVisible(true);
    }

    public static void cerrarVentanaConsultaAbogados() {
       vca.dispose();
    }
}
