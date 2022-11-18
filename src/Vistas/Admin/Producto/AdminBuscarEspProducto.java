/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Admin.Producto;

import DAOs.ProductoDAO;
import Modelos.EntidadProducto;
import java.awt.Color;
import javax.swing.JOptionPane;


public class AdminBuscarEspProducto extends javax.swing.JFrame {

    ProductoDAO pDAO = new ProductoDAO();
    EntidadProducto ep = new EntidadProducto();
    public AdminBuscarEspProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Búsqueda Detallada Producto");
        jTextFieldCodigo.requestFocus();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldCosto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldT6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldT8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldT10 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldT12 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldT14 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldT16 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldT18 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldT20 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldT22 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel2.setText("NOMBRE DEL PRODUCTO");

        jLabel3.setText("PRECIO DE VENTA");

        jLabel4.setText("COSTO DEL PRODUCTO");

        jTextFieldNombre.setEditable(false);

        jTextFieldPrecio.setEditable(false);

        jTextFieldCosto.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCosto, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldPrecio))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CANTIDADES POR TALLAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel5.setText("TALLAS");

        jLabel6.setText("T6");

        jTextFieldT6.setEditable(false);

        jLabel7.setText("T8");

        jTextFieldT8.setEditable(false);

        jLabel8.setText("T10");

        jTextFieldT10.setEditable(false);

        jLabel9.setText("T12");

        jTextFieldT12.setEditable(false);

        jLabel10.setText("T14");

        jTextFieldT14.setEditable(false);

        jLabel11.setText("T16");

        jTextFieldT16.setEditable(false);

        jLabel12.setText("T18");

        jTextFieldT18.setEditable(false);

        jLabel13.setText("T20");

        jTextFieldT20.setEditable(false);

        jLabel14.setText("T22");

        jTextFieldT22.setEditable(false);

        jLabel16.setText("TOTAL");

        jTextFieldTotal.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldT14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTotal))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldT12, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(jTextFieldT6)
                            .addComponent(jTextFieldT8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldT10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldT22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldT20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldT18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldT16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(90, 90, 90))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldT16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldT8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldT18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldT10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldT20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldT12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldT22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jTextFieldT14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel15.setText("CÓDIGO PRODUCTO");

        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyTyped(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBuscar)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pantalones.png"))); // NOI18N
        jLabel1.setText("BÚSQUEDA AVANZADA PRODUCTO");

        jButtonCancelar.setBackground(new java.awt.Color(255, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCancelar.setText("VOLVER");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        AdminBuscarProducto abrir = new AdminBuscarProducto();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        limpiar();
        buscar();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    public void limpiar(){
    
        jTextFieldNombre.setText("");
        jTextFieldCosto.setText("");
        jTextFieldPrecio.setText("");
        jTextFieldTotal.setText("");
        jTextFieldT6.setText("");
        jTextFieldT8.setText("");
        jTextFieldT10.setText("");
        jTextFieldT12.setText("");
        jTextFieldT14.setText("");
        jTextFieldT16.setText("");
        jTextFieldT18.setText("");
        jTextFieldT20.setText("");
        jTextFieldT22.setText("");

    }
    private void jTextFieldCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyTyped
                char v = evt.getKeyChar();
        int c = (int) evt.getKeyChar();

        SoloLetrasNumeros(evt, v, c);
    }//GEN-LAST:event_jTextFieldCodigoKeyTyped

        public void SoloLetrasNumeros(java.awt.event.KeyEvent evt, char v, int c){
    
        if (Character.isLowerCase(v)) {

            evt.setKeyChar(Character.toUpperCase(v));

        }

        if (Character.isSpaceChar(v)) {

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
    
        public void buscar(){
       
        String codigo = jTextFieldCodigo.getText();
        
        if(jTextFieldCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Debe ingresar el código en la caja de texto");
            jTextFieldCodigo.requestFocus();
        }else{
            
            ep = pDAO.buscar(codigo);
            if (ep.getCodigo()!= null ){
                jTextFieldNombre.setText(ep.getNombre());
                jTextFieldPrecio.setText(String.valueOf(ep.getPrecioVenta()));
                jTextFieldCosto.setText(String.valueOf(ep.getCosto()));
                
                int T6 = ep.getT6();
                int T8 = ep.getT8();
                int T10 = ep.getT10();
                int T12 = ep.getT12();
                int T14 = ep.getT14();
                int T16 = ep.getT16();
                int T18 = ep.getT18();
                int T20 = ep.getT20();
                int T22 = ep.getT22();
                int total = ep.getStock();
                if(T6<10){
                    jTextFieldT6.setForeground(Color.RED);
                } else if (T6 >= 10 && T6 < 20) {
                    jTextFieldT6.setForeground(Color.YELLOW);
                } else {
                    jTextFieldT6.setForeground(Color.GREEN);
                }
                
                if (T8 < 10) {
                    jTextFieldT8.setForeground(Color.RED);
                } else if (T8 >= 10 && T8 < 20) {
                    jTextFieldT8.setForeground(Color.YELLOW);
                } else {
                    jTextFieldT8.setForeground(Color.GREEN);
                }
         
                if (T10 < 10) {
                    jTextFieldT10.setForeground(Color.RED);
                } else if (T10 >= 10 && T10 < 20) {
                    jTextFieldT10.setForeground(Color.YELLOW);
                } else {
                    jTextFieldT10.setForeground(Color.GREEN);
                }
                
                if (T12 < 10) {
                    jTextFieldT12.setForeground(Color.RED);
                } else if (T12 >= 10 && T12 < 20) {
                    jTextFieldT12.setForeground(Color.YELLOW);
                } else {
                    jTextFieldT12.setForeground(Color.GREEN);
                }
                
                if (T14 < 10) {
                    jTextFieldT14.setForeground(Color.RED);
                } else if (T14 >= 10 && T14 < 20) {
                    jTextFieldT14.setForeground(Color.YELLOW);
                } else {
                    jTextFieldT14.setForeground(Color.GREEN);
                }
                
                if (T16 < 10) {
                    jTextFieldT16.setForeground(Color.RED);
                } else if (T16 >= 10 && T16 < 20) {
                    jTextFieldT16.setForeground(Color.YELLOW);
                } else {
                    jTextFieldT16.setForeground(Color.GREEN);
                }
                
                if (T18 < 10) {
                    jTextFieldT18.setForeground(Color.RED);
                } else if (T18 >= 10 && T18 < 20) {
                    jTextFieldT18.setForeground(Color.YELLOW);
                } else {
                    jTextFieldT18.setForeground(Color.GREEN);
                }
                
                if (T20 < 10) {
                    jTextFieldT20.setForeground(Color.RED);
                } else if (T20 >= 10 && T20 < 20) {
                    jTextFieldT20.setForeground(Color.YELLOW);
                } else {
                    jTextFieldT20.setForeground(Color.GREEN);
                }
            
            if (T22 < 10) {
                    jTextFieldT22.setForeground(Color.RED);
                } else if (T22 >= 10 && T22 < 20) {
                    jTextFieldT22.setForeground(Color.YELLOW);
                } else {
                    jTextFieldT22.setForeground(Color.GREEN);
                }
            
            if (total < 86) {
                jTextFieldTotal.setForeground(Color.RED);
            } else if (total >= 86 && total < 175) {
                jTextFieldTotal.setForeground(Color.YELLOW);
            } else {
                jTextFieldTotal.setForeground(Color.GREEN);
            }
            
                jTextFieldT6.setText(String.valueOf(ep.getT6()));
                jTextFieldT8.setText(String.valueOf(ep.getT8()));
                jTextFieldT10.setText(String.valueOf(ep.getT10()));
                jTextFieldT12.setText(String.valueOf(ep.getT12()));
                jTextFieldT14.setText(String.valueOf(ep.getT14()));
                jTextFieldT16.setText(String.valueOf(ep.getT16()));
                jTextFieldT18.setText(String.valueOf(ep.getT18()));
                jTextFieldT20.setText(String.valueOf(ep.getT20()));
                jTextFieldT22.setText(String.valueOf(ep.getT22()));
                jTextFieldTotal.setText(String.valueOf(ep.getStock()));
                
  
            }else{
                 JOptionPane.showMessageDialog(this,"El código que ingreso no está registrado");
                 jTextFieldCodigo.requestFocus();
             }
        }       
       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCosto;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldT10;
    private javax.swing.JTextField jTextFieldT12;
    private javax.swing.JTextField jTextFieldT14;
    private javax.swing.JTextField jTextFieldT16;
    private javax.swing.JTextField jTextFieldT18;
    private javax.swing.JTextField jTextFieldT20;
    private javax.swing.JTextField jTextFieldT22;
    private javax.swing.JTextField jTextFieldT6;
    private javax.swing.JTextField jTextFieldT8;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
