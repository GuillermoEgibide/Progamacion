/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import Modelo.*;
import java.lang.Exception;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Guillermo
 */
public class Ejer1 {
    private static Estudio[] listaEstudios = new Estudio[5];
    
     // Todos las películas que existen en el mundo
    private static ArrayList<Pelicula> listaPeliculas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        SimpleDateFormat fecha = new SimpleDateFormat("DD/MM/YYYY");
        ArrayList<String> telefonos = new ArrayList();
        telefonos.add ("993491293");
        listaEstudios[0] = new Estudio("Marvel","Los angeles","c/ santiago","Marvel.com",fecha.parse("22/10/1998"),"Estados Unidos", telefonos);
        telefonos = new ArrayList();
        telefonos.add ("872123175");
        listaEstudios[1] = new Estudio("DC","Las vegas","c/ Compostol","DC.com",fecha.parse("31/03/2004"),"Canada", telefonos);
        telefonos = new ArrayList();
        telefonos.add ("872123175");
        listaEstudios[2] = new Estudio("Children","Madrid","c/ Murciano","Children.com",fecha.parse("03/10/1875"),"España", telefonos);
        
        listaPeliculas = new ArrayList();
        ArrayList <Estudio> lista = new ArrayList();
        lista.add (listaEstudios[2]);
        Pelicula p1 = new Pelicula("Los siete enanitos",1889,108,"Ficcion", lista);
        lista = new ArrayList();
        lista.add (listaEstudios[0]);
        Pelicula p2 = new Pelicula("Ironman",2003,121,"Aventura",lista);
        lista = new ArrayList();
        lista.add (listaEstudios[2]);
        Pelicula p3 = new Pelicula("Pinocho",1887,104,"Ficcion", lista);
        
        peliculaMasLarga();
        estudioMasPeliculas();
    }

    private static void peliculaMasLarga() {
    float maximo = 0;
        Pelicula objeto=null;
        for(int x=0; x < listaPeliculas.size();x++){
            if (listaPeliculas.get(x).getDuracion() > maximo){
                maximo = listaPeliculas.get(x).getDuracion();
                objeto = listaPeliculas.get(x);
            }
        }
        String mensaje = "";
        for (int x = 0; x < objeto.getEstudio().size();x++)
            mensaje += " " + objeto.getEstudio().get(x).getNombre();
        JOptionPane.showMessageDialog(null," La pelicula más larga es " + objeto.getTitulo()+ " y se ha producido en " + mensaje);
    }

    private static void estudioMasPeliculas() {
        int [] numeroPeliculas = new int[5];
        Arrays.fill(numeroPeliculas, 0);
        for(int z = 0;z < listaEstudios.length; z++)
            for(int x=0; x < listaPeliculas.size();x++){
            boolean salir = false;
            for(int y=0; y < listaPeliculas.get(x).getEstudio().size() && !salir; y++){
                if (listaPeliculas.get(x).getEstudio().get(y).equals(listaEstudios[z])){
                        numeroPeliculas[z]+= 1;
                        salir = true;                    
                    }
                }
            }
        int maximo = 0;
        int posicion = 0;
        for (int x = 0; x < numeroPeliculas.length; x++)
            if(numeroPeliculas[x] > maximo){
                maximo = numeroPeliculas[x];
                posicion = x;
            }
       JOptionPane.showMessageDialog(null,"El estudio que más películas ha producido es: " + listaEstudios[posicion].getNombre() + " y ha producido "+ maximo);
    }
    
}
