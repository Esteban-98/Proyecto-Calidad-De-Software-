/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Admin.Usuario;

import DAOs.UsuarioDAO;
import Modelos.EntidadUsuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class AdminBuscarUsuario extends javax.swing.JFrame {

    UsuarioDAO uDAO = new UsuarioDAO();
    EntidadUsuario eu = new EntidadUsuario();
    
    DefaultTableModel modeloTabla = new DefaultTableModel();
    public AdminBuscarUsuario() {
        initComponents();
        colorEstado();
        this.setLocationRelativeTo(null);
        this.setTitle("Buscar Usuario");
        listar();
    }

    public void colorEstado(){
    
        TablaColorEstado color = new TablaColorEstado(7);
        jTableUsuarios.getColumnModel().getColumn(7).setCellRenderer(color);
        
    }
    public void listar(){
       
       List <EntidadUsuario> lista = uDAO.listar();
       modeloTabla = (DefaultTableModel)jTableUsuarios.getModel();
       Object[]ob = new Object[8];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdUsuario();
           ob[1] = lista.get(i).getNit();
           ob[2] = lista.get(i).getPrimerNombre();
           ob[3] = lista.get(i).getPrimerApellido();
           ob[4] = lista.get(i).getEdad();
           ob[5] = lista.get(i).getTelefono1();
           ob[6] = lista.get(i).getDireccion();
           if (lista.get(i).getEstadoUsuario()== 1){  
               ob[7] = "Activo";
           }else{
               ob[7] = "No activo ";
             }
           
           modeloTabla.addRow(ob);
       }
       
       jTableUsuarios.setModel(modeloTabla);
    }
    public void listarApellido(){
       
       List <EntidadUsuario> lista = uDAO.listarPorApellido();
       modeloTabla = (DefaultTableModel)jTableUsuarios.getModel();
       Object[]ob = new Object[8];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdUsuario();
           ob[1] = lista.get(i).getNit();
           ob[2] = lista.get(i).getPrimerNombre();
           ob[3] = lista.get(i).getPrimerApellido();
           ob[4] = lista.get(i).getEdad();
           ob[5] = lista.get(i).getTelefono1();
           ob[6] = lista.get(i).getDireccion();
           if (lista.get(i).getEstadoUsuario()== 1){  
               ob[7] = "Activo";
           }else{
               ob[7] = "No activo ";
             }
           
           modeloTabla.addRow(ob);
       }
       
       jTableUsuarios.setModel(modeloTabla);
    }
    public void listarEdad(){
       
       List <EntidadUsuario> lista = uDAO.listarPorEdad();
       modeloTabla = (DefaultTableModel)jTableUsuarios.getModel();
       Object[]ob = new Object[8];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdUsuario();
           ob[1] = lista.get(i).getNit();
           ob[2] = lista.get(i).getPrimerNombre();
           ob[3] = lista.get(i).getPrimerApellido();
           ob[4] = lista.get(i).getEdad();
           ob[5] = lista.get(i).getTelefono1();
           ob[6] = lista.get(i).getDireccion();
           if (lista.get(i).getEstadoUsuario()== 1){  
               ob[7] = "Activo";
           }else{
               ob[7] = "No activo ";
             }
           
           modeloTabla.addRow(ob);
       }
       
       jTableUsuarios.setModel(modeloTabla);
    }
    public void listarEstado(){
       
       List <EntidadUsuario> lista = uDAO.listarPorEstado();
       modeloTabla = (DefaultTableModel)jTableUsuarios.getModel();
       Object[]ob = new Object[8];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdUsuario();
           ob[1] = lista.get(i).getNit();
           ob[2] = lista.get(i).getPrimerNombre();
           ob[3] = lista.get(i).getPrimerApellido();
           ob[4] = lista.get(i).getEdad();
           ob[5] = lista.get(i).getTelefono1();
           ob[6] = lista.get(i).getDireccion();
           if (lista.get(i).getEstadoUsuario()== 1){  
               ob[7] = "Activo";
           }else{
               ob[7] = "No activo ";
             }
           
           modeloTabla.addRow(ob);
       }
       
       jTableUsuarios.setModel(modeloTabla);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonBAvanzada = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButtonListarApellido = new javax.swing.JButton();
        jButtonListarEdad = new javax.swing.JButton();
        jButtonListaEstado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonBuscarVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableUsuarios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "IDENTIFICACIÓN", "NOMBRE", "APELLIDO", "EDAD", "TELÉFONO", "DIRECCIÓN", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableUsuarios);
        if (jTableUsuarios.getColumnModel().getColumnCount() > 0) {
            jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTableUsuarios.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTableUsuarios.getColumnModel().getColumn(4).setPreferredWidth(5);
            jTableUsuarios.getColumnModel().getColumn(5).setPreferredWidth(50);
            jTableUsuarios.getColumnModel().getColumn(6).setPreferredWidth(50);
            jTableUsuarios.getColumnModel().getColumn(7).setPreferredWidth(40);
        }

        jButtonBAvanzada.setBackground(new java.awt.Color(205, 255, 204));
        jButtonBAvanzada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBAvanzada.setText("BÚSQUEDA AVANZADA");
        jButtonBAvanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBAvanzadaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("RESTABLECER ORDEN INICIAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonListarApellido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarApellido.setText("APELLIDO");
        jButtonListarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarApellidoActionPerformed(evt);
            }
        });

        jButtonListarEdad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarEdad.setText("EDAD");
        jButtonListarEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarEdadActionPerformed(evt);
            }
        });

        jButtonListaEstado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListaEstado.setText("ESTADO");
        jButtonListaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonListarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonListarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonListaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jButtonListarApellido)
                    .addComponent(jButtonListarEdad)
                    .addComponent(jButtonListaEstado))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jButtonBAvanzada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario.png"))); // NOI18N
        jLabel1.setText("BUSCAR USUARIO");

        jButtonBuscarVolver.setBackground(new java.awt.Color(255, 153, 153));
        jButtonBuscarVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBuscarVolver.setText("VOLVER");
        jButtonBuscarVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBuscarVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscarVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarVolverActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jButtonBuscarVolverActionPerformed

    private void jButtonBAvanzadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBAvanzadaActionPerformed
        // TODO add your handling code here:
        AdminBuscarEspUsuario abrir = new AdminBuscarEspUsuario();
        abrir.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonBAvanzadaActionPerformed
    public void limpiarTabla(){
    
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            modeloTabla.removeRow(i);
            i=i-1;
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarTabla();
        listar();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonListarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarApellidoActionPerformed
        limpiarTabla();
        listarApellido();
       
    }//GEN-LAST:event_jButtonListarApellidoActionPerformed

    private void jButtonListarEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarEdadActionPerformed
        limpiarTabla();
        listarEdad();
        
    }//GEN-LAST:event_jButtonListarEdadActionPerformed

    private void jButtonListaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaEstadoActionPerformed
        limpiarTabla();
        listarEstado();
       
    }//GEN-LAST:event_jButtonListaEstadoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBAvanzada;
    private javax.swing.JButton jButtonBuscarVolver;
    private javax.swing.JButton jButtonListaEstado;
    private javax.swing.JButton jButtonListarApellido;
    private javax.swing.JButton jButtonListarEdad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
    // End of variables declaration//GEN-END:variables
}
