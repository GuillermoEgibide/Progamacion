/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.sql.Connection;

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
    
    
}
