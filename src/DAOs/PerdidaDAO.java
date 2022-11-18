/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Conexion.Conexion;
import Modelos.EntidadPerdida;
import Modelos.ICrud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PerdidaDAO implements ICrud {

    PreparedStatement ps;
    ResultSet rs;
    
    Conexion con = new Conexion();
    Connection conectar;
    
    @Override
    public List listar() {
        
        List<EntidadPerdida> lista = new ArrayList<>();
        String qSql = "SELECT * FROM perdida";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadPerdida epd = new EntidadPerdida();
                
                epd.setIdPerdida(rs.getInt(1));
                epd.setIdVenta(rs.getInt(2));
                epd.setIdProducto(rs.getInt(3));
                epd.setT6(rs.getInt(4));
                epd.setT8(rs.getInt(5));
                epd.setT10(rs.getInt(6));
                epd.setT12(rs.getInt(7));
                epd.setT14(rs.getInt(8));
                epd.setT16(rs.getInt(9));
                epd.setT18(rs.getInt(10));
                epd.setT20(rs.getInt(11));
                epd.setT22(rs.getInt(12));
                epd.setValorPerdida(rs.getDouble(13));
                epd.setFecha(rs.getString(14));
    
                lista.add(epd);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
    public List listarIdVenta() {
        
        List<EntidadPerdida> lista = new ArrayList<>();
        String qSql = "SELECT * FROM perdida ORDER BY id_venta";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadPerdida epd = new EntidadPerdida();
                
                epd.setIdPerdida(rs.getInt(1));
                epd.setIdVenta(rs.getInt(2));
                epd.setIdProducto(rs.getInt(3));
                epd.setT6(rs.getInt(4));
                epd.setT8(rs.getInt(5));
                epd.setT10(rs.getInt(6));
                epd.setT12(rs.getInt(7));
                epd.setT14(rs.getInt(8));
                epd.setT16(rs.getInt(9));
                epd.setT18(rs.getInt(10));
                epd.setT20(rs.getInt(11));
                epd.setT22(rs.getInt(12));
                epd.setValorPerdida(rs.getDouble(13));
                epd.setFecha(rs.getString(14));
    
                lista.add(epd);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
    public List listarCodigo() {
        
        List<EntidadPerdida> lista = new ArrayList<>();
        String qSql = "SELECT * FROM perdida ORDER BY id_producto";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadPerdida epd = new EntidadPerdida();
                
                epd.setIdPerdida(rs.getInt(1));
                epd.setIdVenta(rs.getInt(2));
                epd.setIdProducto(rs.getInt(3));
                epd.setT6(rs.getInt(4));
                epd.setT8(rs.getInt(5));
                epd.setT10(rs.getInt(6));
                epd.setT12(rs.getInt(7));
                epd.setT14(rs.getInt(8));
                epd.setT16(rs.getInt(9));
                epd.setT18(rs.getInt(10));
                epd.setT20(rs.getInt(11));
                epd.setT22(rs.getInt(12));
                epd.setValorPerdida(rs.getDouble(13));
                epd.setFecha(rs.getString(14));
    
                lista.add(epd);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
    public List listarPerdidaMax() {
        
        List<EntidadPerdida> lista = new ArrayList<>();
        String qSql = "SELECT * FROM perdida ORDER BY valor_perdida DESC";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadPerdida epd = new EntidadPerdida();
                
                epd.setIdPerdida(rs.getInt(1));
                epd.setIdVenta(rs.getInt(2));
                epd.setIdProducto(rs.getInt(3));
                epd.setT6(rs.getInt(4));
                epd.setT8(rs.getInt(5));
                epd.setT10(rs.getInt(6));
                epd.setT12(rs.getInt(7));
                epd.setT14(rs.getInt(8));
                epd.setT16(rs.getInt(9));
                epd.setT18(rs.getInt(10));
                epd.setT20(rs.getInt(11));
                epd.setT22(rs.getInt(12));
                epd.setValorPerdida(rs.getDouble(13));
                epd.setFecha(rs.getString(14));
    
                lista.add(epd);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
    public List listarPerdidaMin() {
        
        List<EntidadPerdida> lista = new ArrayList<>();
        String qSql = "SELECT * FROM perdida ORDER BY valor_perdida";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadPerdida epd = new EntidadPerdida();
                
                epd.setIdPerdida(rs.getInt(1));
                epd.setIdVenta(rs.getInt(2));
                epd.setIdProducto(rs.getInt(3));
                epd.setT6(rs.getInt(4));
                epd.setT8(rs.getInt(5));
                epd.setT10(rs.getInt(6));
                epd.setT12(rs.getInt(7));
                epd.setT14(rs.getInt(8));
                epd.setT16(rs.getInt(9));
                epd.setT18(rs.getInt(10));
                epd.setT20(rs.getInt(11));
                epd.setT22(rs.getInt(12));
                epd.setValorPerdida(rs.getDouble(13));
                epd.setFecha(rs.getString(14));
    
                lista.add(epd);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
    public List listarReciente() {
        
        List<EntidadPerdida> lista = new ArrayList<>();
        String qSql = "SELECT * FROM perdida ORDER BY fecha_perdida DESC";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadPerdida epd = new EntidadPerdida();
                
                epd.setIdPerdida(rs.getInt(1));
                epd.setIdVenta(rs.getInt(2));
                epd.setIdProducto(rs.getInt(3));
                epd.setT6(rs.getInt(4));
                epd.setT8(rs.getInt(5));
                epd.setT10(rs.getInt(6));
                epd.setT12(rs.getInt(7));
                epd.setT14(rs.getInt(8));
                epd.setT16(rs.getInt(9));
                epd.setT18(rs.getInt(10));
                epd.setT20(rs.getInt(11));
                epd.setT22(rs.getInt(12));
                epd.setValorPerdida(rs.getDouble(13));
                epd.setFecha(rs.getString(14));
    
                lista.add(epd);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
    public List listarAntigua() {
        
        List<EntidadPerdida> lista = new ArrayList<>();
        String qSql = "SELECT * FROM perdida ORDER BY fecha_perdida";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadPerdida epd = new EntidadPerdida();
                
                epd.setIdPerdida(rs.getInt(1));
                epd.setIdVenta(rs.getInt(2));
                epd.setIdProducto(rs.getInt(3));
                epd.setT6(rs.getInt(4));
                epd.setT8(rs.getInt(5));
                epd.setT10(rs.getInt(6));
                epd.setT12(rs.getInt(7));
                epd.setT14(rs.getInt(8));
                epd.setT16(rs.getInt(9));
                epd.setT18(rs.getInt(10));
                epd.setT20(rs.getInt(11));
                epd.setT22(rs.getInt(12));
                epd.setValorPerdida(rs.getDouble(13));
                epd.setFecha(rs.getString(14));
    
                lista.add(epd);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
    @Override
    public int agregar(Object[] o) {
                int r = 0;
        String qSql = "INSERT INTO perdida(id_venta,id_producto,t6"
                + ",t8,t10,t12,t14,t16,t18,t20,"
                + "t22,valor_perdida,fecha_perdida) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
        
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
            ps.setObject(13, o[12]);
            
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return r;
    }

    @Override
    public int modificar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
