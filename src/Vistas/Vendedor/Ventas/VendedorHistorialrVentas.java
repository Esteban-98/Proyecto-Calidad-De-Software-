/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Vendedor.Ventas;


import DAOs.ClienteDAO;
import DAOs.ProductoDAO;
import DAOs.UsuarioDAO;
import DAOs.VentaDAO;
import Modelos.EntidadCliente;
import Modelos.EntidadProducto;
import Modelos.EntidadUsuario;
import Modelos.EntidadVenta;
import Vistas.AutenticacionMenu.FormMenuVendedor;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class VendedorHistorialrVentas extends javax.swing.JFrame {

    UsuarioDAO uDAO = new UsuarioDAO();
    EntidadUsuario eu = new EntidadUsuario();
    ClienteDAO cDAO = new ClienteDAO();
    EntidadCliente ec = new EntidadCliente();
    ProductoDAO pDAO = new ProductoDAO();
    EntidadProducto ep = new EntidadProducto();
    VentaDAO vDAO = new VentaDAO();
    EntidadVenta ev = new EntidadVenta();
    
   DefaultTableModel modeloTabla = new DefaultTableModel();
    public VendedorHistorialrVentas() {
        initComponents();
        colorTablaEstado();
        this.setLocationRelativeTo(null);
        this.setTitle("Mi historial de ventas");
        //listarVentas();

    }
    
    public void colorTablaEstado(){
     TablaColorEstado color = new TablaColorEstado(5);
     jTableListarVentas.getColumnModel().getColumn(5).setCellRenderer(color);
    }
    public void limpiarTabla(){
    
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            modeloTabla.removeRow(i);
            i=i-1;
        }
    }
     public void listarVentas(){
       String nitUsuario = jTextFieldNitVendedor.getText();
      
       eu = uDAO.buscar(nitUsuario);
       int idUsuario = eu.getIdUsuario();
       List <EntidadVenta> lista = vDAO.listarPorID(idUsuario);
       modeloTabla = (DefaultTableModel)jTableListarVentas.getModel();
       Object[]ob = new Object[6];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdVenta();
           ob[1] = lista.get(i).getFecha();
           int idCliente = lista.get(i).getIdCliente();
           ec = cDAO.buscarPorId(idCliente);
           String nombreC = ec.getNombre()+" "+ ec.getApellido();
           ob[2] = nombreC;
           int idVendedor = lista.get(i).getIdVendedor();
           eu = uDAO.buscarPorId(idVendedor);
           String nombreV =eu.getPrimerNombre() + " " + eu.getPrimerApellido();
           ob[3] = nombreV;
           ob[4] = lista.get(i).getTotal();
           if (lista.get(i).getEstadoVenta()== 1){  
               ob[5] = "Activa";
           }else{
               ob[5] = "No activa ";
             }
           
           modeloTabla.addRow(ob);
       }
       
       jTableListarVentas.setModel(modeloTabla);
    }
     public void listarVentasReciente(){
       String nitUsuario = jTextFieldNitVendedor.getText();
      
       eu = uDAO.buscar(nitUsuario);
       int idUsuario = eu.getIdUsuario();
       List <EntidadVenta> lista = vDAO.listarPorIDReciente(idUsuario);
       modeloTabla = (DefaultTableModel)jTableListarVentas.getModel();
       Object[]ob = new Object[6];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdVenta();
           ob[1] = lista.get(i).getFecha();
           int idCliente = lista.get(i).getIdCliente();
           ec = cDAO.buscarPorId(idCliente);
           String nombreC = ec.getNombre()+" "+ ec.getApellido();
           ob[2] = nombreC;
           int idVendedor = lista.get(i).getIdVendedor();
           eu = uDAO.buscarPorId(idVendedor);
           String nombreV =eu.getPrimerNombre() + " " + eu.getPrimerApellido();
           ob[3] = nombreV;
           ob[4] = lista.get(i).getTotal();
           if (lista.get(i).getEstadoVenta()== 1){  
               ob[5] = "Activa";
           }else{
               ob[5] = "No activa ";
             }
           
           modeloTabla.addRow(ob);
       }
       
       jTableListarVentas.setModel(modeloTabla);
    }
     public void listarVentasActiva(){
       String nitUsuario = jTextFieldNitVendedor.getText();
      
       eu = uDAO.buscar(nitUsuario);
       int idUsuario = eu.getIdUsuario();
       List <EntidadVenta> lista = vDAO.listarPorIDActiva(idUsuario);
       modeloTabla = (DefaultTableModel)jTableListarVentas.getModel();
       Object[]ob = new Object[6];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdVenta();
           ob[1] = lista.get(i).getFecha();
           int idCliente = lista.get(i).getIdCliente();
           ec = cDAO.buscarPorId(idCliente);
           String nombreC = ec.getNombre()+" "+ ec.getApellido();
           ob[2] = nombreC;
           int idVendedor = lista.get(i).getIdVendedor();
           eu = uDAO.buscarPorId(idVendedor);
           String nombreV =eu.getPrimerNombre() + " " + eu.getPrimerApellido();
           ob[3] = nombreV;
           ob[4] = lista.get(i).getTotal();
           if (lista.get(i).getEstadoVenta()== 1){  
               ob[5] = "Activa";
           }else{
               ob[5] = "No activa ";
             }
           
           modeloTabla.addRow(ob);
       }
       
       jTableListarVentas.setModel(modeloTabla);
    }
     public void listarVentasNoActiva(){
       String nitUsuario = jTextFieldNitVendedor.getText();
      
       eu = uDAO.buscar(nitUsuario);
       int idUsuario = eu.getIdUsuario();
       List <EntidadVenta> lista = vDAO.listarPorIDNoActiva(idUsuario);
       modeloTabla = (DefaultTableModel)jTableListarVentas.getModel();
       Object[]ob = new Object[6];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdVenta();
           ob[1] = lista.get(i).getFecha();
           int idCliente = lista.get(i).getIdCliente();
           ec = cDAO.buscarPorId(idCliente);
           String nombreC = ec.getNombre()+" "+ ec.getApellido();
           ob[2] = nombreC;
           int idVendedor = lista.get(i).getIdVendedor();
           eu = uDAO.buscarPorId(idVendedor);
           String nombreV =eu.getPrimerNombre() + " " + eu.getPrimerApellido();
           ob[3] = nombreV;
           ob[4] = lista.get(i).getTotal();
           if (lista.get(i).getEstadoVenta()== 1){  
               ob[5] = "Activa";
           }else{
               ob[5] = "No activa ";
             }
           
           modeloTabla.addRow(ob);
       }
       
       jTableListarVentas.setModel(modeloTabla);
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
        jButtonInicial = new javax.swing.JButton();
        jButtonLReciente = new javax.swing.JButton();
        jButtonLActivas = new javax.swing.JButton();
        jButtonLNoActivas = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarVentas = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNitVendedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombreVendedor = new javax.swing.JTextField();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ventas.png"))); // NOI18N
        jLabel1.setText("CONSULTAR VENTA");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILTROS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jButtonInicial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonInicial.setText("ORDEN INICIAL");
        jButtonInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicialActionPerformed(evt);
            }
        });

        jButtonLReciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLReciente.setText("RECIENTE");
        jButtonLReciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLRecienteActionPerformed(evt);
            }
        });

        jButtonLActivas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLActivas.setText("ACTIVAS");
        jButtonLActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLActivasActionPerformed(evt);
            }
        });

        jButtonLNoActivas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLNoActivas.setText("NO ACTIVAS");
        jButtonLNoActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLNoActivasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonLReciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLNoActivas)
                    .addComponent(jButtonLActivas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(jButtonInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButtonInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonLReciente)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLActivas)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLNoActivas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VENTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jTableListarVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID VENTA", "FECHA", "CLIENTE", "VENDEDOR", "TOTAL", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListarVentas);
        if (jTableListarVentas.getColumnModel().getColumnCount() > 0) {
            jTableListarVentas.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableListarVentas.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTableListarVentas.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTableListarVentas.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTableListarVentas.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTableListarVentas.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Vendedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("IDENTIFICACIÓN");

        jTextFieldNitVendedor.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NOMBRE");

        jTextFieldNombreVendedor.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldNombreVendedor)
                            .addComponent(jTextFieldNitVendedor, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNitVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        FormMenuVendedor abrir = new FormMenuVendedor();
        abrir.setVisible(true);
        abrir.jTextFieldIdUsuario.setText(jTextFieldNitVendedor.getText());
        abrir.jTextFieldNombre.setText(jTextFieldNombreVendedor.getText());
        abrir.jTextFieldRol.setText("Vendedor");
        this.dispose();

    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicialActionPerformed
        limpiarTabla();
        listarVentas();
    }//GEN-LAST:event_jButtonInicialActionPerformed

    private void jButtonLRecienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLRecienteActionPerformed
        limpiarTabla();
        listarVentasReciente();
    }//GEN-LAST:event_jButtonLRecienteActionPerformed

    private void jButtonLActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLActivasActionPerformed
        limpiarTabla();
        listarVentasActiva();
    }//GEN-LAST:event_jButtonLActivasActionPerformed

    private void jButtonLNoActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLNoActivasActionPerformed
        limpiarTabla();
        listarVentasNoActiva();
    }//GEN-LAST:event_jButtonLNoActivasActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInicial;
    private javax.swing.JButton jButtonLActivas;
    private javax.swing.JButton jButtonLNoActivas;
    private javax.swing.JButton jButtonLReciente;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarVentas;
    public javax.swing.JTextField jTextFieldNitVendedor;
    public javax.swing.JTextField jTextFieldNombreVendedor;
    // End of variables declaration//GEN-END:variables
}
