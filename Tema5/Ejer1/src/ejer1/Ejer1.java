/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import java.util.ArrayList;
import java.util.Collections;
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
        ArrayList <Double> lista = new ArrayList();
        RellenarArray(lista);
        int menu = 0;
         do {
             menu = mostrarMenu();
             switch(menu){
                 case 1: 
                     VisualizarMaxMin(lista);
                     break;
                 case 2: 
                     SolicitarNumBuscar(lista);
                     break;
                 case 3: 
                     SolicitarNumBuscarBorrar(lista);
                     break;
                 case 4: 
                     ConvertirArray(lista);
                     break;
                 case 5: 
                     MostarElementos(lista);
                     break;
                 case 6: 
                     InsertarElemento(lista);
                     break;
                 case 7: 
                     InsertarElementoElegir(lista);
                     break;
                 case 8: 
                     BorrarElemento(lista);
                     break;
                 case 9: 
                     CalcularSumaMediaArigmetica(lista);
                     break;
                 case 10: 
                     JOptionPane.showMessageDialog(null,"Hasta la proxima");
                     break;
                 default:
                     JOptionPane.showMessageDialog(null,"Te equivocaste de opcion");
             }
         }
         while (menu !=10);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error con el " + e.getClass());
        }
    }

    private static void RellenarArray(ArrayList<Double> lista) throws Exception {
        int respuesta = 0;
        do{
                lista.add(PedirNumero());
                respuesta = JOptionPane.showConfirmDialog(null,"¿Desea introducir otro numero?");
        }
        while(respuesta == 0);
    }

    private static int mostrarMenu() {
        int menu = 0;
        boolean error = true ;
        do{
        try{
            menu = Integer.parseInt(JOptionPane.showInputDialog("1.Visualizar el valor maximo y el mınimo.\n"+
                                                      "2.Solicitar un numero y buscarlo.\n"+
                                                      "3.Solicitar un numero, buscarlo y borrarlo.\n"+
                                                      "4.Convertir el arrayList en un array.\n"+
                                                      "5.Mostrar el numero de elementos que contiene(Si no esta vacio).\n"+
                                                      "6.Insertar un nuevo elemento por el final.\n"+
                                                      "7.Insertar un nuevo elemento en la posicion indicada.\n"+
                                                      "8.Borrar un elemento de una posicion indicada.\n"+
                                                      "9.Calcular la suma y la media aritmetica de los valores contenidos.\n"+
                                                      "10.Finalizar.\n\n"+
                                                      "Eliga una de las siguientes opciones mostradas:"));
            error = false;
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Debes poner algo o dar al 7 para salir");
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debes escribir un numero");
        }
        }
        while (error);
        return menu;
    }

    private static void VisualizarMaxMin(ArrayList<Double> lista) throws Exception{
       double max = Collections.max(lista);
       double min = Collections.min(lista);
       JOptionPane.showMessageDialog(null, "El numero mas alto es " +max+"\n"+"El numero mas bajos es "+min);
    }

    private static void SolicitarNumBuscar(ArrayList<Double> lista) throws Exception{
        double x =0;
        x = Double.parseDouble(JOptionPane.showInputDialog("Tecle el numero que desees"));
            if(lista.contains(x)) 
                JOptionPane.showMessageDialog(null,"Lo hemos encontrado en la posicion " + lista.indexOf(x));
            else
                JOptionPane.showMessageDialog(null,"No lo hemos encontrado");
    }
    

    private static void SolicitarNumBuscarBorrar(ArrayList<Double> lista) throws Exception{
          double x =0;
        x = Double.parseDouble(JOptionPane.showInputDialog("Tecle el numero que desees"));
            if(lista.contains(x)) {
                JOptionPane.showMessageDialog(null,"Lo hemos encontrado en la posicion " + lista.indexOf(x) + " y lo borraremos");
                lista.remove(x);
            }
            else
                JOptionPane.showMessageDialog(null,"No lo hemos encontrado");
    }

    private static void ConvertirArray(ArrayList<Double> lista) throws Exception{
       Double[] array = new Double [lista.size()];
       array = lista.toArray(array);
       /*for(Double arrays : array)
        * JOptionPane.showMessageDialog(null, arrays);
        */
    }

    private static void MostarElementos(ArrayList<Double> lista)  throws Exception{
        int tamaño = lista.size();
        if (!lista.isEmpty())
            JOptionPane.showMessageDialog(null,"El número de elementos es de "+tamaño);     
    }

    private static void InsertarElemento(ArrayList<Double> lista) throws Exception{
         lista.add(PedirNumero());
    }

    private static void InsertarElementoElegir(ArrayList<Double> lista) throws Exception{
        boolean error = true;
        int x =0;
        do{
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog("Tecle una posicion en al que quieres añadir"));
            lista.add(x,PedirNumero());
            error = false;
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debes teclear un numero");
        }
        }
        while (error);
    }

    private static void BorrarElemento(ArrayList<Double> lista) throws Exception{
        boolean error = true;
        int x;
        do{
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog("Tecleame la posicion que desees borrar"));
            lista.remove(x);
            error = false;
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debes teclear un numero");
        }
        }
        while (error);
    }

    private static void CalcularSumaMediaArigmetica(ArrayList<Double> lista) throws Exception{
       double suma = 0;
        for(int i = 0; i < lista.size();i++) {
            suma += lista.get(i); 
        }      
        double media = suma/(lista.size());   
        JOptionPane.showMessageDialog(null,"La suma de todos es de " + suma + " con una media de " + media);
    }

    private static Double PedirNumero() throws Exception{
        Double numero =null;
        boolean error = true;
        do{
        try{
        numero = Double.parseDouble(JOptionPane.showInputDialog("Tecle un numero"));
        error = false;
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debes escribir un numero");
        }
        }
        while (error);
        return numero;
    }
}
