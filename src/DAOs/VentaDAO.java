/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Conexion.Conexion;
import Modelos.EntidadVenta;
import Modelos.ICrud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class VentaDAO implements ICrud{
    
    PreparedStatement ps;
    ResultSet rs;
   
    Conexion con = new Conexion();
    Connection conectar;

    
        public EntidadVenta buscarPorId(int idVenta) {
        
        EntidadVenta ev = new EntidadVenta();
        String qSql = "SELECT * FROM venta WHERE idventa=?";
        
            try {
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setInt(1, idVenta);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                ev.setIdVenta(rs.getInt(1));
                ev.setFecha(rs.getString(2));
                ev.setEstadoVenta(rs.getInt(3));
                ev.setTotal(rs.getDouble(4));
                ev.setIdVendedor(rs.getInt(5));
                ev.setMetodoPago(rs.getInt(6));
                ev.setIdCliente(rs.getInt(7));
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        return ev;
    }
    
                public EntidadVenta buscarPorIdEstado(int idVenta) {
        
        EntidadVenta ev = new EntidadVenta();
        String qSql = "SELECT * FROM venta WHERE idventa=? AND estado_venta = 1";
        
            try {
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setInt(1, idVenta);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                ev.setIdVenta(rs.getInt(1));
                ev.setFecha(rs.getString(2));
                ev.setEstadoVenta(rs.getInt(3));
                ev.setTotal(rs.getDouble(4));
                ev.setIdVendedor(rs.getInt(5));
                ev.setMetodoPago(rs.getInt(6));
                ev.setIdCliente(rs.getInt(7));
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        return ev;
    }
    public String obtenerIdVenta(){
    EntidadVenta ev = new EntidadVenta();
        String idVenta ="";
        String qSql = "SELECT max(idventa) FROM venta";
        
        try {
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
                while(rs.next()){
                
                    idVenta = rs.getString(1);


            }
        } catch (Exception e) {
        }
        
        return idVenta;
    }
    
    @Override
    public List listar() {
        List<EntidadVenta> lista = new ArrayList<>();
        String qSql = "SELECT * FROM venta";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadVenta ev = new EntidadVenta();
                
                ev.setIdVenta(rs.getInt(1));
                ev.setFecha(rs.getString(2));
                ev.setEstadoVenta(rs.getInt(3));
                ev.setTotal(rs.getDouble(4));
                ev.setIdVendedor(rs.getInt(5));
                ev.setMetodoPago(rs.getInt(6));
                ev.setIdCliente(rs.getInt(7));
                
                lista.add(ev);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
       public List listarRecientes() {
        List<EntidadVenta> lista = new ArrayList<>();
        String qSql = "SELECT * FROM venta ORDER BY fecha DESC";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadVenta ev = new EntidadVenta();
                
                ev.setIdVenta(rs.getInt(1));
                ev.setFecha(rs.getString(2));
                ev.setEstadoVenta(rs.getInt(3));
                ev.setTotal(rs.getDouble(4));
                ev.setIdVendedor(rs.getInt(5));
                ev.setMetodoPago(rs.getInt(6));
                ev.setIdCliente(rs.getInt(7));
                
                lista.add(ev);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
       public List listarAntiguas() {
        List<EntidadVenta> lista = new ArrayList<>();
        String qSql = "SELECT * FROM venta ORDER BY fecha";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadVenta ev = new EntidadVenta();
                
                ev.setIdVenta(rs.getInt(1));
                ev.setFecha(rs.getString(2));
                ev.setEstadoVenta(rs.getInt(3));
                ev.setTotal(rs.getDouble(4));
                ev.setIdVendedor(rs.getInt(5));
                ev.setMetodoPago(rs.getInt(6));
                ev.setIdCliente(rs.getInt(7));
                
                lista.add(ev);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
       public List listarActivas() {
        List<EntidadVenta> lista = new ArrayList<>();
        String qSql = "SELECT * FROM venta WHERE estado_venta=1";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadVenta ev = new EntidadVenta();
                
                ev.setIdVenta(rs.getInt(1));
                ev.setFecha(rs.getString(2));
                ev.setEstadoVenta(rs.getInt(3));
                ev.setTotal(rs.getDouble(4));
                ev.setIdVendedor(rs.getInt(5));
                ev.setMetodoPago(rs.getInt(6));
                ev.setIdCliente(rs.getInt(7));
                
                lista.add(ev);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
       public List listarNoActivas() {
        List<EntidadVenta> lista = new ArrayList<>();
        String qSql = "SELECT * FROM venta WHERE estado_venta=2";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadVenta ev = new EntidadVenta();
                
                ev.setIdVenta(rs.getInt(1));
                ev.setFecha(rs.getString(2));
                ev.setEstadoVenta(rs.getInt(3));
                ev.setTotal(rs.getDouble(4));
                ev.setIdVendedor(rs.getInt(5));
                ev.setMetodoPago(rs.getInt(6));
                ev.setIdCliente(rs.getInt(7));
                
                lista.add(ev);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
       public List listarTotalMax() {
        List<EntidadVenta> lista = new ArrayList<>();
        String qSql = "SELECT * FROM venta ORDER BY total DESC";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadVenta ev = new EntidadVenta();
                
                ev.setIdVenta(rs.getInt(1));
                ev.setFecha(rs.getString(2));
                ev.setEstadoVenta(rs.getInt(3));
                ev.setTotal(rs.getDouble(4));
                ev.setIdVendedor(rs.getInt(5));
                ev.setMetodoPago(rs.getInt(6));
                ev.setIdCliente(rs.getInt(7));
                
                lista.add(ev);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
       public List listarTotalMin() {
        List<EntidadVenta> lista = new ArrayList<>();
        String qSql = "SELECT * FROM venta ORDER BY total";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadVenta ev = new EntidadVenta();
                
                ev.setIdVenta(rs.getInt(1));
                ev.setFecha(rs.getString(2));
                ev.setEstadoVenta(rs.getInt(3));
                ev.setTotal(rs.getDouble(4));
                ev.setIdVendedor(rs.getInt(5));
                ev.setMetodoPago(rs.getInt(6));
                ev.setIdCliente(rs.getInt(7));
                
                lista.add(ev);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
       
       
       
        public List listarPorID(int idUsuario) {
        List<EntidadVenta> lista = new ArrayList<>();
        String qSql = "SELECT * FROM venta WHERE id_vendedor=?";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadVenta ev = new EntidadVenta();
                
                ev.setIdVenta(rs.getInt(1));
                ev.setFecha(rs.getString(2));
                ev.setEstadoVenta(rs.getInt(3));
                ev.setTotal(rs.getDouble(4));
                ev.setIdVendedor(rs.getInt(5));
                ev.setMetodoPago(rs.getInt(6));
                ev.setIdCliente(rs.getInt(7));
                
                lista.add(ev);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
        public List listarPorIDReciente(int idUsuario) {
        List<EntidadVenta> lista = new ArrayList<>();
        String qSql = "SELECT * FROM venta WHERE id_vendedor=? ORDER BY fecha DESC";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadVenta ev = new EntidadVenta();
                
                ev.setIdVenta(rs.getInt(1));
                ev.setFecha(rs.getString(2));
                ev.setEstadoVenta(rs.getInt(3));
                ev.setTotal(rs.getDouble(4));
                ev.setIdVendedor(rs.getInt(5));
                ev.setMetodoPago(rs.getInt(6));
                ev.setIdCliente(rs.getInt(7));
                
                lista.add(ev);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
        public List listarPorIDActiva(int idUsuario) {
        List<EntidadVenta> lista = new ArrayList<>();
        String qSql = "SELECT * FROM venta WHERE id_vendedor=? AND estado_venta=1";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadVenta ev = new EntidadVenta();
                
                ev.setIdVenta(rs.getInt(1));
                ev.setFecha(rs.getString(2));
                ev.setEstadoVenta(rs.getInt(3));
                ev.setTotal(rs.getDouble(4));
                ev.setIdVendedor(rs.getInt(5));
                ev.setMetodoPago(rs.getInt(6));
                ev.setIdCliente(rs.getInt(7));
                
                lista.add(ev);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
        public List listarPorIDNoActiva(int idUsuario) {
        List<EntidadVenta> lista = new ArrayList<>();
        String qSql = "SELECT * FROM venta WHERE id_vendedor=? AND estado_venta=2";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadVenta ev = new EntidadVenta();
                
                ev.setIdVenta(rs.getInt(1));
                ev.setFecha(rs.getString(2));
                ev.setEstadoVenta(rs.getInt(3));
                ev.setTotal(rs.getDouble(4));
                ev.setIdVendedor(rs.getInt(5));
                ev.setMetodoPago(rs.getInt(6));
                ev.setIdCliente(rs.getInt(7));
                
                lista.add(ev);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
        
//Modificar total de la venta  
    @Override
    public int modificar(Object[] o) {
        int r = 0;
        String qSql = "UPDATE venta SET total=? WHERE idventa=?"; 
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);

            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return r;
    }

    @Override
    public int habilitarDeshabilitar(Object[] o) {
        
        int r = 0;
        String qSql = "UPDATE venta SET estado_venta=? WHERE idventa=?"; 
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);

            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return r;
    }

    @Override
    public void eliminar(String identificador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int agregar(Object[] o) {
                int r = 0;
        String qSql = "INSERT INTO venta(fecha,total,id_vendedor"
                + ",metodo_de_pago,id_cliente) VALUES (?,?,?,?,?)"; 
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);


            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return r;
    }
    
}
