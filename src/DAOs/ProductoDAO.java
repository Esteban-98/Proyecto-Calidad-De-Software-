package DAOs;

import Conexion.Conexion;
import Modelos.EntidadProducto;
import Modelos.ICrud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAO implements ICrud{
    
    PreparedStatement ps;
    ResultSet rs;
    
    
    Conexion con = new Conexion();
    Connection conectar;
    
        public String obtenerIdProducto(){
       EntidadProducto ep = new EntidadProducto();
        String idProducto ="";
        String qSql = "SELECT max(idproducto) FROM producto";
        
        try {
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
                while(rs.next()){
                
                    idProducto = rs.getString(1);


            }
        } catch (Exception e) {
        }
        
        return idProducto;
    }

    @Override
    public List listar() {
        List<EntidadProducto> lista = new ArrayList<>();
        String qSql = "SELECT * FROM producto";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadProducto ep = new EntidadProducto();
                
                ep.setIdProducto(rs.getInt(1));
                ep.setNombre(rs.getString(2));
                ep.setCodigo(rs.getString(3));
                ep.setPrecioVenta(rs.getInt(4));
                ep.setCosto(rs.getInt(5));
                ep.setEstadoProducto(rs.getInt(6));
                ep.setT6(rs.getInt(7));
                ep.setT8(rs.getInt(8));
                ep.setT10(rs.getInt(9));
                ep.setT12(rs.getInt(10));
                ep.setT14(rs.getInt(11));
                ep.setT16(rs.getInt(12));
                ep.setT18(rs.getInt(13));
                ep.setT20(rs.getInt(14));
                ep.setT22(rs.getInt(15));
                ep.setStock(rs.getInt(16));
 
                lista.add(ep);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
public List listarNombre() {
        List<EntidadProducto> lista = new ArrayList<>();
        String qSql = "SELECT * FROM producto ORDER BY nombre";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadProducto ep = new EntidadProducto();
                
                ep.setIdProducto(rs.getInt(1));
                ep.setNombre(rs.getString(2));
                ep.setCodigo(rs.getString(3));
                ep.setPrecioVenta(rs.getInt(4));
                ep.setCosto(rs.getInt(5));
                ep.setEstadoProducto(rs.getInt(6));
                ep.setT6(rs.getInt(7));
                ep.setT8(rs.getInt(8));
                ep.setT10(rs.getInt(9));
                ep.setT12(rs.getInt(10));
                ep.setT14(rs.getInt(11));
                ep.setT16(rs.getInt(12));
                ep.setT18(rs.getInt(13));
                ep.setT20(rs.getInt(14));
                ep.setT22(rs.getInt(15));
                ep.setStock(rs.getInt(16));
 
                lista.add(ep);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
public List listarStockMax() {
        List<EntidadProducto> lista = new ArrayList<>();
        String qSql = "SELECT * FROM producto ORDER BY stock DESC";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadProducto ep = new EntidadProducto();
                
                ep.setIdProducto(rs.getInt(1));
                ep.setNombre(rs.getString(2));
                ep.setCodigo(rs.getString(3));
                ep.setPrecioVenta(rs.getInt(4));
                ep.setCosto(rs.getInt(5));
                ep.setEstadoProducto(rs.getInt(6));
                ep.setT6(rs.getInt(7));
                ep.setT8(rs.getInt(8));
                ep.setT10(rs.getInt(9));
                ep.setT12(rs.getInt(10));
                ep.setT14(rs.getInt(11));
                ep.setT16(rs.getInt(12));
                ep.setT18(rs.getInt(13));
                ep.setT20(rs.getInt(14));
                ep.setT22(rs.getInt(15));
                ep.setStock(rs.getInt(16));
 
                lista.add(ep);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
public List listarStockMin() {
        List<EntidadProducto> lista = new ArrayList<>();
        String qSql = "SELECT * FROM producto ORDER BY stock";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadProducto ep = new EntidadProducto();
                
                ep.setIdProducto(rs.getInt(1));
                ep.setNombre(rs.getString(2));
                ep.setCodigo(rs.getString(3));
                ep.setPrecioVenta(rs.getInt(4));
                ep.setCosto(rs.getInt(5));
                ep.setEstadoProducto(rs.getInt(6));
                ep.setT6(rs.getInt(7));
                ep.setT8(rs.getInt(8));
                ep.setT10(rs.getInt(9));
                ep.setT12(rs.getInt(10));
                ep.setT14(rs.getInt(11));
                ep.setT16(rs.getInt(12));
                ep.setT18(rs.getInt(13));
                ep.setT20(rs.getInt(14));
                ep.setT22(rs.getInt(15));
                ep.setStock(rs.getInt(16));
 
                lista.add(ep);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
public List listarCostoMax() {
        List<EntidadProducto> lista = new ArrayList<>();
        String qSql = "SELECT * FROM producto ORDER BY costo DESC";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadProducto ep = new EntidadProducto();
                
                ep.setIdProducto(rs.getInt(1));
                ep.setNombre(rs.getString(2));
                ep.setCodigo(rs.getString(3));
                ep.setPrecioVenta(rs.getInt(4));
                ep.setCosto(rs.getInt(5));
                ep.setEstadoProducto(rs.getInt(6));
                ep.setT6(rs.getInt(7));
                ep.setT8(rs.getInt(8));
                ep.setT10(rs.getInt(9));
                ep.setT12(rs.getInt(10));
                ep.setT14(rs.getInt(11));
                ep.setT16(rs.getInt(12));
                ep.setT18(rs.getInt(13));
                ep.setT20(rs.getInt(14));
                ep.setT22(rs.getInt(15));
                ep.setStock(rs.getInt(16));
 
                lista.add(ep);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
public List listarCostoMin() {
        List<EntidadProducto> lista = new ArrayList<>();
        String qSql = "SELECT * FROM producto ORDER BY costo";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadProducto ep = new EntidadProducto();
                
                ep.setIdProducto(rs.getInt(1));
                ep.setNombre(rs.getString(2));
                ep.setCodigo(rs.getString(3));
                ep.setPrecioVenta(rs.getInt(4));
                ep.setCosto(rs.getInt(5));
                ep.setEstadoProducto(rs.getInt(6));
                ep.setT6(rs.getInt(7));
                ep.setT8(rs.getInt(8));
                ep.setT10(rs.getInt(9));
                ep.setT12(rs.getInt(10));
                ep.setT14(rs.getInt(11));
                ep.setT16(rs.getInt(12));
                ep.setT18(rs.getInt(13));
                ep.setT20(rs.getInt(14));
                ep.setT22(rs.getInt(15));
                ep.setStock(rs.getInt(16));
 
                lista.add(ep);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
public List listarPrecioMax() {
        List<EntidadProducto> lista = new ArrayList<>();
        String qSql = "SELECT * FROM producto ORDER BY precio_venta DESC";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadProducto ep = new EntidadProducto();
                
                ep.setIdProducto(rs.getInt(1));
                ep.setNombre(rs.getString(2));
                ep.setCodigo(rs.getString(3));
                ep.setPrecioVenta(rs.getInt(4));
                ep.setCosto(rs.getInt(5));
                ep.setEstadoProducto(rs.getInt(6));
                ep.setT6(rs.getInt(7));
                ep.setT8(rs.getInt(8));
                ep.setT10(rs.getInt(9));
                ep.setT12(rs.getInt(10));
                ep.setT14(rs.getInt(11));
                ep.setT16(rs.getInt(12));
                ep.setT18(rs.getInt(13));
                ep.setT20(rs.getInt(14));
                ep.setT22(rs.getInt(15));
                ep.setStock(rs.getInt(16));
 
                lista.add(ep);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
public List listarPrecioMin() {
        List<EntidadProducto> lista = new ArrayList<>();
        String qSql = "SELECT * FROM producto ORDER BY precio_venta";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadProducto ep = new EntidadProducto();
                
                ep.setIdProducto(rs.getInt(1));
                ep.setNombre(rs.getString(2));
                ep.setCodigo(rs.getString(3));
                ep.setPrecioVenta(rs.getInt(4));
                ep.setCosto(rs.getInt(5));
                ep.setEstadoProducto(rs.getInt(6));
                ep.setT6(rs.getInt(7));
                ep.setT8(rs.getInt(8));
                ep.setT10(rs.getInt(9));
                ep.setT12(rs.getInt(10));
                ep.setT14(rs.getInt(11));
                ep.setT16(rs.getInt(12));
                ep.setT18(rs.getInt(13));
                ep.setT20(rs.getInt(14));
                ep.setT22(rs.getInt(15));
                ep.setStock(rs.getInt(16));
 
                lista.add(ep);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
public List listarDisponible() {
        List<EntidadProducto> lista = new ArrayList<>();
        String qSql = "SELECT * FROM producto WHERE estado_producto=1";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadProducto ep = new EntidadProducto();
                
                ep.setIdProducto(rs.getInt(1));
                ep.setNombre(rs.getString(2));
                ep.setCodigo(rs.getString(3));
                ep.setPrecioVenta(rs.getInt(4));
                ep.setCosto(rs.getInt(5));
                ep.setEstadoProducto(rs.getInt(6));
                ep.setT6(rs.getInt(7));
                ep.setT8(rs.getInt(8));
                ep.setT10(rs.getInt(9));
                ep.setT12(rs.getInt(10));
                ep.setT14(rs.getInt(11));
                ep.setT16(rs.getInt(12));
                ep.setT18(rs.getInt(13));
                ep.setT20(rs.getInt(14));
                ep.setT22(rs.getInt(15));
                ep.setStock(rs.getInt(16));
 
                lista.add(ep);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
public List listarNoDisponible() {
        List<EntidadProducto> lista = new ArrayList<>();
        String qSql = "SELECT * FROM producto WHERE estado_producto=2";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadProducto ep = new EntidadProducto();
                
                ep.setIdProducto(rs.getInt(1));
                ep.setNombre(rs.getString(2));
                ep.setCodigo(rs.getString(3));
                ep.setPrecioVenta(rs.getInt(4));
                ep.setCosto(rs.getInt(5));
                ep.setEstadoProducto(rs.getInt(6));
                ep.setT6(rs.getInt(7));
                ep.setT8(rs.getInt(8));
                ep.setT10(rs.getInt(9));
                ep.setT12(rs.getInt(10));
                ep.setT14(rs.getInt(11));
                ep.setT16(rs.getInt(12));
                ep.setT18(rs.getInt(13));
                ep.setT20(rs.getInt(14));
                ep.setT22(rs.getInt(15));
                ep.setStock(rs.getInt(16));
 
                lista.add(ep);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
    @Override
    public int agregar(Object[] o) {
                int r = 0;
        String qSql = "INSERT INTO producto(nombre,codigo,precio_venta,costo,t6"
                + ",t8,t10,t12,t14,t16,t18,t20,"
                + "t22,stock) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
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
            ps.setObject(14, o[13]);
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return r;
    }

    @Override
    public int modificar(Object[] o) {
        
        int r = 0;
        String qSql = "UPDATE producto SET precio_venta=?,costo=? WHERE codigo=?"; 
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return r;
    }

    @Override
    public int habilitarDeshabilitar(Object[] o) {
        int r = 0;
        String qSql = "UPDATE producto SET estado_producto=? WHERE codigo=?"; 
        
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
    
    public int reabastecer (Object[] o){
            int r = 0;
        String qSql = "UPDATE producto SET t6=?,t8=?,t10=?,t12=?,t14=?,t16=?,t18=?,t20=?,t22=?,stock=? WHERE codigo=?"; 
        
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

            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return r;
    }


    public EntidadProducto buscar(String idendificador) {
                
        EntidadProducto ep = new EntidadProducto();
        String qSql = "SELECT * FROM producto WHERE codigo=?";
        
            try {
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setString(1, idendificador);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                ep.setIdProducto(rs.getInt(1));
                ep.setNombre(rs.getString(2));
                ep.setCodigo(rs.getString(3));
                ep.setPrecioVenta(rs.getInt(4));
                ep.setCosto(rs.getInt(5));
                ep.setEstadoProducto(rs.getInt(6));
                ep.setT6(rs.getInt(7));
                ep.setT8(rs.getInt(8));
                ep.setT10(rs.getInt(9));
                ep.setT12(rs.getInt(10));
                ep.setT14(rs.getInt(11));
                ep.setT16(rs.getInt(12));
                ep.setT18(rs.getInt(13));
                ep.setT20(rs.getInt(14));
                ep.setT22(rs.getInt(15));
                ep.setStock(rs.getInt(16));
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        return ep;
    }
    
        public EntidadProducto buscarPorId(int idendificador) {
                
        EntidadProducto ep = new EntidadProducto();
        String qSql = "SELECT * FROM producto WHERE idproducto=?";
        
            try {
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setInt(1, idendificador);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                ep.setIdProducto(rs.getInt(1));
                ep.setNombre(rs.getString(2));
                ep.setCodigo(rs.getString(3));
                ep.setPrecioVenta(rs.getInt(4));
                ep.setCosto(rs.getInt(5));
                ep.setEstadoProducto(rs.getInt(6));
                ep.setT6(rs.getInt(7));
                ep.setT8(rs.getInt(8));
                ep.setT10(rs.getInt(9));
                ep.setT12(rs.getInt(10));
                ep.setT14(rs.getInt(11));
                ep.setT16(rs.getInt(12));
                ep.setT18(rs.getInt(13));
                ep.setT20(rs.getInt(14));
                ep.setT22(rs.getInt(15));
                ep.setStock(rs.getInt(16));
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        return ep;
    }
        public EntidadProducto buscarDisponible(String idendificador) {
                
        EntidadProducto ep = new EntidadProducto();
        String qSql = "SELECT * FROM producto WHERE codigo=? AND estado_producto=1";
        
            try {
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setString(1, idendificador);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                ep.setIdProducto(rs.getInt(1));
                ep.setNombre(rs.getString(2));
                ep.setCodigo(rs.getString(3));
                ep.setPrecioVenta(rs.getInt(4));
                ep.setCosto(rs.getInt(5));
                ep.setEstadoProducto(rs.getInt(6));
                ep.setT6(rs.getInt(7));
                ep.setT8(rs.getInt(8));
                ep.setT10(rs.getInt(9));
                ep.setT12(rs.getInt(10));
                ep.setT14(rs.getInt(11));
                ep.setT16(rs.getInt(12));
                ep.setT18(rs.getInt(13));
                ep.setT20(rs.getInt(14));
                ep.setT22(rs.getInt(15));
                ep.setStock(rs.getInt(16));
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        return ep;
    }

    @Override
    public void eliminar(String identificador) {
           throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
