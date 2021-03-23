/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import BaseDatos.*;
import Modelo.*;
import Vistas.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW12
 */
public class Ejer1 {
    private static BaseDatos bd;
    private static TablaCliente tc;
    
    private static VentanaPrincipal vp;
    private static VentanaClientes vc;
    
    private Cliente c;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try{
            bd = new BaseDatos();
            bd.conectar();
            
            tc = new TablaCliente(bd.getCon());
            
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
}
