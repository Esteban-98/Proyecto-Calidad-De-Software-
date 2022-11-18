/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Conexion.Conexion;
import Modelos.EntidadCliente;
import Modelos.ICrud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class ClienteDAO implements ICrud{
    
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion con = new Conexion();
    Connection conectar;

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int agregar(Object[] o) {
        int r = 0;
        String qSql = "INSERT INTO cliente(nit,nombre_primero,apellido_primero,telefono)"
                + "VALUES (?,?,?,?)"; 
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            
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
    
        public EntidadCliente buscar(String idendificador) {
        
        EntidadCliente ec = new EntidadCliente();
        String qSql = "SELECT * FROM cliente WHERE nit=?";
        
            try {
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setString(1, idendificador);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                ec.setIdCliente(rs.getInt(1));
                ec.setNit(rs.getString(2));
                ec.setNombre(rs.getString(3));
                ec.setApellido(rs.getString(4));
                ec.setTelefono(rs.getString(5));

            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        return ec;
    }
        
        public EntidadCliente buscarPorId(int idCliente) {
        
        EntidadCliente ec = new EntidadCliente();
        String qSql = "SELECT * FROM cliente WHERE idcliente=?";
        
            try {
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setInt(1, idCliente);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                ec.setIdCliente(rs.getInt(1));
                ec.setNit(rs.getString(2));
                ec.setNombre(rs.getString(3));
                ec.setApellido(rs.getString(4));
                ec.setTelefono(rs.getString(5));

            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        return ec;
    }

}
