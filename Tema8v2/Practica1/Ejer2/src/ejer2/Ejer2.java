/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

import ModeloBD.*;
import ModeloUML.Evento;
import Vista.VentanaAsistencia;
import Vista.VentanaEventos;
import Vista.VentanaModificacion;
import Vista.VentanaPrincipal;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW12
 */
public class Ejer2 {
    
    private static EmpresaJpaController empresabd;
    private static EventoJpaController eventobd;
    private static PersonaJpaController personabd;
    private static PersonaseventoJpaController personaseventobd;
    
    private static VentanaPrincipal vp;
    private static VentanaEventos ve;
    private static VentanaModificacion vm;
    private static VentanaAsistencia va;
    private static Evento e;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            empresabd = new EmpresaJpaController(Persistence.createEntityManagerFactory("Ejer2PU"));
            eventobd = new EventoJpaController(Persistence.createEntityManagerFactory("Ejer2PU"));
            personabd = new PersonaJpaController(Persistence.createEntityManagerFactory("Ejer2PU"));
            personaseventobd = new PersonaseventoJpaController(Persistence.createEntityManagerFactory("Ejer2PU"));
            
            vp = new VentanaPrincipal();
            vp.setVisible(true);
        }
        catch(Exception e){
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
       Date fechas = Date.valueOf(fecha);
       Time horaInicios = Time.valueOf(horaInicio);
       Time horaFinalizaciones = Time.valueOf(horaFinalizacion);
       Evento e = new Evento(nombre,lugar,fechas,horaInicios,horaFinalizaciones,numeroPersonas);
       eventobd.create(e);
       eventobd = new EventoJpaController(Persistence.createEntityManagerFactory("Ejer2PU"));
    }


    public static void borrarEvento(String nombre) throws Exception {
        eventobd.destroy(nombre);
    }


    public static void ventanaModificar(String nombre) {
       e = eventobd.findEvento(nombre);
       vm = new VentanaModificacion(e.getNombre(),e.getLugar(),e.getFecha(),e.getHoraInicio(),e.getHoraFinalizacion(),e.getNumeroPersonas());
       vm.setVisible(true);
    }

    public static void cancelarModificacion() {
        vm.dispose();
    }

    public static void ventanaConfirmarAsistencia() {
        va = new VentanaAsistencia();
        va.setVisible(true);
    }

    public static void cancelarAsistencia() {
       va.dispose();
    }

    public static void modificarAcontecimiento2(String nombre, String lugar, LocalDate fecha, LocalTime horaInicio, LocalTime horaFinalizacion, int numeroPersonas) throws Exception {
       Date fechas = Date.valueOf(fecha);
       Time horaInicios = Time.valueOf(horaInicio);
       Time horaFinalizaciones = Time.valueOf(horaFinalizacion);
       e.setLugar(lugar);
       e.setFecha(fechas);
       e.setHoraInicio(horaInicios);
       e.setHoraFinalizacion(horaFinalizaciones);
       e.setNumeroPersonas(numeroPersonas);
       eventobd.edit(e);
    }

}
