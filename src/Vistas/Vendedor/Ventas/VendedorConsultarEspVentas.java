/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Vendedor.Ventas;


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
import Vistas.AutenticacionMenu.FormMenuVendedor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VendedorConsultarEspVentas extends javax.swing.JFrame {

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
    public VendedorConsultarEspVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Consultar Venta Detallada");

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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldClienteNit = new javax.swing.JTextField();
        jTextFieldClienteNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldClienteApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldClienteTelefono = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldVendedorNit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldVendedorNombre = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldVendedorApellido = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetalleVenta = new javax.swing.JTable();
        jTextFieldVentaTotal = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldVentaEstado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldidVenta = new javax.swing.JTextField();
        jButtonBuscarVenta = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ventas.png"))); // NOI18N
        jLabel1.setText("CONSULTAR VENTA DETALLADA");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("IDENTIFICACIÓN/NIT");

        jTextFieldClienteNit.setEnabled(false);
        jTextFieldClienteNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteNitActionPerformed(evt);
            }
        });

        jTextFieldClienteNombre.setEnabled(false);
        jTextFieldClienteNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteNombreActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE");

        jTextFieldClienteApellido.setEnabled(false);
        jTextFieldClienteApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteApellidoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("APELLIDO");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TELÉFONO");

        jTextFieldClienteTelefono.setEnabled(false);
        jTextFieldClienteTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldClienteNit, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(jTextFieldClienteNombre)
                    .addComponent(jTextFieldClienteApellido)
                    .addComponent(jTextFieldClienteTelefono))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldClienteNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldClienteApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldClienteTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Vendedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("IDENTIFICACIÓN");

        jTextFieldVendedorNit.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NOMBRE");

        jTextFieldVendedorNombre.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("APELLIDO");

        jTextFieldVendedorApellido.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldVendedorNit, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldVendedorApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldVendedorNombre))
                        .addGap(3, 3, 3))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldVendedorNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldVendedorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldVendedorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos de la venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

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

        jTextFieldVentaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVentaTotalActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("TOTAL ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ESTADO");

        jTextFieldVentaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVentaEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVentaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldVentaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jTextFieldVentaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jTextFieldVentaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID VENTA");

        jTextFieldidVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldidVentaActionPerformed(evt);
            }
        });
        jTextFieldidVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldidVentaKeyTyped(evt);
            }
        });

        jButtonBuscarVenta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBuscarVenta.setText("BUSCAR");
        jButtonBuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldidVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldidVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarVenta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jTextFieldVentaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVentaTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVentaTotalActionPerformed

    private void jTextFieldidVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldidVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldidVentaActionPerformed
  public void limpiar(){
        jTextFieldClienteApellido.setText("");
        jTextFieldClienteNit.setText("");
        jTextFieldClienteNombre.setText("");
        jTextFieldClienteTelefono.setText("");
        
        jTextFieldVendedorNit.setText("");
        jTextFieldVendedorApellido.setText("");
        jTextFieldVendedorNombre.setText("");
        jTextFieldVentaEstado.setText("");
        jTextFieldVentaTotal.setText("");
    
    }
    private void jButtonBuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarVentaActionPerformed
        // TODO add your handling code here:
        limpiar();
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
         
        
        if(jTextFieldidVenta.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Debe ingresar el id de la venta, en la caja de texto");
            jTextFieldidVenta.requestFocus();
        }else{
            int idVenta = Integer.parseInt(jTextFieldidVenta.getText());
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
                
                //captura datos vendedor
                int idVendedor = ev.getIdVendedor();
                eu = uDAO.buscarPorId(idVendedor);
                String nitVendedor = eu.getNit();
                String nombreVendedor = eu.getPrimerNombre();
                String apellidoVendedor = eu.getPrimerApellido(); 
                jTextFieldVendedorNit.setText(nitVendedor);
                jTextFieldVendedorNombre.setText(nombreVendedor);
                jTextFieldVendedorApellido.setText(apellidoVendedor);
                //fin datos vendedor
                
                //datos nativo de la venta
                if(ev.getEstadoVenta()==1){
                jTextFieldVentaEstado.setText("Activa");
                }else{
                jTextFieldVentaEstado.setText("No activa");
                }
                
                jTextFieldVentaTotal.setText(String.valueOf(ev.getTotal()));
                //fin datos nativos venta
                
                 buscarDetalleVenta();
            }else{
                 JOptionPane.showMessageDialog(this,"El id de venta que ingreso no está registrado");
                 jTextFieldidVenta.requestFocus();
             }
        }  
    
    }
    
    public void buscarDetalleVenta(){
        
        int idVenta = Integer.parseInt(jTextFieldidVenta.getText());
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
    
    private void jTextFieldVentaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVentaEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVentaEstadoActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jTextFieldidVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldidVentaKeyTyped
                                  char v = evt.getKeyChar();
        int c = (int) evt.getKeyChar();
        
        soloNumeros(evt, v, c);
    }//GEN-LAST:event_jTextFieldidVentaKeyTyped
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
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarVenta;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetalleVenta;
    private javax.swing.JTextField jTextFieldClienteApellido;
    private javax.swing.JTextField jTextFieldClienteNit;
    private javax.swing.JTextField jTextFieldClienteNombre;
    private javax.swing.JTextField jTextFieldClienteTelefono;
    private javax.swing.JTextField jTextFieldVendedorApellido;
    private javax.swing.JTextField jTextFieldVendedorNit;
    private javax.swing.JTextField jTextFieldVendedorNombre;
    private javax.swing.JTextField jTextFieldVentaEstado;
    private javax.swing.JTextField jTextFieldVentaTotal;
    private javax.swing.JTextField jTextFieldidVenta;
    // End of variables declaration//GEN-END:variables
}
