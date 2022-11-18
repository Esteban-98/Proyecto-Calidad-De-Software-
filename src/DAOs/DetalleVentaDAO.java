/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Conexion.Conexion;
import Modelos.EntidadDetalleVenta;
import Modelos.EntidadVenta;
import Modelos.ICrud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DetalleVentaDAO implements ICrud{

    PreparedStatement ps;
    ResultSet rs;
   
    Conexion con = new Conexion();
    Connection conectar;
    
        public EntidadDetalleVenta buscarDetalleEspecifico(Object[] o) {
        
        EntidadDetalleVenta edv = new EntidadDetalleVenta();
        String qSql = "SELECT * FROM detalle_venta WHERE id_venta=? AND id_producto=?";
        
            try {
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            rs = ps.executeQuery();
            
            while(rs.next()){
              
                
                edv.setIdVenta(rs.getInt(1));
                edv.setIdProducto(rs.getInt(2));
                edv.setT6(rs.getInt(3));
                edv.setT8(rs.getInt(4));
                edv.setT10(rs.getInt(5));
                edv.setT12(rs.getInt(6));
                edv.setT14(rs.getInt(7));
                edv.setT16(rs.getInt(8));
                edv.setT18(rs.getInt(9));
                edv.setT20(rs.getInt(10));
                edv.setT22(rs.getInt(11));
                edv.setSubtotal(rs.getDouble(12));
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        return edv;
    }
    
    public List listarPorIdVenta(int idVenta){
            
        List<EntidadDetalleVenta> lista = new ArrayList<>();
        String qSql = "SELECT * FROM detalle_venta WHERE id_venta=?";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setInt(1, idVenta);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadDetalleVenta edv = new EntidadDetalleVenta();
                
                edv.setIdVenta(rs.getInt(1));
                edv.setIdProducto(rs.getInt(2));
                edv.setT6(rs.getInt(3));
                edv.setT8(rs.getInt(4));
                edv.setT10(rs.getInt(5));
                edv.setT12(rs.getInt(6));
                edv.setT14(rs.getInt(7));
                edv.setT16(rs.getInt(8));
                edv.setT18(rs.getInt(9));
                edv.setT20(rs.getInt(10));
                edv.setT22(rs.getInt(11));
                edv.setSubtotal(rs.getDouble(12));
                lista.add(edv);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println("Holi");
        }
        
        return lista;
    }
    
    @Override
    public List listar() {
        
        List<EntidadDetalleVenta> lista = new ArrayList<>();
        String qSql = "SELECT * FROM detalle_venta";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadDetalleVenta edv = new EntidadDetalleVenta();
                
                edv.setIdVenta(rs.getInt(1));
                edv.setIdProducto(rs.getInt(2));
                edv.setT6(rs.getInt(3));
                edv.setT8(rs.getInt(4));
                edv.setT10(rs.getInt(5));
                edv.setT12(rs.getInt(6));
                edv.setT14(rs.getInt(7));
                edv.setT16(rs.getInt(8));
                edv.setT18(rs.getInt(9));
                edv.setT20(rs.getInt(10));
                edv.setT22(rs.getInt(11));
                edv.setSubtotal(rs.getDouble(12));
                lista.add(edv);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }

    @Override
    public int agregar(Object[] o) {
        int r = 0;
        String qSql = "INSERT INTO detalle_venta(id_venta,id_producto,t6"
                + ",t8,t10,t12,t14,t16,t18,t20,"
                + "t22,subtotal) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)"; 
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
            ps.setObject(9, o[8]);
            ps.setObject(10, o[9]);
            ps.setObject(11, o[10]);
            ps.setObject(12, o[11]);

            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return r;
    }
//Modificar cantidades y subtotales
    @Override
    public int modificar(Object[] o) {
        int r = 0;
        String qSql = "UPDATE detalle_venta SET t6=?,t8=?,t10=?,t12=?,t14=?,t16=?,t18=?,t20=?,t22=?,subtotal=? WHERE id_venta=?"
                + " AND id_producto=?"; 
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
            ps.setObject(9, o[8]);
            ps.setObject(10, o[9]);
            ps.setObject(11, o[10]);
            ps.setObject(12, o[11]);
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return r;
    }

    @Override
    public int habilitarDeshabilitar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(String identificador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
