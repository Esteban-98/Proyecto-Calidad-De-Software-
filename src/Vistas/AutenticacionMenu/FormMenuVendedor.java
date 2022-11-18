  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.AutenticacionMenu;

import Vistas.Vendedor.Devoluciones.VendedorRealizarDevolucion;
import Vistas.Vendedor.Producto.VendedorConsultarProducto;
import Vistas.Vendedor.Usuario.VendedorActualizarInfo;
import Vistas.Vendedor.Usuario.VendedorCambiarContra;
import Vistas.Vendedor.Ventas.VendedorConsultarEspVentas;
import Vistas.Vendedor.Ventas.VendedorHistorialrVentas;
import Vistas.Vendedor.Ventas.VendedorRealizarVenta;


public class FormMenuVendedor extends javax.swing.JFrame {

   
    public FormMenuVendedor() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Menú Vendedor");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldIdUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRol = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuActualizarInformacion = new javax.swing.JMenuItem();
        jMenuCambiarContrasena = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuRealizarVenta = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuConsultarVenta = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuRealizarDev = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuConsultarProducto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del usuario"));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jTextFieldIdUsuario.setEditable(false);

        jLabel1.setText("Identificación");

        jLabel2.setText("Nombre");

        jTextFieldNombre.setEditable(false);

        jLabel3.setText("Rol");

        jTextFieldRol.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldRol)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldIdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(429, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu.png"))); // NOI18N
        jMenu1.setText("Menú");

        jMenuActualizarInformacion.setText("Actualizar mí información");
        jMenuActualizarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuActualizarInformacionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuActualizarInformacion);

        jMenuCambiarContrasena.setText("Cambiar contraseña");
        jMenuCambiarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCambiarContrasenaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCambiarContrasena);

        MenuSalir.setText("Salir");
        MenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ventas.png"))); // NOI18N
        jMenu2.setText("Ventas");

        jMenuRealizarVenta.setText("Realizar Venta");
        jMenuRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRealizarVentaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuRealizarVenta);

        jMenuItem3.setText("Mí historial de ventas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuConsultarVenta.setText("Consultar Venta");
        jMenuConsultarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultarVentaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuConsultarVenta);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Devolucion.png"))); // NOI18N
        jMenu3.setText("Devoluciones");

        jMenuRealizarDev.setText("Realizar devolución");
        jMenuRealizarDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRealizarDevActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuRealizarDev);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pantalones.png"))); // NOI18N
        jMenu4.setText("Inventario");

        jMenuConsultarProducto.setText("Colsultar existencias");
        jMenuConsultarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultarProductoActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuConsultarProducto);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuActualizarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuActualizarInformacionActionPerformed
        // TODO add your handling code here:
        
        VendedorActualizarInfo abrir = new VendedorActualizarInfo();
        abrir.setVisible(true);
        abrir.jTextFieldNit.setText(jTextFieldIdUsuario.getText());
        abrir.buscarInic();
        this.dispose();
        
    }//GEN-LAST:event_jMenuActualizarInformacionActionPerformed

    private void MenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirActionPerformed
        // TODO add your handling code here:
        FormLogin abrir = new FormLogin();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuSalirActionPerformed

    private void jMenuCambiarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCambiarContrasenaActionPerformed
        // TODO add your handling code here:
        VendedorCambiarContra abrir = new VendedorCambiarContra();
        abrir.setVisible(true);
        abrir.jTextFieldNit.setText(jTextFieldIdUsuario.getText());
        abrir.buscar();
        this.dispose();
    }//GEN-LAST:event_jMenuCambiarContrasenaActionPerformed

    private void jMenuConsultarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultarProductoActionPerformed
        // TODO add your handling code here:
        
        VendedorConsultarProducto abrir = new VendedorConsultarProducto();
        abrir.setVisible(true);

        
    }//GEN-LAST:event_jMenuConsultarProductoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        VendedorHistorialrVentas abrir = new VendedorHistorialrVentas();
        abrir.setVisible(true);
        abrir.jTextFieldNitVendedor.setText(jTextFieldIdUsuario.getText());
        abrir.jTextFieldNombreVendedor.setText(jTextFieldNombre.getText());
        abrir.listarVentas();
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuRealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRealizarVentaActionPerformed
        // TODO add your handling code here:
        
        VendedorRealizarVenta abrir = new VendedorRealizarVenta();
        abrir.setVisible(true);
        abrir.jTextFieldNitVendedor.setText(jTextFieldIdUsuario.getText());
        abrir.jTextFieldNombreVendedor.setText(jTextFieldNombre.getText());
        this.dispose();
    }//GEN-LAST:event_jMenuRealizarVentaActionPerformed

    private void jMenuConsultarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultarVentaActionPerformed
        // TODO add your handling code here:
        VendedorConsultarEspVentas abrir = new VendedorConsultarEspVentas();
        abrir.setVisible(true);
        
    }//GEN-LAST:event_jMenuConsultarVentaActionPerformed

    private void jMenuRealizarDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRealizarDevActionPerformed
        // TODO add your handling code here:
        
        VendedorRealizarDevolucion abrir = new VendedorRealizarDevolucion();
        abrir.setVisible(true);
    }//GEN-LAST:event_jMenuRealizarDevActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuSalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuActualizarInformacion;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCambiarContrasena;
    private javax.swing.JMenuItem jMenuConsultarProducto;
    private javax.swing.JMenuItem jMenuConsultarVenta;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuRealizarDev;
    private javax.swing.JMenuItem jMenuRealizarVenta;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextFieldIdUsuario;
    public javax.swing.JTextField jTextFieldNombre;
    public javax.swing.JTextField jTextFieldRol;
    // End of variables declaration//GEN-END:variables
}
