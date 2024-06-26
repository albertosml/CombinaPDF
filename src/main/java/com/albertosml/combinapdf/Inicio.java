package com.albertosml.combinapdf;


import java.awt.MouseInfo;
import java.awt.Point;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author albertosml
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    private DefaultTableModel d;
    private int clickado;
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("CombinaPDF");
        
        d = (DefaultTableModel) tabla_archivos.getModel();
        clickado = -1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_elegir_archivos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_archivos = new javax.swing.JTable();
        archivo_salida = new javax.swing.JTextField();
        btn_elegir_directorio = new javax.swing.JButton();
        btn_combinar = new javax.swing.JButton();
        tit_entradas = new javax.swing.JLabel();
        tit_salida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_elegir_archivos.setText("Elegir PDF");
        btn_elegir_archivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elegir_archivosActionPerformed(evt);
            }
        });

        tabla_archivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Archivos a combinar"
            }
        ));
        tabla_archivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_archivosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_archivos);

        btn_elegir_directorio.setText("Elegir Directorio");
        btn_elegir_directorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elegir_directorioActionPerformed(evt);
            }
        });

        btn_combinar.setText("Combinar");
        btn_combinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_combinarActionPerformed(evt);
            }
        });

        tit_entradas.setText("Entradas:");

        tit_salida.setText("Salida:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_elegir_archivos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(archivo_salida)
                        .addGap(18, 18, 18)
                        .addComponent(btn_elegir_directorio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_combinar, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(tit_entradas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(tit_salida)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tit_entradas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tit_salida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_elegir_archivos)
                        .addGap(176, 176, 176)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(archivo_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_elegir_directorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btn_combinar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_elegir_archivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elegir_archivosActionPerformed
        JFileChooser elector = new JFileChooser();
        elector.setFileFilter(new FileNameExtensionFilter("PDF","pdf"));
        elector.setMultiSelectionEnabled(true);
        int r = elector.showOpenDialog(null);
        File [] files = elector.getSelectedFiles();
        if(r == JFileChooser.APPROVE_OPTION) for(File f: files) d.addRow(new Object[]{f.getAbsolutePath()});
    }//GEN-LAST:event_btn_elegir_archivosActionPerformed

    private void tabla_archivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_archivosMouseClicked
        Point p = MouseInfo.getPointerInfo().getLocation();
        
        int x = p.x - tabla_archivos.getLocationOnScreen().x;
        int y = p.y - tabla_archivos.getLocationOnScreen().y;
        int fila = tabla_archivos.rowAtPoint(new Point(x,y));
        
        if(fila >= 0) {
            if(clickado == -1) clickado = fila;
            else if(clickado != fila) {
                String el1 = (String) tabla_archivos.getValueAt(fila, 0);
                tabla_archivos.setValueAt(tabla_archivos.getValueAt(clickado, 0), fila, 0);
                tabla_archivos.setValueAt(el1, clickado, 0);
                clickado = -1;
            }
            else {
                d = (DefaultTableModel) tabla_archivos.getModel();
                d.removeRow(fila);
                clickado = -1;
            }
        }
        else clickado = -1;
    }//GEN-LAST:event_tabla_archivosMouseClicked

    private void btn_elegir_directorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elegir_directorioActionPerformed
        JFileChooser elector = new JFileChooser();
        elector.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int r = elector.showOpenDialog(null);
        File f = elector.getSelectedFile();
        if(r == JFileChooser.APPROVE_OPTION) archivo_salida.setText(f.getAbsolutePath());
    }//GEN-LAST:event_btn_elegir_directorioActionPerformed

    private void btn_combinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_combinarActionPerformed
        int num_filas = tabla_archivos.getRowCount();
        if(num_filas > 0) {
            String ruta = archivo_salida.getText();
            if(ruta.matches(".+pdf$")) {
                ArrayList<String> arch = new ArrayList<>();
                for(int i=0;i<num_filas;i++) arch.add((String) tabla_archivos.getValueAt(i, 0));
                Combina c = new Combina();
                String s = c.combinar(arch, ruta);
                if("error".equals(s)) JOptionPane.showMessageDialog(rootPane,"Error al combinar los PDF, revise los archivos de entrada");
                else JOptionPane.showMessageDialog(rootPane,"PDF combinados con éxito");
                archivo_salida.setText("");
            }
            else JOptionPane.showMessageDialog(rootPane,"No se ha introducido un PDF en el que guardar el resultado de la combinación");
        }
        else JOptionPane.showMessageDialog(rootPane,"No se ha introducido archivos PDF para combinar");
    }//GEN-LAST:event_btn_combinarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField archivo_salida;
    private javax.swing.JButton btn_combinar;
    private javax.swing.JButton btn_elegir_archivos;
    private javax.swing.JButton btn_elegir_directorio;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_archivos;
    private javax.swing.JLabel tit_entradas;
    private javax.swing.JLabel tit_salida;
    // End of variables declaration//GEN-END:variables
}
