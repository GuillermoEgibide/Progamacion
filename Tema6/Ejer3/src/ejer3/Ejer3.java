/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

import Excepciones.*;
import Modelo.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW12
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{ 
        Persona [] array = new Persona[3];
        for (int x = 0; x < 3; x++){
            array[x] = rellenarDatos();
        }
        Operaciones(array);
       }
       catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error " + e.getClass());
       }
    }

    private static Persona rellenarDatos() {
        String nombre = solicitarNombre();
        int diaNacimiento = solicitarDia();
        int mesNacimiento = solicitarMes();
        int añoNacimiento = solicitarAño();
        String direccion = solicitarDirrecion();
        String codigopostal = solicitarCodigoPostal();
        String ciudad = solicitarCiudad();
        
        Persona personas = new Persona (nombre,diaNacimiento,mesNacimiento,añoNacimiento,direccion,codigopostal,ciudad);
        return personas;
    }

    private static String solicitarNombre() {
        boolean error = true;
        String nombre = "";
        do
        {
            try
            {
                nombre = JOptionPane.showInputDialog("Introduzca el nombre de la persona");
                error = false;
            }
            catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "No puedes dejarlo en blanco");
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getClass());
            }
        }
        while (error);
        return nombre;
    }

    private static int solicitarDia() {
      boolean error = true;
      int dia=0;
      do{
          try{
              dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dia de la persona"));
              if (dia<1 || dia >31)
                  throw new DiaNoValido();
              error = false;
          }
          catch (NumberFormatException e){
              JOptionPane.showMessageDialog(null,"Debes escribir un numero");
          }
          catch (DiaNoValido e){
              JOptionPane.showMessageDialog(null,"El dia debe estar comprendido entre 1 y 31");
          }
          catch (NullPointerException e){
              JOptionPane.showMessageDialog(null , "No puedes dejarlo en blanco");
          }
          catch (Exception e){
              JOptionPane.showMessageDialog(null,"Error" + e.getClass());
          }
      }
      while (error);
      return dia;
    }

    private static int solicitarMes() {
         boolean error = true;
      int mes=0;
      do{
          try{
              mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el mes de la persona"));
              if (mes<1 || mes >12)
                  throw new MesNoValido();
              error = false;
          }
          catch (NumberFormatException e){
              JOptionPane.showMessageDialog(null,"Debes escribir un numero");
          }
          catch (MesNoValido e){
              JOptionPane.showMessageDialog(null,"El mes debe estar comprendido entre 1 y 12");
          }
          catch (NullPointerException e){
              JOptionPane.showMessageDialog(null , "No puedes dejarlo en blanco");
          }
          catch (Exception e){
              JOptionPane.showMessageDialog(null,"Error" + e.getClass());
          }
      }
      while (error);
      return mes;
    }

    private static int solicitarAño() {
           boolean error = true;
      int año=0;
      do{
          try{
              año = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de la persona"));
              error = false;
          }
          catch (NumberFormatException e){
              JOptionPane.showMessageDialog(null,"Debes escribir un numero");
          }
          catch (NullPointerException e){
              JOptionPane.showMessageDialog(null , "No puedes dejarlo en blanco");
          }
          catch (Exception e){
              JOptionPane.showMessageDialog(null,"Error" + e.getClass());
          }
      }
      while (error);
      return año;
    }

    private static String solicitarDirrecion() {
         boolean error = true;
        String direccion = "";
        do
        {
            try
            {
                direccion = JOptionPane.showInputDialog("Introduzca la direccion de la persona");
                error = false;
            }
            catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "No puedes dejarlo en blanco");
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getClass());
            }
        }
        while (error);
        return direccion;
    }

    private static String solicitarCodigoPostal() {
        boolean error = true;
        String codigopostal = "";
        do
        {
            try
            {
                codigopostal = JOptionPane.showInputDialog("Introduzca el codigo postal de la persona");
                error = false;
            }
            catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "No puedes dejarlo en blanco");
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getClass());
            }
        }
        while (error);
        return codigopostal;
    }

    private static String solicitarCiudad() {
        boolean error = true;
        String ciudad = "";
        do
        {
            try
            {
                ciudad = JOptionPane.showInputDialog("Introduzca la ciudad de la persona");
                error = false;
            }
            catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "No puedes dejarlo en blanco");
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getClass());
            }
        }
        while (error);
        return ciudad;
    }

    private static void Operaciones(Persona[] array) {
       int edadMayor = 0;
       int posicion = 0;
       String nombre = "";
       String mayoredad = "";
       for(int x = 0; x < array.length;x++){
       int edad = array[x].edad();
       if (edad > edadMayor){
           posicion = x;
           edadMayor = edad;
       }
       if (array[x].getCiudad().compareToIgnoreCase("Elche") == 0)
            {
                nombre += array[x].getNombre();
            }
       if (array[x].MayorEdad())
           mayoredad += array[x].getNombre();
    }
       JOptionPane.showMessageDialog(null, "La persona " + array[posicion].getNombre() + " es mayor de edad");
       
       if (nombre.compareTo("")== 0)
            JOptionPane.showMessageDialog(null, "No hay personas que vivan en Elche");
       else
            JOptionPane.showMessageDialog(null, nombre + " vive en Elche");
       if (mayoredad.compareTo("")== 0)
            javax.swing.JOptionPane.showMessageDialog(null, "No hay personas mayores de edad");
        else
            javax.swing.JOptionPane.showMessageDialog(null, mayoredad + " son mayores de edad");
           
    }
}
