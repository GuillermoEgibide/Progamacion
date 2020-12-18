/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 1GDAW12
 */
public class Circunferencia {
    private int radio;

    public Circunferencia() {
    }

    public Circunferencia(int radio) {
        this.radio = radio;
    }
    
    public double getLongitud(){
        return 2*Math.PI * radio;
    }
    public double getArea(){
        return Math.PI * Math.pow(getRadio(),2);
    }
    public double getVolumen(){
        return 4 * Math.PI;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
