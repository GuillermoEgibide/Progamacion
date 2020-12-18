/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import Excepciones.DatoNoValido;
import Modelo.Circunferencia;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW12
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           double r = Double.parseDouble(JOptionPane.showInputDialog("Tecleame la radio"));
           if (r <= 0)
               throw new DatoNoValido();
           Circunferencia c = new Circunferencia();
           
           DecimalFormat df = new DecimalFormat("#.00");
           JOptionPane.showMessageDialog(null, "Los datos de la circunferencia con radio " + c.getRadio() + " son de longitud " + df.format(c.getLongitud()) + ", un area de " + df.format(c.getArea())+ " y con un volumen de " + c.getVolumen());
       }
       catch(NumberFormatException e){
       JOptionPane.showMessageDialog(null, "Debes escribir un numero");
    }
       catch (DatoNoValido e){
           JOptionPane.showMessageDialog(null, "Dato erroneo");
       }
       catch (Exception e){
           JOptionPane.showMessageDialog(null,"Error " + e.getClass());
       }
    }
    
}
