/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

import Modelo.*;
import Vista.*;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author 1GDAW12
 */
public class Ejer2 {
    private static Proveedores[] ListaProveedores;
    private static Producto[] ListaProductos;
    private static ArrayList<Clientes> ListaClientes;
    
    private static V1 v1;
    
    private static Producto Prod;
    private static Proveedores P;
    private static Clientes C;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        generarProveedores();
        generarProductos();
        generarClientes();
        v1 = new V1();
        v1.setVisible(true);
    }

   private static void generarProveedores() {
        ListaProveedores = new Proveedores[4];
        ListaProveedores[0] = new Proveedores();
        ListaProveedores[0].setNombre("Michelin");
        ListaProveedores[1]= new Proveedores();
        ListaProveedores[1].setNombre("Sistam");
        ListaProveedores[2] = new Proveedores();
        ListaProveedores[2].setNombre("Repsol");
        ListaProveedores[3]= new Proveedores();
        ListaProveedores[3].setNombre("Grefusa");
    }
   
   private static void generarProductos() {
        ListaProductos = new Producto[4];
        ListaProductos[0] = new Producto("Gasoil", 50, 5.20f);
        /*ListaProductos[0].setListaProveedor(ListaProveedores[2]);*/
        ListaProductos[1]= new Producto("Pipas tijuana", 100,0.35f);
        /*ListaProductos[1].setListaProveedor(ListaProveedores[3]);*/
        ListaProductos[2] = new Producto("Neumaticos", 20, 10.99f);
       /* ListaProductos[0].setListaProveedor(ListaProveedores[0]);*/
        ListaProductos[3]= new Producto("Motor", 10, 75.99f);
        /*ListaProductos[0].setListaProveedor(ListaProveedores[0]);*/
    }
    private static void generarClientes() {
        ListaClientes = new ArrayList<Clientes>();
        C = new Clientes("Alvaro");
        ListaClientes.add(C);
        C = new Clientes("Rafael");
        ListaClientes.add(C);
        C = new Clientes("Miguel");
        ListaClientes.add(C);
    }

    public static void cancelar() {
        v1.dispose();
        System.exit(0);
    }

    public static boolean validarProducto(String producto) {
        int x;
        for(x = 0; x < ListaProductos.length && ListaProductos[x].getNombre().compareToIgnoreCase(producto)!= 0; x++){}
        if (x == ListaProductos.length)
        {
            Prod = null;
            return false;
        }
        Prod = ListaProductos[x];
        return true;
    }

    public static boolean Proveedores(JComboBox<String> cbProveedor) {
      
    }

    public static void ponerProveedor(int selectedIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
  
    

    
}
