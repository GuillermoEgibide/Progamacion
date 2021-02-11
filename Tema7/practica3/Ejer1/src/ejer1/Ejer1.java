/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import Modelo.*;
import Vista.V1;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW12
 */
public class Ejer1 {
    private static ArrayList<Producto> ListaProducto;
    private static ArrayList<Proveedores> ListaProveedores;
    private static ArrayList<Cliente> ListaCliente;
    
    private static V1 v1;
    
    private static Producto Prod;
    private static Proveedores P;
    public static Cliente C;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        generarProductos();
        generarProveedores();
        generarClientes();
        
        v1 = new V1();
        v1.setVisible(true);  
    }

    private static void generarProveedores() {
        ListaProveedores = new ArrayList<Proveedores>();
        P = new Proveedores("Michelin");
        ListaProveedores.add(P);
        P = new Proveedores("Cesar");
        ListaProveedores.add(P);
        P = new Proveedores("Repsol");
        ListaProveedores.add(P);
        P = new Proveedores("Grefusa");
        ListaProveedores.add(P);
    }

    private static void generarClientes() {
        ListaCliente = new ArrayList<Cliente>();
        C = new Cliente("Alvaro");
        ListaCliente.add(C);
        C = new Cliente("Rafael");
        ListaCliente.add(C);
        C = new Cliente("Miguel");
        ListaCliente.add(C);
    }

    private static void generarProductos() {
        ListaProducto = new ArrayList<Producto>();
        Prod = new Producto("Gasoil", 50, 5.20);
        ListaProducto.add(Prod);
        Prod = new Producto("Pipas tijuana", 100, 0.35);
        ListaProducto.add(Prod);
        Prod = new Producto("Neumaticos", 20, 10.99);
        ListaProducto.add(Prod);
        Prod = new Producto("Motor", 10, 75.99);
        ListaProducto.add(Prod);
    }
    
     public static void salir() {
         v1.dispose();
         System.exit(0);
    }
}
