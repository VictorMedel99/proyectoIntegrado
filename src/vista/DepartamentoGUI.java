/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Component;
import vista.Principal;
import javax.swing.JOptionPane;
import proyectointegrado.dao.*;

/**
 *
 * @author Luis Alberto
 */
public class DepartamentoGUI extends javax.swing.JInternalFrame {

    private static DepartamentoGUI depgui = null;
    private Departamento dep = new Departamento();
    private DAOdepartamento daoDep = (DAOdepartamento) FactoryDAO.create(FactoryDAO.TypeDAO.DEPARTAMENTO);

    public static DepartamentoGUI getInstace() {
        if (depgui == null) {
            depgui = new DepartamentoGUI();
            return depgui;
        }
        return depgui;
    }

    /**
     * Creates new form DEpartamentoGUI
     */
    private DepartamentoGUI() {
        initComponents();
        this.setTitle("Departamento");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmpNombre = new javax.swing.JTextField();
        cmpClave = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btoNuevo = new javax.swing.JButton();
        btoGuardar = new javax.swing.JButton();
        btoModificar = new javax.swing.JButton();
        btoEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(300, 400));
        setPreferredSize(new java.awt.Dimension(300, 400));

        jLabel1.setText("Clave:");

        jLabel2.setText("Nombre:");

        jToolBar1.setRollover(true);

        btoNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new.png"))); // NOI18N
        btoNuevo.setToolTipText("Nuevo");
        btoNuevo.setFocusable(false);
        btoNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btoNuevo);

        btoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        btoGuardar.setToolTipText("Guardar");
        btoGuardar.setFocusable(false);
        btoGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoGuardar);

        btoModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/update.png"))); // NOI18N
        btoModificar.setToolTipText("Modificar");
        btoModificar.setFocusable(false);
        btoModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoModificar);

        btoEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btoEliminar.setToolTipText("Eliminar");
        btoEliminar.setFocusable(false);
        btoEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btoEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btoEliminar);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostrar-propiedades.png"))); // NOI18N
        jButton1.setToolTipText("Mostrar");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmpNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmpClave)))
                .addGap(6, 6, 6))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar() {
        cmpClave.setText("");
        cmpNombre.setText("");
    }
    private void btoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btoNuevoActionPerformed

    private void btoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoGuardarActionPerformed
        // TODO add your handling code here:
        dep.setClave(cmpClave.getText().trim());
        dep.setNombre(cmpNombre.getText().trim());
        if (daoDep.guardar(dep)) {
            JOptionPane.showMessageDialog(null, "Se guardo con exito");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
        }
        limpiar();
    }//GEN-LAST:event_btoGuardarActionPerformed

    private void btoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoModificarActionPerformed
        // TODO add your handling code here:
        dep.setClave(cmpClave.getText().trim());
        dep.setNombre(cmpNombre.getText().trim());
        if(daoDep.actualizar(dep)){
            JOptionPane.showMessageDialog(null, "Se actualizo con exito");
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Registro no existente");
        }
    }//GEN-LAST:event_btoModificarActionPerformed

    private void btoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoEliminarActionPerformed
        // TODO add your handling code here:
        dep.setClave(cmpClave.getText().trim());
        dep.setNombre(cmpNombre.getText().trim());
        if(daoDep.borrar(dep)){
            JOptionPane.showMessageDialog(null, "Se borro con exito");
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Registro no existente");
        }
    }//GEN-LAST:event_btoEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TablaDepartamento dep = TablaDepartamento.getInstace();
        dep.setVisible(true);
        
        for (Component com : Principal.jDesktopPane1.getComponents()) {
            if (com.equals(dep)) {
                return;
            }
            
        }
        Principal.jDesktopPane1.add(dep);
        dep.toFront();
        

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoEliminar;
    private javax.swing.JButton btoGuardar;
    private javax.swing.JButton btoModificar;
    private javax.swing.JButton btoNuevo;
    private javax.swing.JTextField cmpClave;
    private javax.swing.JTextField cmpNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
