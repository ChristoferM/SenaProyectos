/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pizzeriaproject.vistas;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import pizzeriaproject.jdbc.CategoriasJDBC;
import pizzeriaproject.modelos.Categoria;

/**
 *
 * @author krist
 */
public class VistaCategoria extends javax.swing.JPanel {

    CategoriasJDBC conexionJDBC = new CategoriasJDBC();

    DefaultTableModel tablaCategoriaModel = new DefaultTableModel();

    /**
     * Creates new form VistaCategoria
     */
    public VistaCategoria() {
        initComponents();
        configurarModelo();

    }

    private void configurarModelo() {
        String[] titulosTabla = {"id", "nombre"};
        tablaCategoriaModel.setColumnIdentifiers(titulosTabla);
        jTableCategorias.setModel(tablaCategoriaModel);

    }

    private void mostrarDatos() {
        System.out.println("Buscando Categroias");
        try {
            List<Categoria> listaCategoria = this.conexionJDBC.obtenerDatosCategoria();
            if (!listaCategoria.isEmpty()) {
                Object[] datos = new Object[tablaCategoriaModel.getColumnCount()];

                this.limpiarTabla();

                for (Categoria categoria : listaCategoria) {
                    datos[0] = categoria.getCodigo();
                    datos[1] = categoria.getNombre();
                    tablaCategoriaModel.addRow(datos);
                }

                jTableCategorias.setModel(tablaCategoriaModel);
            } else {
                System.out.println("NO HAY DATOS");
            }

        } catch (SQLException ex) {
            Logger.getLogger(VistaCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void limpiarTabla() {
        for (int i = tablaCategoriaModel.getRowCount() - 1; i >= 0; i--) {
            tablaCategoriaModel.removeRow(i);
        }
    }

    ;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCategorias = new javax.swing.JTable();
        btnBuscarCategorias = new javax.swing.JButton();
        jTextNombreCategoria = new javax.swing.JTextField();
        btnAgregarCategoria = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(670, 304));

        jTableCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableCategorias);

        btnBuscarCategorias.setText("Buscar Categorias");
        btnBuscarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCategoriasActionPerformed(evt);
            }
        });

        jTextNombreCategoria.setText("Nombre de Categoria");
        jTextNombreCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreCategoriaActionPerformed(evt);
            }
        });

        btnAgregarCategoria.setText("Agregar ");
        btnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarCategorias)
                    .addComponent(jTextNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnBuscarCategorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnAgregarCategoria)
                .addGap(28, 28, 28)
                .addComponent(jTextNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCategoriasActionPerformed
        this.mostrarDatos();
    }//GEN-LAST:event_btnBuscarCategoriasActionPerformed

    private void jTextNombreCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreCategoriaActionPerformed

    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed

        String nobreNuevoCategoria = jTextNombreCategoria.getText().toString().toLowerCase();

        if (nobreNuevoCategoria.length() > 3) {
            // se guarda el nombre
            this.conexionJDBC.crearDatosCategoria(nobreNuevoCategoria);
            this.mostrarDatos();
        }
    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnBuscarCategorias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCategorias;
    private javax.swing.JTextField jTextNombreCategoria;
    // End of variables declaration//GEN-END:variables
}