/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ejer2.Ejer2;
import javax.swing.JOptionPane;

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

        jToolBar1 = new javax.swing.JToolBar();
        bCrear = new javax.swing.JToggleButton();
        bCancelar = new javax.swing.JToggleButton();
        bModificar = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        bSalir = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton6 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miCrear = new javax.swing.JMenuItem();
        miCancelar = new javax.swing.JMenuItem();
        miModificar = new javax.swing.JMenuItem();
        mOpciones = new javax.swing.JMenu();
        miConfirmarAsistencia = new javax.swing.JMenuItem();
        miListadoEventos = new javax.swing.JMenuItem();
        miSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        bCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        bCrear.setFocusable(false);
        bCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bCrear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearActionPerformed(evt);
            }
        });
        jToolBar1.add(bCrear);

        bCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga (1).png"))); // NOI18N
        bCancelar.setFocusable(false);
        bCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(bCancelar);

        bModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga (2).png"))); // NOI18N
        bModificar.setToolTipText("");
        bModificar.setFocusable(false);
        bModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(bModificar);

        jToggleButton4.setText("jToggleButton4");
        jToggleButton4.setFocusable(false);
        jToggleButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButton4);

        jToggleButton7.setText("jToggleButton7");
        jToggleButton7.setFocusable(false);
        jToggleButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButton7);

        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga (3).png"))); // NOI18N
        bSalir.setFocusable(false);
        bSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(bSalir);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido a los Eventos de la empresa");

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.jpg"))); // NOI18N

        jMenu1.setText("Eventos");

        miCrear.setText("Crear");
        miCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearActionPerformed(evt);
            }
        });
        jMenu1.add(miCrear);

        miCancelar.setText("Cancelar");
        miCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCancelarActionPerformed(evt);
            }
        });
        jMenu1.add(miCancelar);

        miModificar.setText("Modificar");
        miModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarActionPerformed(evt);
            }
        });
        jMenu1.add(miModificar);

        jMenuBar1.add(jMenu1);

        mOpciones.setText("Opciones");
        mOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mOpcionesActionPerformed(evt);
            }
        });

        miConfirmarAsistencia.setText("Confirmar Asistencia");
        mOpciones.add(miConfirmarAsistencia);

        miListadoEventos.setText("Listado eventos");
        mOpciones.add(miListadoEventos);

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mOpciones.add(miSalir);

        jMenuBar1.add(mOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jToggleButton6)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton6)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCancelarActionPerformed
       try{
           String nombre = JOptionPane.showInputDialog(this, "Tecle el nombre del evento que desees eliminar");
           Ejer2.borrarEvento(nombre);
           JOptionPane.showMessageDialog(this,"Evento eliminado con exito");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }//GEN-LAST:event_miCancelarActionPerformed

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
       miCrear.doClick();
    }//GEN-LAST:event_bCrearActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
       miSalir.doClick();
    }//GEN-LAST:event_bSalirActionPerformed

    private void miCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearActionPerformed
        Ejer2.abrirVentana();
    }//GEN-LAST:event_miCrearActionPerformed

    private void mOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mOpcionesActionPerformed
        
    }//GEN-LAST:event_mOpcionesActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        Ejer2.salirVentana();
    }//GEN-LAST:event_miSalirActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        miCancelar.doClick();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
       miModificar.doClick();
    }//GEN-LAST:event_bModificarActionPerformed

    private void miModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarActionPerformed
        try{
            /*Ejer2.modificar();*/
            JOptionPane.showMessageDialog(this, "Evento Modificado");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_miModificarActionPerformed

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
    private javax.swing.JToggleButton bCancelar;
    private javax.swing.JToggleButton bCrear;
    private javax.swing.JToggleButton bModificar;
    private javax.swing.JToggleButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mOpciones;
    private javax.swing.JMenuItem miCancelar;
    private javax.swing.JMenuItem miConfirmarAsistencia;
    private javax.swing.JMenuItem miCrear;
    private javax.swing.JMenuItem miListadoEventos;
    private javax.swing.JMenuItem miModificar;
    private javax.swing.JMenuItem miSalir;
    // End of variables declaration//GEN-END:variables
}
