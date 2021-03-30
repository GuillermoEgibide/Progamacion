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
public class TablaCasos {
    private Connection con;
    private TablaCasos tc;      

    public TablaCasos(Connection con) {
        this.con = con;
    }

    public TablaCasos getTc() {
        return tc;
    }

    public void setTc(TablaCasos tc) {
        this.tc = tc;
    }
    
    
}
