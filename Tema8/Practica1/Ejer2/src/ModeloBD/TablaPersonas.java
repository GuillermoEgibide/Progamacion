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
public class TablaPersonas {
    private Connection con;
    private TablaPersonas tp;

    public TablaPersonas(Connection con) {
        this.con = con;
    }

    public TablaPersonas getTp() {
        return tp;
    }

    public void setTp(TablaPersonas tp) {
        this.tp = tp;
    }
    
    
}
