/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import ModeloBD.PersonaJpaController;
import ModeloUML.Persona;
import Vistas.*;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW12
 */
public class Ejer1 {
    private static PersonaJpaController personasbd;
    private static VentanaPrincipal vp;
    private static VentanaPersonas vp2;
    
    private static Persona p;   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
               personasbd = new PersonaJpaController(Persistence.createEntityManagerFactory("Ejer1PU"));
               
               vp = new VentanaPrincipal();
               vp.setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void mostrarVentanaPersonas() {
         vp2 = new VentanaPersonas();
         vp2.setVisible(true);
    }

    public static void cerrarVentana() {
         vp.dispose();
         System.exit(0);
    }

    public static void salirVentana() {
         vp2.dispose();
    }

    public static void insertarPersona(String nombre, int edad, String profesion, String telefono) throws Exception {
        p = new Persona(nombre,edad,profesion,telefono);
        personasbd.create(p);
    }

    public static void validarNombre(String nombre) {
        Persona mipersona = personasbd.findPersona(nombre);
        visualizar(mipersona);
    }

    private static void visualizar(Persona mipersona) {
        System.out.println("Nombre Persona: " + mipersona.getNombre() + "\nEdad Persona: "+mipersona.getEdad()+ "\nProfesión Persona: "+mipersona.getProfesion() + "\nTelefono Persona: "+ mipersona.getTelefono());
    }
}
