/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author 1GDAW12
 */
public class Reserva {
    private LocalDate fechaReserva;
    private String franjaHoraria;
    private Integer comensales;
    private String color;
    private String demandas;

    public Reserva(LocalDate fechaReserva, String franjaHoraria, Integer comensales, String color, String demandas) {
        this.fechaReserva = fechaReserva;
        this.franjaHoraria = franjaHoraria;
        this.comensales = comensales;
        this.color = color;
        this.demandas = demandas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getFranjaHoraria() {
        return franjaHoraria;
    }

    public void setFranjaHoraria(String franjaHoraria) {
        this.franjaHoraria = franjaHoraria;
    }

    public Integer getComensales() {
        return comensales;
    }

    public void setComensales(Integer comensales) {
        this.comensales = comensales;
    }

    public String getDemandas() {
        return demandas;
    }

    public void setDemandas(String demandas) {
        this.demandas = demandas;
    }
    
    
}
