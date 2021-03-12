/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

import ModeloBD.*;
import ModeloUML.*;
import Vista.*;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW12
 */
public class Ejer2 {
    private static BaseDatos bd;
    private static TablaEventos te;
    
    private static VentanaPrincipal vp;
    private static VentanaEventos ve;
    
    private static Evento e;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            bd = new BaseDatos();
            bd.conectar();
            
            te = new TablaEventos(bd.getCon());
            
            vp = new VentanaPrincipal();
            vp.setVisible(true);
        }
        catch(Exception e){
            bd.desconectar();
            JOptionPane.showMessageDialog(null,"Error " +  e.getMessage());
        }
    }

    public static void salirVentana() {
        vp.dispose();
        System.exit(0);
    }

    public static void abrirVentana() {
        ve = new VentanaEventos();
        ve.setVisible(true);
   }

    public static void cancelarOperacion() {
       ve.dispose(); 
    }

    public static void añadirPersona(String nombre, String lugar, LocalDate fecha, LocalTime horaInicio, LocalTime horaFinalizacion, int numeroPersonas) throws Exception {
       Evento e = new Evento(nombre,lugar,fecha,horaInicio,horaFinalizacion,numeroPersonas);
       te.insertar(e);
    }


    public static void borrarEvento(String nombre) throws Exception {
        e.setNombre(nombre);
        te.borrar(e);
    }


    
    
    
}
