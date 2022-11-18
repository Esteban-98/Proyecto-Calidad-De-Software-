/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Admin.Ventas;

import DAOs.ClienteDAO;
import DAOs.ProductoDAO;
import DAOs.UsuarioDAO;
import DAOs.VentaDAO;
import Modelos.EntidadCliente;
import Modelos.EntidadProducto;
import Modelos.EntidadUsuario;
import Modelos.EntidadVenta;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class AdminConsultarVentas extends javax.swing.JFrame {

    UsuarioDAO uDAO = new UsuarioDAO();
    EntidadUsuario eu = new EntidadUsuario();
    ClienteDAO cDAO = new ClienteDAO();
    EntidadCliente ec = new EntidadCliente();
    ProductoDAO pDAO = new ProductoDAO();
    EntidadProducto ep = new EntidadProducto();
    VentaDAO vDAO = new VentaDAO();
    EntidadVenta ev = new EntidadVenta();
    
   DefaultTableModel modeloTabla = new DefaultTableModel();
    public AdminConsultarVentas() {
        initComponents();
        colorTablaEstado();
        this.setLocationRelativeTo(null);
        this.setTitle("Consultar Ventas");
        listarVentas();

    }
        public void limpiarTabla(){
    
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            modeloTabla.removeRow(i);
            i=i-1;
        }
    }

        public void colorTablaEstado(){
        TablaColorEstado color = new TablaColorEstado(5);
        jTableListarVentas.getColumnModel().getColumn(5).setCellRenderer(color);
        }
    public void listarVentas(){
    
       List <EntidadVenta> lista = vDAO.listar();
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
    
       List <EntidadVenta> lista = vDAO.listarRecientes();
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
    public void listarVentasAntiguas(){
    
       List <EntidadVenta> lista = vDAO.listarAntiguas();
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
    public void listarVentasActivas(){
    
       List <EntidadVenta> lista = vDAO.listarActivas();
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
    public void listarVentasNoActivas(){
    
       List <EntidadVenta> lista = vDAO.listarNoActivas();
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
    public void listarVentasTotalMax(){
    
       List <EntidadVenta> lista = vDAO.listarTotalMax();
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
    public void listarVentasTotlaMin(){
    
       List <EntidadVenta> lista = vDAO.listarTotalMin();
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
        jButtonLInicial = new javax.swing.JButton();
        jButtonLReciente = new javax.swing.JButton();
        jButtonLAntiguas = new javax.swing.JButton();
        jButtonLTotalMax = new javax.swing.JButton();
        jButtonLActivas = new javax.swing.JButton();
        jButtonLNoActivas = new javax.swing.JButton();
        jButtonLTotalMin = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarVentas = new javax.swing.JTable();
        jButtonBAvanzada = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ventas.png"))); // NOI18N
        jLabel1.setText("CONSULTAR VENTA");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILTROS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jButtonLInicial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLInicial.setText("RESTABLECER ORDEN INICIAL");
        jButtonLInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLInicialActionPerformed(evt);
            }
        });

        jButtonLReciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLReciente.setText("RECIENTE");
        jButtonLReciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLRecienteActionPerformed(evt);
            }
        });

        jButtonLAntiguas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLAntiguas.setText("ANTIGUAS");
        jButtonLAntiguas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLAntiguasActionPerformed(evt);
            }
        });

        jButtonLTotalMax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLTotalMax.setText("TOTAL MAX");
        jButtonLTotalMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLTotalMaxActionPerformed(evt);
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

        jButtonLTotalMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLTotalMin.setText("TOTAL MIN");
        jButtonLTotalMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLTotalMinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonLReciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLAntiguas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonLNoActivas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLActivas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonLTotalMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLTotalMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLTotalMax)
                            .addComponent(jButtonLActivas)
                            .addComponent(jButtonLReciente))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLAntiguas)
                            .addComponent(jButtonLNoActivas)
                            .addComponent(jButtonLTotalMin))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonLInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addContainerGap())
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
                false, false, false, false, false, true
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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonBAvanzada.setBackground(new java.awt.Color(205, 255, 204));
        jButtonBAvanzada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBAvanzada.setText("BÚSQUEDA AVANZADA");
        jButtonBAvanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBAvanzadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBAvanzada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBAvanzadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBAvanzadaActionPerformed
        // TODO add your handling code here:

        AdminConsultarEspVentas abrir = new AdminConsultarEspVentas();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBAvanzadaActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        

        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonLInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLInicialActionPerformed
        limpiarTabla();
        listarVentas();
    }//GEN-LAST:event_jButtonLInicialActionPerformed

    private void jButtonLRecienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLRecienteActionPerformed
        limpiarTabla();
        listarVentasReciente();
    }//GEN-LAST:event_jButtonLRecienteActionPerformed

    private void jButtonLAntiguasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLAntiguasActionPerformed
        limpiarTabla();
        listarVentasAntiguas();
    }//GEN-LAST:event_jButtonLAntiguasActionPerformed

    private void jButtonLActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLActivasActionPerformed
        limpiarTabla();
        listarVentasActivas();
    }//GEN-LAST:event_jButtonLActivasActionPerformed

    private void jButtonLNoActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLNoActivasActionPerformed
        limpiarTabla();
        listarVentasNoActivas();
    }//GEN-LAST:event_jButtonLNoActivasActionPerformed

    private void jButtonLTotalMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLTotalMaxActionPerformed
        limpiarTabla();
        listarVentasTotalMax();
    }//GEN-LAST:event_jButtonLTotalMaxActionPerformed

    private void jButtonLTotalMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLTotalMinActionPerformed
       limpiarTabla();
        listarVentasTotlaMin();
    }//GEN-LAST:event_jButtonLTotalMinActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBAvanzada;
    private javax.swing.JButton jButtonLActivas;
    private javax.swing.JButton jButtonLAntiguas;
    private javax.swing.JButton jButtonLInicial;
    private javax.swing.JButton jButtonLNoActivas;
    private javax.swing.JButton jButtonLReciente;
    private javax.swing.JButton jButtonLTotalMax;
    private javax.swing.JButton jButtonLTotalMin;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListarVentas;
    // End of variables declaration//GEN-END:variables
}
