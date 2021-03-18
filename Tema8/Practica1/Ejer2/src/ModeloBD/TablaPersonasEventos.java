/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import java.sql.Connection;

/**
 *
 * @author 1GDAW12
 */
public class TablaPersonasEventos {
    private Connection con;
    private TablaPersonasEventos tpe;

    public TablaPersonasEventos(Connection con) {
        this.con = con;
    }

    public TablaPersonasEventos getTpe() {
        return tpe;
    }

    public void setTpe(TablaPersonasEventos tpe) {
        this.tpe = tpe;
    }
    
    
}
