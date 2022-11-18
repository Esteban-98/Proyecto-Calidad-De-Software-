/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Admin.Producto;

import DAOs.PerdidaDAO;
import DAOs.ProductoDAO;
import Modelos.EntidadPerdida;
import Modelos.EntidadProducto;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class AdminVerPerdidas extends javax.swing.JFrame {

    ProductoDAO pDAO = new ProductoDAO();
    EntidadProducto ep = new EntidadProducto();
    PerdidaDAO pdDAO = new PerdidaDAO();
    EntidadPerdida epd = new EntidadPerdida();
    DefaultTableModel modeloTabla = new DefaultTableModel();
            
    public AdminVerPerdidas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ver Perdidas");
        listar();
    }
    

        public void limpiarTabla(){
    
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            modeloTabla.removeRow(i);
            i=i-1;
        }
    }
        public void listar(){
       
       List <EntidadPerdida> lista = pdDAO.listar();
       modeloTabla = (DefaultTableModel)jTablePerdidas.getModel();
       Object[]ob = new Object[13];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdVenta();
           int codigoP =lista.get(i).getIdProducto();
           ep = pDAO.buscarPorId(codigoP);
           String codigoPro = ep.getCodigo();
           ob[1] = codigoPro;
           ob[2] = lista.get(i).getT6();
           ob[3] = lista.get(i).getT8();
           ob[4] = lista.get(i).getT10();
           ob[5] = lista.get(i).getT12();
           ob[6] = lista.get(i).getT14();
           ob[7] = lista.get(i).getT16();
           ob[8] = lista.get(i).getT18();
           ob[9] = lista.get(i).getT20();
           ob[10] = lista.get(i).getT22();
           ob[11] = lista.get(i).getValorPerdida();
           ob[12] = lista.get(i).getFecha();

           
           modeloTabla.addRow(ob);
       }
       
       jTablePerdidas.setModel(modeloTabla);

    }
        
        
        public void listarIdVenta(){
       
       List <EntidadPerdida> lista = pdDAO.listarIdVenta();
       modeloTabla = (DefaultTableModel)jTablePerdidas.getModel();
       Object[]ob = new Object[13];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdVenta();
           int codigoP =lista.get(i).getIdProducto();
           ep = pDAO.buscarPorId(codigoP);
           String codigoPro = ep.getCodigo();
           ob[1] = codigoPro;
           ob[2] = lista.get(i).getT6();
           ob[3] = lista.get(i).getT8();
           ob[4] = lista.get(i).getT10();
           ob[5] = lista.get(i).getT12();
           ob[6] = lista.get(i).getT14();
           ob[7] = lista.get(i).getT16();
           ob[8] = lista.get(i).getT18();
           ob[9] = lista.get(i).getT20();
           ob[10] = lista.get(i).getT22();
           ob[11] = lista.get(i).getValorPerdida();
           ob[12] = lista.get(i).getFecha();

           
           modeloTabla.addRow(ob);
       }
       
       jTablePerdidas.setModel(modeloTabla);


    }
        public void listarCodigo(){
       
       List <EntidadPerdida> lista = pdDAO.listarCodigo();
       modeloTabla = (DefaultTableModel)jTablePerdidas.getModel();
       Object[]ob = new Object[13];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdVenta();
           int codigoP =lista.get(i).getIdProducto();
           ep = pDAO.buscarPorId(codigoP);
           String codigoPro = ep.getCodigo();
           ob[1] = codigoPro;
           ob[2] = lista.get(i).getT6();
           ob[3] = lista.get(i).getT8();
           ob[4] = lista.get(i).getT10();
           ob[5] = lista.get(i).getT12();
           ob[6] = lista.get(i).getT14();
           ob[7] = lista.get(i).getT16();
           ob[8] = lista.get(i).getT18();
           ob[9] = lista.get(i).getT20();
           ob[10] = lista.get(i).getT22();
           ob[11] = lista.get(i).getValorPerdida();
           ob[12] = lista.get(i).getFecha();

           
           modeloTabla.addRow(ob);
       }
       
       jTablePerdidas.setModel(modeloTabla);


    }
        public void listarPerdidaMax(){
       
       List <EntidadPerdida> lista = pdDAO.listarPerdidaMax();
       modeloTabla = (DefaultTableModel)jTablePerdidas.getModel();
       Object[]ob = new Object[13];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdVenta();
           int codigoP =lista.get(i).getIdProducto();
           ep = pDAO.buscarPorId(codigoP);
           String codigoPro = ep.getCodigo();
           ob[1] = codigoPro;
           ob[2] = lista.get(i).getT6();
           ob[3] = lista.get(i).getT8();
           ob[4] = lista.get(i).getT10();
           ob[5] = lista.get(i).getT12();
           ob[6] = lista.get(i).getT14();
           ob[7] = lista.get(i).getT16();
           ob[8] = lista.get(i).getT18();
           ob[9] = lista.get(i).getT20();
           ob[10] = lista.get(i).getT22();
           ob[11] = lista.get(i).getValorPerdida();
           ob[12] = lista.get(i).getFecha();

           
           modeloTabla.addRow(ob);
       }
       
       jTablePerdidas.setModel(modeloTabla);


    }
        public void listarPerdidaMin(){
       
       List <EntidadPerdida> lista = pdDAO.listarPerdidaMin();
       modeloTabla = (DefaultTableModel)jTablePerdidas.getModel();
       Object[]ob = new Object[13];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdVenta();
           int codigoP =lista.get(i).getIdProducto();
           ep = pDAO.buscarPorId(codigoP);
           String codigoPro = ep.getCodigo();
           ob[1] = codigoPro;
           ob[2] = lista.get(i).getT6();
           ob[3] = lista.get(i).getT8();
           ob[4] = lista.get(i).getT10();
           ob[5] = lista.get(i).getT12();
           ob[6] = lista.get(i).getT14();
           ob[7] = lista.get(i).getT16();
           ob[8] = lista.get(i).getT18();
           ob[9] = lista.get(i).getT20();
           ob[10] = lista.get(i).getT22();
           ob[11] = lista.get(i).getValorPerdida();
           ob[12] = lista.get(i).getFecha();

           
           modeloTabla.addRow(ob);
       }
       
       jTablePerdidas.setModel(modeloTabla);


    }
        public void listarReciente(){
       
       List <EntidadPerdida> lista = pdDAO.listarReciente();
       modeloTabla = (DefaultTableModel)jTablePerdidas.getModel();
       Object[]ob = new Object[13];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdVenta();
           int codigoP =lista.get(i).getIdProducto();
           ep = pDAO.buscarPorId(codigoP);
           String codigoPro = ep.getCodigo();
           ob[1] = codigoPro;
           ob[2] = lista.get(i).getT6();
           ob[3] = lista.get(i).getT8();
           ob[4] = lista.get(i).getT10();
           ob[5] = lista.get(i).getT12();
           ob[6] = lista.get(i).getT14();
           ob[7] = lista.get(i).getT16();
           ob[8] = lista.get(i).getT18();
           ob[9] = lista.get(i).getT20();
           ob[10] = lista.get(i).getT22();
           ob[11] = lista.get(i).getValorPerdida();
           ob[12] = lista.get(i).getFecha();

           
           modeloTabla.addRow(ob);
       }
       
       jTablePerdidas.setModel(modeloTabla);


    }
        public void listarAntigua(){
       
       List <EntidadPerdida> lista = pdDAO.listarAntigua();
       modeloTabla = (DefaultTableModel)jTablePerdidas.getModel();
       Object[]ob = new Object[13];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdVenta();
           int codigoP =lista.get(i).getIdProducto();
           ep = pDAO.buscarPorId(codigoP);
           String codigoPro = ep.getCodigo();
           ob[1] = codigoPro;
           ob[2] = lista.get(i).getT6();
           ob[3] = lista.get(i).getT8();
           ob[4] = lista.get(i).getT10();
           ob[5] = lista.get(i).getT12();
           ob[6] = lista.get(i).getT14();
           ob[7] = lista.get(i).getT16();
           ob[8] = lista.get(i).getT18();
           ob[9] = lista.get(i).getT20();
           ob[10] = lista.get(i).getT22();
           ob[11] = lista.get(i).getValorPerdida();
           ob[12] = lista.get(i).getFecha();

           
           modeloTabla.addRow(ob);
       }
       
       jTablePerdidas.setModel(modeloTabla);


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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePerdidas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButtonListarInicial = new javax.swing.JButton();
        jButtonListarIdVenta = new javax.swing.JButton();
        jButtonListarCodigo = new javax.swing.JButton();
        jButtonListarPerdidaMax = new javax.swing.JButton();
        jButtonListarPerdidaMin = new javax.swing.JButton();
        jButtonListarReciente = new javax.swing.JButton();
        jButtonListarAntigua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonBuscarVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTablePerdidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTablePerdidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID VENTA", "CÓDIGO", "T6", "T8", "T10", "T12", "T14", "T16", "T18", "T20", "T22", "VALOR PERDIDA", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePerdidas);
        if (jTablePerdidas.getColumnModel().getColumnCount() > 0) {
            jTablePerdidas.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTablePerdidas.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTablePerdidas.getColumnModel().getColumn(2).setPreferredWidth(2);
            jTablePerdidas.getColumnModel().getColumn(3).setPreferredWidth(2);
            jTablePerdidas.getColumnModel().getColumn(4).setPreferredWidth(2);
            jTablePerdidas.getColumnModel().getColumn(5).setPreferredWidth(2);
            jTablePerdidas.getColumnModel().getColumn(6).setPreferredWidth(2);
            jTablePerdidas.getColumnModel().getColumn(7).setPreferredWidth(2);
            jTablePerdidas.getColumnModel().getColumn(8).setPreferredWidth(2);
            jTablePerdidas.getColumnModel().getColumn(9).setPreferredWidth(2);
            jTablePerdidas.getColumnModel().getColumn(10).setPreferredWidth(2);
            jTablePerdidas.getColumnModel().getColumn(11).setPreferredWidth(70);
            jTablePerdidas.getColumnModel().getColumn(12).setPreferredWidth(70);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButtonListarInicial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarInicial.setText("RESTABLECER ORDEN INICIAL");
        jButtonListarInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarInicialActionPerformed(evt);
            }
        });

        jButtonListarIdVenta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarIdVenta.setText("ID VENTA");
        jButtonListarIdVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarIdVentaActionPerformed(evt);
            }
        });

        jButtonListarCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarCodigo.setText("CÓDIGO");
        jButtonListarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarCodigoActionPerformed(evt);
            }
        });

        jButtonListarPerdidaMax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarPerdidaMax.setText("PERDIDA MAX");
        jButtonListarPerdidaMax.setMaximumSize(new java.awt.Dimension(95, 23));
        jButtonListarPerdidaMax.setMinimumSize(new java.awt.Dimension(95, 23));
        jButtonListarPerdidaMax.setPreferredSize(new java.awt.Dimension(95, 23));
        jButtonListarPerdidaMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarPerdidaMaxActionPerformed(evt);
            }
        });

        jButtonListarPerdidaMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarPerdidaMin.setText("PERDIDA MIN ");
        jButtonListarPerdidaMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarPerdidaMinActionPerformed(evt);
            }
        });

        jButtonListarReciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarReciente.setText("RECIENTE");
        jButtonListarReciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarRecienteActionPerformed(evt);
            }
        });

        jButtonListarAntigua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarAntigua.setText("ANTIGUA");
        jButtonListarAntigua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarAntiguaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonListarIdVenta)
                .addGap(18, 18, 18)
                .addComponent(jButtonListarCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonListarPerdidaMax, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jButtonListarPerdidaMin, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonListarReciente)
                    .addComponent(jButtonListarAntigua))
                .addGap(125, 125, 125)
                .addComponent(jButtonListarInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonListarPerdidaMax, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonListarReciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonListarPerdidaMin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonListarAntigua, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonListarInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListarIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pantalones.png"))); // NOI18N
        jLabel1.setText("VER PERDIDAS");

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBuscarVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBuscarVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarVolverActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jButtonBuscarVolverActionPerformed

    private void jButtonListarInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarInicialActionPerformed
        limpiarTabla();
        listar();
    }//GEN-LAST:event_jButtonListarInicialActionPerformed

    private void jButtonListarIdVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarIdVentaActionPerformed
        limpiarTabla();
        listarIdVenta();
    }//GEN-LAST:event_jButtonListarIdVentaActionPerformed

    private void jButtonListarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarCodigoActionPerformed
        limpiarTabla();
        listarCodigo();
    }//GEN-LAST:event_jButtonListarCodigoActionPerformed

    private void jButtonListarPerdidaMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarPerdidaMaxActionPerformed
        limpiarTabla();
        listarPerdidaMax();
    }//GEN-LAST:event_jButtonListarPerdidaMaxActionPerformed

    private void jButtonListarPerdidaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarPerdidaMinActionPerformed
        limpiarTabla();
        listarPerdidaMin();
    }//GEN-LAST:event_jButtonListarPerdidaMinActionPerformed

    private void jButtonListarRecienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarRecienteActionPerformed
        limpiarTabla();
        listarReciente();
    }//GEN-LAST:event_jButtonListarRecienteActionPerformed

    private void jButtonListarAntiguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarAntiguaActionPerformed
        limpiarTabla();
        listarAntigua();
    }//GEN-LAST:event_jButtonListarAntiguaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarVolver;
    private javax.swing.JButton jButtonListarAntigua;
    private javax.swing.JButton jButtonListarCodigo;
    private javax.swing.JButton jButtonListarIdVenta;
    private javax.swing.JButton jButtonListarInicial;
    private javax.swing.JButton jButtonListarPerdidaMax;
    private javax.swing.JButton jButtonListarPerdidaMin;
    private javax.swing.JButton jButtonListarReciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePerdidas;
    // End of variables declaration//GEN-END:variables
}
