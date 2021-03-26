/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 1GDAW12
 */
public class TablaCliente {
    private Connection con;
    private TablaCliente tc;

    public TablaCliente(Connection con) {
        this.con = con;
    }
    
    public TablaCliente getTc() {
        return tc;
    }

    public void setTc(TablaCliente tc) {
        this.tc = tc;
    }

    public void insertar(Cliente c) throws SQLException, Exception {
        String plantilla = "INSERT INTO cliente VALUES (?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, c.getDni());
        ps.setString(2,c.getNombre());
        ps.setString(3,c.getApellido());
        ps.setString(4,c.getDireccion());
        ps.setInt(5,c.getTelefono());
        ps.setString(6,c.getCorreo());
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
    
    
}
