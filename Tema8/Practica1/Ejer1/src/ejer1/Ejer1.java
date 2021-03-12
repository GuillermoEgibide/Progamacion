/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import ModeloBD.*;
import ModeloUML.*;
import Vista.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW12
 */
public class Ejer1 {
    private static BaseDatos bd;
    private static TablaPersonas tp;
    
    private static VentanaPrincipal vp;
    private static VentanaPersonas vp2;
    
    private static Persona p;    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            bd = new BaseDatos();
            bd.conectar();
            
            tp = new TablaPersonas(bd.getCon());
            
            vp = new VentanaPrincipal();
            vp.setVisible(true);
        }
        catch(Exception e){
            bd.desconectar();
            JOptionPane.showMessageDialog(null,"Error " +  e.getMessage());
        }
    }

    public static void salirVentana() {
        vp2.dispose();
        vp.setVisible(true);
    }

    public static void cerrarVentana() {
        vp.dispose();
        System.exit(0);
    }

    public static void mostrarVentanaPersonas() {
        vp2 = new VentanaPersonas();
        vp2.setVisible(true);
    }

    public static void insertarPersona(String nombre, int edad, String profesion, String telefono) throws Exception {
           p = new Persona(nombre,edad,profesion,telefono);
           tp.insertar(p);
    }

    public static void terminar() {
        vp2.dispose();
    }
    
    
}
