/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.Evento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author 1GDAW12
 */
public class TablaEventos {
      private Connection con;
      private TablaEventos te;

    public TablaEventos(Connection con) {
        this.con = con;
    }

    public TablaEventos getTe() {
        return te;
    }

    public void setTe(TablaEventos te) {
        this.te = te;
    }

    public void insertar(Evento e) throws SQLException, Exception {
        String plantilla = "INSERT INTO evento VALUES (?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, e.getNombre());
        ps.setString(2,e.getLugar());
        ps.setDate(3,conversionDate(e.getFecha()));
        ps.setTime(4,conversionTime(e.getHoraInicio()));
        ps.setTime(5,conversionTime(e.getHoraFinalizacion()));
        ps.setInt(6,e.getNumeroPersonas());        
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }

    public static java.sql.Date conversionDate(LocalDate fecha) {
        return java.sql.Date.valueOf(fecha);
    }
    public static java.sql.Time conversionTime(LocalTime horaInicio) {
        return java.sql.Time.valueOf(horaInicio);
    }

    public void borrar(Evento e) throws SQLException, Exception {
        String plantilla = "DELETE FROM evento WHERE Nombre= ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, e.getNombre());
      
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
      
      
}
