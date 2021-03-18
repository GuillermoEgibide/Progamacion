/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import ModeloUML.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW12
 */
public class TablaPersonas {
    private Connection con;

    public TablaPersonas(Connection con) {
        this.con = con;
    }

    public void insertar(Persona p) throws Exception {
        String plantilla = "INSERT INTO personas VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getNombre());
        ps.setInt(2,p.getEdad());
        ps.setString(3,p.getProfesion());
        ps.setString(4,p.getTelefono());
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
    
     public ArrayList<Persona>  seleccionarTodo() throws Exception{
         ArrayList<Persona> lista = new ArrayList();
         String plantilla = "select * from personas";
         PreparedStatement ps = con.prepareStatement(plantilla);
         
         ResultSet resultado = ps.executeQuery();
          while(resultado.next())
       {
         Persona p = new Persona();
         p.setNombre(resultado.getString("nombre"));
         p.setEdad(Integer.parseInt(resultado.getString("edad")));
         p.setProfesion(resultado.getString("profesion"));
         p.setTelefono(resultado.getString("telefono"));
         lista.add(p);
       }
         return lista;
     }
}
