/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectointegrado.dao.DAOPersona;
import proyectointegrado.dao.FactoryDAO;
import proyectointegrado.dao.Persona;

/**
 *
 * @author Luis Alberto
 */
public class TablaPersonas extends javax.swing.JInternalFrame {

    private static TablaPersonas tablPer = null;
    private DAOPersona daoPer = (DAOPersona) FactoryDAO.create(FactoryDAO.TypeDAO.PERSONA);
    private Persona per = new Persona();
    private  DefaultTableModel modelo;

    public static TablaPersonas getInstace() {
        if (tablPer == null) {
            tablPer = new TablaPersonas();
            return tablPer;
        }
        return tablPer;
    }
    
    /** Creates new form TablaPersonas */
    public TablaPersonas() {
        initComponents();
        modelo = (DefaultTableModel) jTable1.getModel();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MostrarUno = new javax.swing.JMenuItem();
        MostrarTodos = new javax.swing.JMenuItem();

        setClosable(true);
        setTitle("Tabla Personas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Nombre", "Direccion", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("Mostrar");

        MostrarUno.setText("Mostrar Uno");
        MostrarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarUnoActionPerformed(evt);
            }
        });
        jMenu1.add(MostrarUno);

        MostrarTodos.setText("Mostrar Todos");
        MostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTodosActionPerformed(evt);
            }
        });
        jMenu1.add(MostrarTodos);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarUnoActionPerformed
        // TODO add your handling code here:
         per.setClave(JOptionPane.showInputDialog("Ingrese la clave"));
         daoPer.MostrarUno(per, modelo);
    }//GEN-LAST:event_MostrarUnoActionPerformed

    private void MostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTodosActionPerformed
        // TODO add your handling code here:
        daoPer.MostrarTodos(modelo);
    }//GEN-LAST:event_MostrarTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MostrarTodos;
    private javax.swing.JMenuItem MostrarUno;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
