/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import Vista.V1;

/**
 *
 * @author Guillermo
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    private static V1 v1;
    public static void main(String[] args) {
      v1 = new V1();
      v1.setVisible(true);
    }

    public static void salir() {
        v1.dispose();
        System.exit(0);
    }
    
}
