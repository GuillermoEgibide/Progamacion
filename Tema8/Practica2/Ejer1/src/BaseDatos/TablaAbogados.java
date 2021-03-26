/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import Modelo.Abogado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 1GDAW12
 */
public class TablaAbogados {
    private Connection con;
    private TablaAbogados ta;

    public TablaAbogados(Connection con) {
        this.con = con;
    }

    public TablaAbogados getTa() {
        return ta;
    }

    public void setTa(TablaAbogados ta) {
        this.ta = ta;
    }

    public void insertar(Abogado a) throws SQLException, Exception {
        String plantilla = "INSERT INTO abogado VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, a.getDni());
        ps.setString(2,a.getNombre());
        ps.setString(3,a.getApellidos());
        ps.setString(4,a.getCorreo());
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
    
    
}
