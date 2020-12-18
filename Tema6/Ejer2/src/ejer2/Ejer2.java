/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

import Alumnos.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW12
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try{
       ArrayList <Alumno> clase;
       clase = datosAlumno();
       buscarCodigo(clase);
               
      }
      catch (Exception e){
          JOptionPane.showMessageDialog(null, "Error" + e.getClass());
      }
    }

     private static ArrayList<Alumno> datosAlumno() {
        ArrayList <Alumno> lista = new ArrayList();
        int respuesta = 0;
        do
        {
            int codigo = fCodigo();
            String Nombre = fNombre();
            String Domicilio = fDomicilio();
            int Telefono = fTelefono();
       
            Alumno o = new Alumno(codigo,Nombre,Domicilio,Telefono); 
            lista.add(o);
            respuesta = JOptionPane.showConfirmDialog(null, "¿Desea introducir otro alumnno?");
        }
        while (respuesta == 0);
        return lista;
    }
    private static int fCodigo(){
        boolean error = true;
        int codigo = 0;
        do{
        try{
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el codigo del alumno"));
            error = false;
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debes escribir un numero");
        }
        catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "No puedes dejarlo en blanco");
        }
        }
        while (error);
        return codigo;
    }
    
    private static String fNombre() {
        boolean error = true;
        String Nombre = "";
        do
        {
        try{
            Nombre = JOptionPane.showInputDialog("Introduzca el nombre del alumno");
            error = false;
        }
        catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "No puedes dejarlo en blanco");
        }
        }
        while (error);
        return Nombre;
    }

    private static String fDomicilio() {
        boolean error = true;
        String Domicilio = "";
        do
        {
        try{
            Domicilio = JOptionPane.showInputDialog("Introduzca la direccion del alumno");
            error = false;
        }
        catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "No puedes dejarlo en blanco");
        }
        }
        while (error);       
        return Domicilio; 
    }

    private static int fTelefono() {
        boolean error = true;
        int Telefono = 0;
        do
        {
        try{
            Telefono = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el telefono del alumno"));
            error= false;
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debes escribir un numero");
        }
        catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "No puedes dejarlo en blanco");
        }
        }
        while (error);
        return Telefono;
    }

    private static void buscarCodigo(ArrayList<Alumno> clase) {
        int codigo = fCodigo();
        int x;
        for(x = 0; x < clase.size() && clase.get(x).getCodigo().equals(codigo)== false; x++){}
        if( x == clase.size())
            JOptionPane.showMessageDialog(null,"No existe ese alumno");
        else
            JOptionPane.showMessageDialog(null,clase.get(x).toString());
    }

   

   
    
}
