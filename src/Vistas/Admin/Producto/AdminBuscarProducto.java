/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Admin.Producto;

import DAOs.ProductoDAO;
import Modelos.EntidadProducto;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class AdminBuscarProducto extends javax.swing.JFrame {

    ProductoDAO pDAO = new ProductoDAO();
    EntidadProducto ep = new EntidadProducto();
    DefaultTableModel modeloTabla = new DefaultTableModel();
            
    public AdminBuscarProducto() {
        initComponents();
        colorTablaEstado();
        colorTablaCant();
        colorTablaStock();
        this.setLocationRelativeTo(null);
        this.setTitle("Buscar Producto");
        listar();
    }
    
    public void colorTablaEstado(){
    
        TablaColor color = new TablaColor(15);
        jTableProductos.getColumnModel().getColumn(15).setCellRenderer(color);
        
    }
    public void colorTablaStock(){
        TablaColorStock colorStock = new TablaColorStock(14);
        jTableProductos.getColumnModel().getColumn(14).setCellRenderer(colorStock);
    
    }
        public void colorTablaCant(){
    
        TablaColorCant colorT6 = new TablaColorCant(5);
        jTableProductos.getColumnModel().getColumn(5).setCellRenderer(colorT6);
        
        TablaColorCant colorT8 = new TablaColorCant(6);
        jTableProductos.getColumnModel().getColumn(6).setCellRenderer(colorT8);
        
        TablaColorCant colorT10 = new TablaColorCant(7);
        jTableProductos.getColumnModel().getColumn(7).setCellRenderer(colorT10);
        
        TablaColorCant colorT12 = new TablaColorCant(8);
        jTableProductos.getColumnModel().getColumn(8).setCellRenderer(colorT12);
        TablaColorCant colorT14 = new TablaColorCant(9);
        jTableProductos.getColumnModel().getColumn(9).setCellRenderer(colorT14);
        
        TablaColorCant colorT16 = new TablaColorCant(10);
        jTableProductos.getColumnModel().getColumn(10).setCellRenderer(colorT16);
        
        TablaColorCant colorT18 = new TablaColorCant(11);
        jTableProductos.getColumnModel().getColumn(11).setCellRenderer(colorT18);
        TablaColorCant colorT20 = new TablaColorCant(12);
        jTableProductos.getColumnModel().getColumn(12).setCellRenderer(colorT20);
        TablaColorCant colorT22 = new TablaColorCant(13);
        jTableProductos.getColumnModel().getColumn(13).setCellRenderer(colorT22);
    }
        public void limpiarTabla(){
    
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            modeloTabla.removeRow(i);
            i=i-1;
        }
    }
        public void listar(){
       
       List <EntidadProducto> lista = pDAO.listar();
       modeloTabla = (DefaultTableModel)jTableProductos.getModel();
       Object[]ob = new Object[16];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdProducto();
           ob[1] = lista.get(i).getCodigo();
           ob[2] = lista.get(i).getNombre();
           ob[3] = lista.get(i).getPrecioVenta();
           ob[4] = lista.get(i).getCosto();
           ob[5] = lista.get(i).getT6();
           ob[6] = lista.get(i).getT8();
           ob[7] = lista.get(i).getT10();
           ob[8] = lista.get(i).getT12();
           ob[9] = lista.get(i).getT14();
           ob[10] = lista.get(i).getT16();
           ob[11] = lista.get(i).getT18();
           ob[12] = lista.get(i).getT20();
           ob[13] = lista.get(i).getT22();
           ob[14] = lista.get(i).getStock();
           
           if (lista.get(i).getEstadoProducto()== 1){  
               ob[15] = "Disponible";
           }
           if (lista.get(i).getEstadoProducto()== 2){  
               ob[15] = "No disponible";
           }
           
           modeloTabla.addRow(ob);
       }
       
       jTableProductos.setModel(modeloTabla);

    }
        
        
        public void listarNombre(){
       
       List <EntidadProducto> lista = pDAO.listarNombre();
       modeloTabla = (DefaultTableModel)jTableProductos.getModel();
       Object[]ob = new Object[16];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdProducto();
           ob[1] = lista.get(i).getCodigo();
           ob[2] = lista.get(i).getNombre();
           ob[3] = lista.get(i).getPrecioVenta();
           ob[4] = lista.get(i).getCosto();
           ob[5] = lista.get(i).getT6();
           ob[6] = lista.get(i).getT8();
           ob[7] = lista.get(i).getT10();
           ob[8] = lista.get(i).getT12();
           ob[9] = lista.get(i).getT14();
           ob[10] = lista.get(i).getT16();
           ob[11] = lista.get(i).getT18();
           ob[12] = lista.get(i).getT20();
           ob[13] = lista.get(i).getT22();
           ob[14] = lista.get(i).getStock();
           
           if (lista.get(i).getEstadoProducto()== 1){  
               ob[15] = "Disponible";
           }
           if (lista.get(i).getEstadoProducto()== 2){  
               ob[15] = "No disponible";
           }
           
           modeloTabla.addRow(ob);
       }
       
       jTableProductos.setModel(modeloTabla);

    }
        public void listarStockMax(){
       
       List <EntidadProducto> lista = pDAO.listarStockMax();
       modeloTabla = (DefaultTableModel)jTableProductos.getModel();
       Object[]ob = new Object[16];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdProducto();
           ob[1] = lista.get(i).getCodigo();
           ob[2] = lista.get(i).getNombre();
           ob[3] = lista.get(i).getPrecioVenta();
           ob[4] = lista.get(i).getCosto();
           ob[5] = lista.get(i).getT6();
           ob[6] = lista.get(i).getT8();
           ob[7] = lista.get(i).getT10();
           ob[8] = lista.get(i).getT12();
           ob[9] = lista.get(i).getT14();
           ob[10] = lista.get(i).getT16();
           ob[11] = lista.get(i).getT18();
           ob[12] = lista.get(i).getT20();
           ob[13] = lista.get(i).getT22();
           ob[14] = lista.get(i).getStock();
           
           if (lista.get(i).getEstadoProducto()== 1){  
               ob[15] = "Disponible";
           }
           if (lista.get(i).getEstadoProducto()== 2){  
               ob[15] = "No disponible";
           }
           
           modeloTabla.addRow(ob);
       }
       
       jTableProductos.setModel(modeloTabla);

    }
        public void listarStockMin(){
       
       List <EntidadProducto> lista = pDAO.listarStockMin();
       modeloTabla = (DefaultTableModel)jTableProductos.getModel();
       Object[]ob = new Object[16];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdProducto();
           ob[1] = lista.get(i).getCodigo();
           ob[2] = lista.get(i).getNombre();
           ob[3] = lista.get(i).getPrecioVenta();
           ob[4] = lista.get(i).getCosto();
           ob[5] = lista.get(i).getT6();
           ob[6] = lista.get(i).getT8();
           ob[7] = lista.get(i).getT10();
           ob[8] = lista.get(i).getT12();
           ob[9] = lista.get(i).getT14();
           ob[10] = lista.get(i).getT16();
           ob[11] = lista.get(i).getT18();
           ob[12] = lista.get(i).getT20();
           ob[13] = lista.get(i).getT22();
           ob[14] = lista.get(i).getStock();
           
           if (lista.get(i).getEstadoProducto()== 1){  
               ob[15] = "Disponible";
           }
           if (lista.get(i).getEstadoProducto()== 2){  
               ob[15] = "No disponible";
           }
           
           modeloTabla.addRow(ob);
       }
       
       jTableProductos.setModel(modeloTabla);

    }
        public void listarCostoMax(){
       
       List <EntidadProducto> lista = pDAO.listarCostoMax();
       modeloTabla = (DefaultTableModel)jTableProductos.getModel();
       Object[]ob = new Object[16];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdProducto();
           ob[1] = lista.get(i).getCodigo();
           ob[2] = lista.get(i).getNombre();
           ob[3] = lista.get(i).getPrecioVenta();
           ob[4] = lista.get(i).getCosto();
           ob[5] = lista.get(i).getT6();
           ob[6] = lista.get(i).getT8();
           ob[7] = lista.get(i).getT10();
           ob[8] = lista.get(i).getT12();
           ob[9] = lista.get(i).getT14();
           ob[10] = lista.get(i).getT16();
           ob[11] = lista.get(i).getT18();
           ob[12] = lista.get(i).getT20();
           ob[13] = lista.get(i).getT22();
           ob[14] = lista.get(i).getStock();
           
           if (lista.get(i).getEstadoProducto()== 1){  
               ob[15] = "Disponible";
           }
           if (lista.get(i).getEstadoProducto()== 2){  
               ob[15] = "No disponible";
           }
           
           modeloTabla.addRow(ob);
       }
       
       jTableProductos.setModel(modeloTabla);

    }
        public void listarCostoMin(){
       
       List <EntidadProducto> lista = pDAO.listarCostoMin();
       modeloTabla = (DefaultTableModel)jTableProductos.getModel();
       Object[]ob = new Object[16];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdProducto();
           ob[1] = lista.get(i).getCodigo();
           ob[2] = lista.get(i).getNombre();
           ob[3] = lista.get(i).getPrecioVenta();
           ob[4] = lista.get(i).getCosto();
           ob[5] = lista.get(i).getT6();
           ob[6] = lista.get(i).getT8();
           ob[7] = lista.get(i).getT10();
           ob[8] = lista.get(i).getT12();
           ob[9] = lista.get(i).getT14();
           ob[10] = lista.get(i).getT16();
           ob[11] = lista.get(i).getT18();
           ob[12] = lista.get(i).getT20();
           ob[13] = lista.get(i).getT22();
           ob[14] = lista.get(i).getStock();
           
           if (lista.get(i).getEstadoProducto()== 1){  
               ob[15] = "Disponible";
           }
           if (lista.get(i).getEstadoProducto()== 2){  
               ob[15] = "No disponible";
           }
           
           modeloTabla.addRow(ob);
       }
       
       jTableProductos.setModel(modeloTabla);

    }
        public void listarPrecioMax(){
       
       List <EntidadProducto> lista = pDAO.listarPrecioMax();
       modeloTabla = (DefaultTableModel)jTableProductos.getModel();
       Object[]ob = new Object[16];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdProducto();
           ob[1] = lista.get(i).getCodigo();
           ob[2] = lista.get(i).getNombre();
           ob[3] = lista.get(i).getPrecioVenta();
           ob[4] = lista.get(i).getCosto();
           ob[5] = lista.get(i).getT6();
           ob[6] = lista.get(i).getT8();
           ob[7] = lista.get(i).getT10();
           ob[8] = lista.get(i).getT12();
           ob[9] = lista.get(i).getT14();
           ob[10] = lista.get(i).getT16();
           ob[11] = lista.get(i).getT18();
           ob[12] = lista.get(i).getT20();
           ob[13] = lista.get(i).getT22();
           ob[14] = lista.get(i).getStock();
           
           if (lista.get(i).getEstadoProducto()== 1){  
               ob[15] = "Disponible";
           }
           if (lista.get(i).getEstadoProducto()== 2){  
               ob[15] = "No disponible";
           }
           
           modeloTabla.addRow(ob);
       }
       
       jTableProductos.setModel(modeloTabla);

    }
        public void listarPrecioMin(){
       
       List <EntidadProducto> lista = pDAO.listarPrecioMin();
       modeloTabla = (DefaultTableModel)jTableProductos.getModel();
       Object[]ob = new Object[16];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdProducto();
           ob[1] = lista.get(i).getCodigo();
           ob[2] = lista.get(i).getNombre();
           ob[3] = lista.get(i).getPrecioVenta();
           ob[4] = lista.get(i).getCosto();
           ob[5] = lista.get(i).getT6();
           ob[6] = lista.get(i).getT8();
           ob[7] = lista.get(i).getT10();
           ob[8] = lista.get(i).getT12();
           ob[9] = lista.get(i).getT14();
           ob[10] = lista.get(i).getT16();
           ob[11] = lista.get(i).getT18();
           ob[12] = lista.get(i).getT20();
           ob[13] = lista.get(i).getT22();
           ob[14] = lista.get(i).getStock();
           
           if (lista.get(i).getEstadoProducto()== 1){  
               ob[15] = "Disponible";
           }
           if (lista.get(i).getEstadoProducto()== 2){  
               ob[15] = "No disponible";
           }
           
           modeloTabla.addRow(ob);
       }
       
       jTableProductos.setModel(modeloTabla);

    }
        public void listarDispo(){
       
       List <EntidadProducto> lista = pDAO.listarDisponible();
       modeloTabla = (DefaultTableModel)jTableProductos.getModel();
       Object[]ob = new Object[16];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdProducto();
           ob[1] = lista.get(i).getCodigo();
           ob[2] = lista.get(i).getNombre();
           ob[3] = lista.get(i).getPrecioVenta();
           ob[4] = lista.get(i).getCosto();
           ob[5] = lista.get(i).getT6();
           ob[6] = lista.get(i).getT8();
           ob[7] = lista.get(i).getT10();
           ob[8] = lista.get(i).getT12();
           ob[9] = lista.get(i).getT14();
           ob[10] = lista.get(i).getT16();
           ob[11] = lista.get(i).getT18();
           ob[12] = lista.get(i).getT20();
           ob[13] = lista.get(i).getT22();
           ob[14] = lista.get(i).getStock();
           
           if (lista.get(i).getEstadoProducto()== 1){  
               ob[15] = "Disponible";
           }
           if (lista.get(i).getEstadoProducto()== 2){  
               ob[15] = "No disponible";
           }
           
           modeloTabla.addRow(ob);
       }
       
       jTableProductos.setModel(modeloTabla);

    }
        public void listarNoDispo(){
       
       List <EntidadProducto> lista = pDAO.listarNoDisponible();
       modeloTabla = (DefaultTableModel)jTableProductos.getModel();
       Object[]ob = new Object[16];
       
       for (int i = 0; i < lista.size(); i++) {
           
           ob[0] = lista.get(i).getIdProducto();
           ob[1] = lista.get(i).getCodigo();
           ob[2] = lista.get(i).getNombre();
           ob[3] = lista.get(i).getPrecioVenta();
           ob[4] = lista.get(i).getCosto();
           ob[5] = lista.get(i).getT6();
           ob[6] = lista.get(i).getT8();
           ob[7] = lista.get(i).getT10();
           ob[8] = lista.get(i).getT12();
           ob[9] = lista.get(i).getT14();
           ob[10] = lista.get(i).getT16();
           ob[11] = lista.get(i).getT18();
           ob[12] = lista.get(i).getT20();
           ob[13] = lista.get(i).getT22();
           ob[14] = lista.get(i).getStock();
           
           if (lista.get(i).getEstadoProducto()== 1){  
               ob[15] = "Disponible";
           }
           if (lista.get(i).getEstadoProducto()== 2){  
               ob[15] = "No disponible";
           }
           
           modeloTabla.addRow(ob);
       }
       
       jTableProductos.setModel(modeloTabla);

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
        jTableProductos = new javax.swing.JTable();
        jButtonBAvanzada = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonListarInicial = new javax.swing.JButton();
        jButtonListarNombre = new javax.swing.JButton();
        jButtonListarStockMax = new javax.swing.JButton();
        jButtonListarStockMin = new javax.swing.JButton();
        jButtonListarCostoMax = new javax.swing.JButton();
        jButtonListarCostoMin = new javax.swing.JButton();
        jButtonListarPrecioMax = new javax.swing.JButton();
        jButtonListarPrecioMin = new javax.swing.JButton();
        jButtonListarDispo = new javax.swing.JButton();
        jButtonListarNoDispo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonBuscarVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableProductos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CÓDIGO", "NOMBRE", "PRECIO", "COSTO", "T6", "T8", "T10", "T12", "T14", "T16", "T18", "T20", "T22", "TOTAL", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProductos);
        if (jTableProductos.getColumnModel().getColumnCount() > 0) {
            jTableProductos.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTableProductos.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTableProductos.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTableProductos.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTableProductos.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTableProductos.getColumnModel().getColumn(5).setPreferredWidth(2);
            jTableProductos.getColumnModel().getColumn(6).setPreferredWidth(2);
            jTableProductos.getColumnModel().getColumn(7).setPreferredWidth(2);
            jTableProductos.getColumnModel().getColumn(8).setPreferredWidth(2);
            jTableProductos.getColumnModel().getColumn(9).setPreferredWidth(2);
            jTableProductos.getColumnModel().getColumn(10).setPreferredWidth(2);
            jTableProductos.getColumnModel().getColumn(11).setPreferredWidth(2);
            jTableProductos.getColumnModel().getColumn(12).setPreferredWidth(2);
            jTableProductos.getColumnModel().getColumn(13).setPreferredWidth(2);
            jTableProductos.getColumnModel().getColumn(14).setPreferredWidth(50);
            jTableProductos.getColumnModel().getColumn(15).setPreferredWidth(40);
        }

        jButtonBAvanzada.setBackground(new java.awt.Color(205, 255, 204));
        jButtonBAvanzada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBAvanzada.setText("BÚSQUEDA AVANZADA");
        jButtonBAvanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBAvanzadaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButtonListarInicial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarInicial.setText("RESTABLECER ORDEN INICIAL");
        jButtonListarInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarInicialActionPerformed(evt);
            }
        });

        jButtonListarNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarNombre.setText("NOMBRE");
        jButtonListarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarNombreActionPerformed(evt);
            }
        });

        jButtonListarStockMax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarStockMax.setText("STOCK MAX");
        jButtonListarStockMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarStockMaxActionPerformed(evt);
            }
        });

        jButtonListarStockMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarStockMin.setText("STOCK MIN");
        jButtonListarStockMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarStockMinActionPerformed(evt);
            }
        });

        jButtonListarCostoMax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarCostoMax.setText("COSTO MAX");
        jButtonListarCostoMax.setMaximumSize(new java.awt.Dimension(95, 23));
        jButtonListarCostoMax.setMinimumSize(new java.awt.Dimension(95, 23));
        jButtonListarCostoMax.setPreferredSize(new java.awt.Dimension(95, 23));
        jButtonListarCostoMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarCostoMaxActionPerformed(evt);
            }
        });

        jButtonListarCostoMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarCostoMin.setText("COSTO MIN");
        jButtonListarCostoMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarCostoMinActionPerformed(evt);
            }
        });

        jButtonListarPrecioMax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarPrecioMax.setText("PRECIO MAX");
        jButtonListarPrecioMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarPrecioMaxActionPerformed(evt);
            }
        });

        jButtonListarPrecioMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarPrecioMin.setText("PRECIO MIN");
        jButtonListarPrecioMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarPrecioMinActionPerformed(evt);
            }
        });

        jButtonListarDispo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarDispo.setText("DISPONIBLE");
        jButtonListarDispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarDispoActionPerformed(evt);
            }
        });

        jButtonListarNoDispo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListarNoDispo.setText("NO DISPONIBLE");
        jButtonListarNoDispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarNoDispoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonListarNombre)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonListarStockMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonListarStockMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonListarCostoMax, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jButtonListarCostoMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonListarPrecioMin)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonListarNoDispo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonListarPrecioMax)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonListarDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonListarInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonListarStockMax, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonListarCostoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonListarPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonListarDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonListarStockMin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonListarCostoMin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonListarPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonListarNoDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jButtonListarInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonListarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
                            .addComponent(jButtonBAvanzada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pantalones.png"))); // NOI18N
        jLabel1.setText("BUSCAR PRODUCTO");

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

    private void jButtonBAvanzadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBAvanzadaActionPerformed
        // TODO add your handling code here:

        AdminBuscarEspProducto abrir = new AdminBuscarEspProducto();
        abrir.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonBAvanzadaActionPerformed

    private void jButtonBuscarVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarVolverActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jButtonBuscarVolverActionPerformed

    private void jButtonListarInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarInicialActionPerformed
        limpiarTabla();
        listar();
    }//GEN-LAST:event_jButtonListarInicialActionPerformed

    private void jButtonListarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarNombreActionPerformed
        limpiarTabla();
        listarNombre();
    }//GEN-LAST:event_jButtonListarNombreActionPerformed

    private void jButtonListarStockMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarStockMaxActionPerformed
        limpiarTabla();
        listarStockMax();
    }//GEN-LAST:event_jButtonListarStockMaxActionPerformed

    private void jButtonListarStockMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarStockMinActionPerformed
        limpiarTabla();
        listarStockMin();
    }//GEN-LAST:event_jButtonListarStockMinActionPerformed

    private void jButtonListarCostoMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarCostoMaxActionPerformed
        limpiarTabla();
        listarCostoMax();
    }//GEN-LAST:event_jButtonListarCostoMaxActionPerformed

    private void jButtonListarCostoMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarCostoMinActionPerformed
        limpiarTabla();
        listarCostoMin();
    }//GEN-LAST:event_jButtonListarCostoMinActionPerformed

    private void jButtonListarPrecioMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarPrecioMaxActionPerformed
        limpiarTabla();
        listarPrecioMax();
    }//GEN-LAST:event_jButtonListarPrecioMaxActionPerformed

    private void jButtonListarPrecioMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarPrecioMinActionPerformed
        limpiarTabla();
        listarPrecioMin();
    }//GEN-LAST:event_jButtonListarPrecioMinActionPerformed

    private void jButtonListarDispoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarDispoActionPerformed
        limpiarTabla();
        listarDispo();
    }//GEN-LAST:event_jButtonListarDispoActionPerformed

    private void jButtonListarNoDispoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarNoDispoActionPerformed
        limpiarTabla();
        listarNoDispo();
    }//GEN-LAST:event_jButtonListarNoDispoActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBAvanzada;
    private javax.swing.JButton jButtonBuscarVolver;
    private javax.swing.JButton jButtonListarCostoMax;
    private javax.swing.JButton jButtonListarCostoMin;
    private javax.swing.JButton jButtonListarDispo;
    private javax.swing.JButton jButtonListarInicial;
    private javax.swing.JButton jButtonListarNoDispo;
    private javax.swing.JButton jButtonListarNombre;
    private javax.swing.JButton jButtonListarPrecioMax;
    private javax.swing.JButton jButtonListarPrecioMin;
    private javax.swing.JButton jButtonListarStockMax;
    private javax.swing.JButton jButtonListarStockMin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductos;
    // End of variables declaration//GEN-END:variables
}
