/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Admin.Devoluciones;

import DAOs.ClienteDAO;
import DAOs.DetalleVentaDAO;
import DAOs.ProductoDAO;
import DAOs.UsuarioDAO;
import DAOs.VentaDAO;
import Modelos.EntidadCliente;
import Modelos.EntidadDetalleVenta;
import Modelos.EntidadProducto;
import Modelos.EntidadUsuario;
import Modelos.EntidadVenta;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AdminDevTotal extends javax.swing.JFrame {

    UsuarioDAO uDAO = new UsuarioDAO();
    EntidadUsuario eu = new EntidadUsuario();
    ClienteDAO cDAO = new ClienteDAO();
    EntidadCliente ec = new EntidadCliente();
    ProductoDAO pDAO = new ProductoDAO();
    EntidadProducto ep = new EntidadProducto();
    VentaDAO vDAO = new VentaDAO();
    EntidadVenta ev = new EntidadVenta();
    DetalleVentaDAO dvDAO = new DetalleVentaDAO();
    EntidadDetalleVenta edv = new EntidadDetalleVenta();
    DefaultTableModel modelo = new DefaultTableModel();
    public AdminDevTotal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Devolución De Venta Total");
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldClienteNit = new javax.swing.JTextField();
        jTextFieldClienteNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldClienteApellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldClienteTelefono = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetalleVenta = new javax.swing.JTable();
        jTextFieldTotalVenta = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldEstadoVenta = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldIdVenta = new javax.swing.JTextField();
        jButtonBuscarVenta = new javax.swing.JButton();
        jButtonCambiarEstadoVenta = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Devolucion.png"))); // NOI18N
        jLabel1.setText("DEVOLUCIÓN VENTA TOTAL");

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("IDENTIFICACIÓN/NIT");

        jTextFieldClienteNit.setEditable(false);
        jTextFieldClienteNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteNitActionPerformed(evt);
            }
        });

        jTextFieldClienteNombre.setEditable(false);
        jTextFieldClienteNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteNombreActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NOMBRE");

        jTextFieldClienteApellido.setEditable(false);
        jTextFieldClienteApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteApellidoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("APELLIDO");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TELÉFONO");

        jTextFieldClienteTelefono.setEditable(false);
        jTextFieldClienteTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldClienteNit, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(jTextFieldClienteNombre)
                    .addComponent(jTextFieldClienteApellido)
                    .addComponent(jTextFieldClienteTelefono))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldClienteNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldClienteApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldClienteTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos de la venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jTableDetalleVenta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTableDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOMBRE", "T6", "T8", "T10", "T12", "T14", "T16", "T18", "T20", "T22", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDetalleVenta);
        if (jTableDetalleVenta.getColumnModel().getColumnCount() > 0) {
            jTableDetalleVenta.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTableDetalleVenta.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTableDetalleVenta.getColumnModel().getColumn(2).setPreferredWidth(2);
            jTableDetalleVenta.getColumnModel().getColumn(3).setPreferredWidth(2);
            jTableDetalleVenta.getColumnModel().getColumn(4).setPreferredWidth(2);
            jTableDetalleVenta.getColumnModel().getColumn(5).setPreferredWidth(2);
            jTableDetalleVenta.getColumnModel().getColumn(6).setPreferredWidth(2);
            jTableDetalleVenta.getColumnModel().getColumn(7).setPreferredWidth(2);
            jTableDetalleVenta.getColumnModel().getColumn(8).setPreferredWidth(2);
            jTableDetalleVenta.getColumnModel().getColumn(9).setPreferredWidth(2);
            jTableDetalleVenta.getColumnModel().getColumn(10).setPreferredWidth(2);
            jTableDetalleVenta.getColumnModel().getColumn(11).setPreferredWidth(50);
        }

        jTextFieldTotalVenta.setEditable(false);
        jTextFieldTotalVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalVentaActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("TOTAL ");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("ESTADO DE LA VENTA");

        jTextFieldEstadoVenta.setEditable(false);
        jTextFieldEstadoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldEstadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(jTextFieldEstadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jTextFieldTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ID VENTA");

        jTextFieldIdVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdVentaActionPerformed(evt);
            }
        });
        jTextFieldIdVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdVentaKeyTyped(evt);
            }
        });

        jButtonBuscarVenta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBuscarVenta.setText("BUSCAR");
        jButtonBuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarVentaActionPerformed(evt);
            }
        });

        jButtonCambiarEstadoVenta.setBackground(new java.awt.Color(0, 153, 255));
        jButtonCambiarEstadoVenta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCambiarEstadoVenta.setText("CAMBIAR ESTADO DE VENTA");
        jButtonCambiarEstadoVenta.setEnabled(false);
        jButtonCambiarEstadoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarEstadoVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCambiarEstadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonCambiarEstadoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonVolver.setBackground(new java.awt.Color(255, 153, 153));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonVolver.setText("VOLVER");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldClienteNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteNitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteNitActionPerformed

    private void jTextFieldClienteNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteNombreActionPerformed

    private void jTextFieldClienteApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteApellidoActionPerformed

    private void jTextFieldClienteTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteTelefonoActionPerformed

    private void jTextFieldTotalVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalVentaActionPerformed

    private void jTextFieldIdVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdVentaActionPerformed

    private void jButtonBuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarVentaActionPerformed
        // TODO add your handling code here:
        
        limpiarTabla();
        buscarVenta();
    
        
    }//GEN-LAST:event_jButtonBuscarVentaActionPerformed

    public void limpiarTabla(){
    
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
    public void buscarVenta(){
                 
        
        if(jTextFieldIdVenta.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Debe ingresar el ID de la venta, en la caja de texto");
            jTextFieldIdVenta.requestFocus();
        }else{
            int idVenta = Integer.parseInt(jTextFieldIdVenta.getText());
            ev = vDAO.buscarPorId(idVenta);
            if (ev.getIdVenta()!= 0 ){
                //captura datos del cliente
                int idCliente = ev.getIdCliente();
                ec = cDAO.buscarPorId(idCliente);
                String nitCliente = ec.getNit();
                String nombreCliente = ec.getNombre();
                String apellidoCliente = ec.getApellido();
                String telefonoCliente = ec.getTelefono();
                jTextFieldClienteNit.setText(nitCliente);
                jTextFieldClienteNombre.setText(nombreCliente);
                jTextFieldClienteApellido.setText(apellidoCliente);
                jTextFieldClienteTelefono.setText(telefonoCliente);
                // fin datos clientes
                
                //datos nativo de la venta
                if(ev.getEstadoVenta()==1){
                jTextFieldEstadoVenta.setForeground(Color.GREEN);
                jTextFieldEstadoVenta.setText("Activa");
                jButtonCambiarEstadoVenta.setEnabled(true);
                }else{
                jTextFieldEstadoVenta.setForeground(Color.RED);
                jTextFieldEstadoVenta.setText("No activa");
                jButtonCambiarEstadoVenta.setEnabled(false);
                }
                
                jTextFieldTotalVenta.setText(String.valueOf(ev.getTotal()));
                //fin datos nativos venta
                
                buscarDetalleVenta();
                    jTextFieldIdVenta.setEditable(false);
        jButtonBuscarVenta.setEnabled(false);
            }else{
                 JOptionPane.showMessageDialog(this,"El ID de venta no existe o el la venta ya no está activa");
                 jTextFieldIdVenta.requestFocus();
             }
        } 
    }
    
    
    public void buscarDetalleVenta(){
        int idVenta = Integer.parseInt(jTextFieldIdVenta.getText());
        List <EntidadDetalleVenta> lista = dvDAO.listarPorIdVenta(idVenta);
        modelo = (DefaultTableModel)jTableDetalleVenta.getModel();
        Object[]ob = new Object[12];
        
        for (int i = 0; i < lista.size(); i++) {
           int idProducto = lista.get(i).getIdProducto();
           ep = pDAO.buscarPorId(idProducto);
           String codigoProducto = ep.getCodigo();
           String nombreProducto = ep.getNombre();
           ob[0] = codigoProducto;// codigo producto
           ob[1] = nombreProducto;// nombre producto
           ob[2] = lista.get(i).getT6();
           ob[3] = lista.get(i).getT8();
           ob[4] = lista.get(i).getT10();
           ob[5] = lista.get(i).getT12();
           ob[6] = lista.get(i).getT14();
           ob[7] = lista.get(i).getT16();
           ob[8] = lista.get(i).getT18();
           ob[9] = lista.get(i).getT20();
           ob[10] = lista.get(i).getT22();
           ob[11] = lista.get(i).getSubtotal();
   
           modelo.addRow(ob);
        }
        
    jTableDetalleVenta.setModel(modelo);
    }
    private void jTextFieldEstadoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoVentaActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        AdminRealizarDevolucion abrir = new AdminRealizarDevolucion();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonCambiarEstadoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarEstadoVentaActionPerformed
        // TODO add your handling code here:
        cambiarEstadoVenta();
        actualizarInventario();
        JOptionPane.showMessageDialog(this, "Devolución exitosa");
        limpiarTabla();
        jTextFieldIdVenta.setText("");
        jTextFieldIdVenta.setEditable(true);
        jButtonBuscarVenta.setEnabled(true);
        reiniciarDev();
        jButtonCambiarEstadoVenta.setEnabled(false);
        
    }//GEN-LAST:event_jButtonCambiarEstadoVentaActionPerformed

    private void reiniciarDev(){
  
    jTextFieldClienteNit.setText("");
    jTextFieldClienteNombre.setText("");
    jTextFieldClienteApellido.setText("");
    jTextFieldClienteTelefono.setText("");
    jTextFieldEstadoVenta.setText("");
    jTextFieldTotalVenta.setText("");
  
    }
    private void jTextFieldIdVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdVentaKeyTyped
        char v = evt.getKeyChar();
        int c = (int) evt.getKeyChar();

        soloNumeros(evt, v, c);
    }//GEN-LAST:event_jTextFieldIdVentaKeyTyped
   public void soloNumeros(java.awt.event.KeyEvent evt, char v, int c){
    

        if (Character.isLetter(v)){
        
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(this, "Digita solo números");
            
        }
        if (Character.isSpaceChar(v)){
        
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "No ingrese espacios en blanco");
            
        }
        if (c > 32 && c <= 47 || c >= 58 && c <= 64 || c >= 91 && c <= 96 || c >= 123 && c <= 208 || c >= 210 && c <= 240 || c >= 242 && c <=255){
        
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(this, "No ingrese caracteres especiales");
            
        }
    }
    
    public void cambiarEstadoVenta(){
        
        int idVenta = Integer.parseInt(jTextFieldIdVenta.getText());
        int estado = 2;
        
        if(jTextFieldIdVenta.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Debe ingresar el ID de venta en la caja de texto");
            jTextFieldIdVenta.requestFocus();
        }else{
            
        Object[] ob = new Object[2];
        
        ob[0]= estado;
        ob[1]= idVenta;
        
        vDAO.habilitarDeshabilitar(ob);
        
        
        }
    }
    public void actualizarInventario(){
    
            for (int i = 0; i < jTableDetalleVenta.getRowCount(); i++) {
            
            String codigoProducto = jTableDetalleVenta.getValueAt(i, 0).toString();
            ep = pDAO.buscar(codigoProducto);
            int ActT6 = ep.getT6();
            int ActT8 = ep.getT8();
            int ActT10 = ep.getT10();
            int ActT12 = ep.getT12();
            int ActT14 = ep.getT14();
            int ActT16 = ep.getT16();
            int ActT18 = ep.getT18();
            int ActT20 = ep.getT20();
            int ActT22 = ep.getT22();
            
            int CantT6 = Integer.parseInt(jTableDetalleVenta.getValueAt(i, 2).toString());
            int CantT8 = Integer.parseInt(jTableDetalleVenta.getValueAt(i, 3).toString());
            int CantT10 = Integer.parseInt(jTableDetalleVenta.getValueAt(i, 4).toString());
            int CantT12 = Integer.parseInt(jTableDetalleVenta.getValueAt(i, 5).toString());
            int CantT14 = Integer.parseInt(jTableDetalleVenta.getValueAt(i, 6).toString());
            int CantT16 = Integer.parseInt(jTableDetalleVenta.getValueAt(i, 7).toString());
            int CantT18 = Integer.parseInt(jTableDetalleVenta.getValueAt(i, 8).toString());
            int CantT20 = Integer.parseInt(jTableDetalleVenta.getValueAt(i, 9).toString());
            int CantT22 = Integer.parseInt(jTableDetalleVenta.getValueAt(i, 10).toString());
            
            int NT6 = ActT6 + CantT6;
            int NT8 = ActT8 + CantT8;
            int NT10 = ActT10 + CantT10;
            int NT12 = ActT12 + CantT12;
            int NT14 = ActT14 + CantT14;
            int NT16 = ActT16 + CantT16;
            int NT18 = ActT18 + CantT18;
            int NT20 = ActT20 + CantT20;
            int NT22 = ActT22 + CantT22;
            
            int NStock = NT6 + NT8 + NT10 + NT12 + NT14 + NT16 + NT18 + NT20 + NT22; 
            
            Object[] ob = new Object[11];
        
            ob[0]= NT6;
            ob[1]= NT8;
            ob[2]= NT10;
            ob[3]= NT12;
            ob[4]= NT14;
            ob[5]= NT16;
            ob[6]= NT18;
            ob[7]= NT20;
            ob[8]= NT22;
            ob[9]= NStock;
            ob[10]= codigoProducto;

            
            pDAO.reabastecer(ob);

        }
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarVenta;
    private javax.swing.JButton jButtonCambiarEstadoVenta;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetalleVenta;
    private javax.swing.JTextField jTextFieldClienteApellido;
    private javax.swing.JTextField jTextFieldClienteNit;
    private javax.swing.JTextField jTextFieldClienteNombre;
    private javax.swing.JTextField jTextFieldClienteTelefono;
    private javax.swing.JTextField jTextFieldEstadoVenta;
    private javax.swing.JTextField jTextFieldIdVenta;
    private javax.swing.JTextField jTextFieldTotalVenta;
    // End of variables declaration//GEN-END:variables
}
