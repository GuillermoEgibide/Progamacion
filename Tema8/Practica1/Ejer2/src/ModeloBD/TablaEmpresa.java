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
public class TablaEmpresa {
    private Connection con;
    private TablaEmpresa tem;

    public TablaEmpresa(Connection con) {
        this.con = con;
    }

    public TablaEmpresa getTem() {
        return tem;
    }

    public void setTem(TablaEmpresa tem) {
        this.tem = tem;
    }
    
    
}
