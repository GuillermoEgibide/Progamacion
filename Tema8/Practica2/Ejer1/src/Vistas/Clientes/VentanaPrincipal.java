/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Clientes;

import ejer1.Ejer1;

/**
 *
 * @author 1GDAW12
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mClientes = new javax.swing.JMenu();
        miAltaCliente = new javax.swing.JMenuItem();
        miBajaCliente = new javax.swing.JMenuItem();
        miModificacionCliente = new javax.swing.JMenuItem();
        miConsultaCliente = new javax.swing.JMenuItem();
        mAbogados = new javax.swing.JMenu();
        miAltaAbogado = new javax.swing.JMenuItem();
        miBajaAbogado = new javax.swing.JMenuItem();
        miModificacionAbogados = new javax.swing.JMenuItem();
        miConsultaAbogado = new javax.swing.JMenuItem();
        mCasos = new javax.swing.JMenu();
        miAltaCasos = new javax.swing.JMenuItem();
        miAsignarAgobado = new javax.swing.JMenuItem();
        miBajaCasos = new javax.swing.JMenuItem();
        miModificacionCasos = new javax.swing.JMenuItem();
        miEditarEstado = new javax.swing.JMenuItem();
        miConsultaCasos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Gabinete de abogados");

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/unnamed.png"))); // NOI18N

        mClientes.setText("Clientes");
        mClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mClientesActionPerformed(evt);
            }
        });

        miAltaCliente.setText("Alta");
        miAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaClienteActionPerformed(evt);
            }
        });
        mClientes.add(miAltaCliente);

        miBajaCliente.setText("Baja");
        miBajaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBajaClienteActionPerformed(evt);
            }
        });
        mClientes.add(miBajaCliente);

        miModificacionCliente.setText("Modificacion");
        miModificacionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificacionClienteActionPerformed(evt);
            }
        });
        mClientes.add(miModificacionCliente);

        miConsultaCliente.setText("Consulta");
        mClientes.add(miConsultaCliente);

        jMenuBar1.add(mClientes);

        mAbogados.setText("Abogados");

        miAltaAbogado.setText("Alta");
        miAltaAbogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaAbogadoActionPerformed(evt);
            }
        });
        mAbogados.add(miAltaAbogado);

        miBajaAbogado.setText("Baja");
        miBajaAbogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBajaAbogadoActionPerformed(evt);
            }
        });
        mAbogados.add(miBajaAbogado);

        miModificacionAbogados.setText("Modificacion");
        miModificacionAbogados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificacionAbogadosActionPerformed(evt);
            }
        });
        mAbogados.add(miModificacionAbogados);

        miConsultaAbogado.setText("Consulta");
        miConsultaAbogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaAbogadoActionPerformed(evt);
            }
        });
        mAbogados.add(miConsultaAbogado);

        jMenuBar1.add(mAbogados);

        mCasos.setText("Casos");

        miAltaCasos.setText("Alta");
        miAltaCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaCasosActionPerformed(evt);
            }
        });
        mCasos.add(miAltaCasos);

        miAsignarAgobado.setText("Asignar Abogado");
        miAsignarAgobado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAsignarAgobadoActionPerformed(evt);
            }
        });
        mCasos.add(miAsignarAgobado);

        miBajaCasos.setText("Baja");
        miBajaCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBajaCasosActionPerformed(evt);
            }
        });
        mCasos.add(miBajaCasos);

        miModificacionCasos.setText("Modificacion");
        miModificacionCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificacionCasosActionPerformed(evt);
            }
        });
        mCasos.add(miModificacionCasos);

        miEditarEstado.setText("Editar Estado");
        miEditarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarEstadoActionPerformed(evt);
            }
        });
        mCasos.add(miEditarEstado);

        miConsultaCasos.setText("Consulta");
        miConsultaCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaCasosActionPerformed(evt);
            }
        });
        mCasos.add(miConsultaCasos);

        jMenuBar1.add(mCasos);

        jMenu1.setText("Salir");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jToggleButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miModificacionCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificacionCasosActionPerformed
        Ejer1.abrirVentanaModificacionCasos();
    }//GEN-LAST:event_miModificacionCasosActionPerformed

    private void miAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaClienteActionPerformed
        Ejer1.abrirVentanaClientes();
    }//GEN-LAST:event_miAltaClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Ejer1.terminar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void miBajaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBajaClienteActionPerformed
        Ejer1.abrirVentanaBajaCliente();
    }//GEN-LAST:event_miBajaClienteActionPerformed

    private void mClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mClientesActionPerformed
        Ejer1.abrirVentanaConsultaCliente();
    }//GEN-LAST:event_mClientesActionPerformed

    private void miAltaAbogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaAbogadoActionPerformed
        Ejer1.abrirVentanaAltaAbogados();
    }//GEN-LAST:event_miAltaAbogadoActionPerformed

    private void miBajaAbogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBajaAbogadoActionPerformed
        Ejer1.abrirVentanaBajaAbogados();
    }//GEN-LAST:event_miBajaAbogadoActionPerformed

    private void miModificacionAbogadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificacionAbogadosActionPerformed
        Ejer1.abrirVentanaModificacionAbogados();
    }//GEN-LAST:event_miModificacionAbogadosActionPerformed

    private void miModificacionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificacionClienteActionPerformed
        Ejer1.abrirVentanaModificacionACliente();
    }//GEN-LAST:event_miModificacionClienteActionPerformed

    private void miConsultaAbogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaAbogadoActionPerformed
        Ejer1.abrirVentanaConsultaAbogado();
    }//GEN-LAST:event_miConsultaAbogadoActionPerformed

    private void miAltaCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaCasosActionPerformed
        Ejer1.abrirVentanaAltaCasos();
    }//GEN-LAST:event_miAltaCasosActionPerformed

    private void miBajaCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBajaCasosActionPerformed
        Ejer1.abrirVentanaBajaCasos();
    }//GEN-LAST:event_miBajaCasosActionPerformed

    private void miEditarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarEstadoActionPerformed
        Ejer1.abrirVentanaEstadoCasos();
    }//GEN-LAST:event_miEditarEstadoActionPerformed

    private void miConsultaCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaCasosActionPerformed
        Ejer1.abrirVentanaConsultaCasos();
    }//GEN-LAST:event_miConsultaCasosActionPerformed

    private void miAsignarAgobadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAsignarAgobadoActionPerformed
        Ejer1.abrirVentanaAsignarAbogadoCasos();
    }//GEN-LAST:event_miAsignarAgobadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenu mAbogados;
    private javax.swing.JMenu mCasos;
    private javax.swing.JMenu mClientes;
    private javax.swing.JMenuItem miAltaAbogado;
    private javax.swing.JMenuItem miAltaCasos;
    private javax.swing.JMenuItem miAltaCliente;
    private javax.swing.JMenuItem miAsignarAgobado;
    private javax.swing.JMenuItem miBajaAbogado;
    private javax.swing.JMenuItem miBajaCasos;
    private javax.swing.JMenuItem miBajaCliente;
    private javax.swing.JMenuItem miConsultaAbogado;
    private javax.swing.JMenuItem miConsultaCasos;
    private javax.swing.JMenuItem miConsultaCliente;
    private javax.swing.JMenuItem miEditarEstado;
    private javax.swing.JMenuItem miModificacionAbogados;
    private javax.swing.JMenuItem miModificacionCasos;
    private javax.swing.JMenuItem miModificacionCliente;
    // End of variables declaration//GEN-END:variables
}
