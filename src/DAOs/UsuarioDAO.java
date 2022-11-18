/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Conexion.Conexion;
import Modelos.EntidadUsuario;
import Modelos.ICrud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO implements ICrud{
    
    PreparedStatement ps;
    ResultSet rs;
    
    
    Conexion con = new Conexion();
    Connection conectar;
    
    public EntidadUsuario validarUsuario(String nit, String contrasena){
        EntidadUsuario eu = new EntidadUsuario();
        String qSql = "SELECT * FROM usuario WHERE nit=? AND contrasena=? AND estado_usuario=1";
        try {
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setString(1, nit);
            ps.setString(2, contrasena);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                eu.setIdUsuario(rs.getInt(1));
                eu.setNit(rs.getString(2));
                eu.setPrimerNombre(rs.getString(3));
                eu.setSegundoNombre(rs.getString(4));
                eu.setPrimerApellido(rs.getString(5));
                eu.setSegundoApellido(rs.getString(6));
                eu.setTelefono1(rs.getString(7));
                eu.setTelefono2(rs.getString(8));
                eu.setDireccion(rs.getString(9));
                eu.setContactoEmergencia(rs.getString(10));
                eu.setTelefonoEmergencia(rs.getString(11));
                eu.setRolUsuario(rs.getInt(12));
                eu.setContrasena(rs.getString(13));
                eu.setEdad(rs.getInt(14));
                eu.setEstadoUsuario(rs.getInt(15));
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
    
        
        return eu;
    }

    @Override
    public List listar() {
        List<EntidadUsuario> lista = new ArrayList<>();
        String qSql = "SELECT * FROM usuario WHERE rol_usuario=2";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadUsuario eu = new EntidadUsuario();
                
                eu.setIdUsuario(rs.getInt(1));
                eu.setNit(rs.getString(2));
                eu.setPrimerNombre(rs.getString(3));
                eu.setSegundoNombre(rs.getString(4));
                eu.setPrimerApellido(rs.getString(5));
                eu.setSegundoApellido(rs.getString(6));
                eu.setTelefono1(rs.getString(7));
                eu.setTelefono2(rs.getString(8));
                eu.setDireccion(rs.getString(9));
                eu.setContactoEmergencia(rs.getString(10));
                eu.setTelefonoEmergencia(rs.getString(11));
                eu.setRolUsuario(rs.getInt(12));
                eu.setContrasena(rs.getString(13));
                eu.setEdad(rs.getInt(14));
                eu.setEstadoUsuario(rs.getInt(15));
                
                lista.add(eu);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }

        public List listarPorApellido() {
        List<EntidadUsuario> lista = new ArrayList<>();
        String qSql = "SELECT * FROM usuario WHERE rol_usuario=2 ORDER BY primer_apellido";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadUsuario eu = new EntidadUsuario();
                
                eu.setIdUsuario(rs.getInt(1));
                eu.setNit(rs.getString(2));
                eu.setPrimerNombre(rs.getString(3));
                eu.setSegundoNombre(rs.getString(4));
                eu.setPrimerApellido(rs.getString(5));
                eu.setSegundoApellido(rs.getString(6));
                eu.setTelefono1(rs.getString(7));
                eu.setTelefono2(rs.getString(8));
                eu.setDireccion(rs.getString(9));
                eu.setContactoEmergencia(rs.getString(10));
                eu.setTelefonoEmergencia(rs.getString(11));
                eu.setRolUsuario(rs.getInt(12));
                eu.setContrasena(rs.getString(13));
                eu.setEdad(rs.getInt(14));
                eu.setEstadoUsuario(rs.getInt(15));
                
                lista.add(eu);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
        
            public List listarPorEdad() {
        List<EntidadUsuario> lista = new ArrayList<>();
        String qSql = "SELECT * FROM usuario WHERE rol_usuario=2 ORDER BY edad";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadUsuario eu = new EntidadUsuario();
                
                eu.setIdUsuario(rs.getInt(1));
                eu.setNit(rs.getString(2));
                eu.setPrimerNombre(rs.getString(3));
                eu.setSegundoNombre(rs.getString(4));
                eu.setPrimerApellido(rs.getString(5));
                eu.setSegundoApellido(rs.getString(6));
                eu.setTelefono1(rs.getString(7));
                eu.setTelefono2(rs.getString(8));
                eu.setDireccion(rs.getString(9));
                eu.setContactoEmergencia(rs.getString(10));
                eu.setTelefonoEmergencia(rs.getString(11));
                eu.setRolUsuario(rs.getInt(12));
                eu.setContrasena(rs.getString(13));
                eu.setEdad(rs.getInt(14));
                eu.setEstadoUsuario(rs.getInt(15));
                
                lista.add(eu);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
            
                public List listarPorEstado() {
        List<EntidadUsuario> lista = new ArrayList<>();
        String qSql = "SELECT * FROM usuario WHERE rol_usuario=2 ORDER BY estado_usuario";
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                EntidadUsuario eu = new EntidadUsuario();
                
                eu.setIdUsuario(rs.getInt(1));
                eu.setNit(rs.getString(2));
                eu.setPrimerNombre(rs.getString(3));
                eu.setSegundoNombre(rs.getString(4));
                eu.setPrimerApellido(rs.getString(5));
                eu.setSegundoApellido(rs.getString(6));
                eu.setTelefono1(rs.getString(7));
                eu.setTelefono2(rs.getString(8));
                eu.setDireccion(rs.getString(9));
                eu.setContactoEmergencia(rs.getString(10));
                eu.setTelefonoEmergencia(rs.getString(11));
                eu.setRolUsuario(rs.getInt(12));
                eu.setContrasena(rs.getString(13));
                eu.setEdad(rs.getInt(14));
                eu.setEstadoUsuario(rs.getInt(15));
                
                lista.add(eu);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        
        return lista;
    }
    @Override
    public int agregar(Object[] o) {
        int r = 0;
        String qSql = "INSERT INTO usuario(nit,primer_nombre,segundo_nombre,primer_apellido,segundo_apellido"
                + ",telefono_1,telefono_2,direccion,contacto_emergencia,"
                + "telefono_contacto_emergencia,contrasena,edad ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)"; 
        
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
    public int modificar(Object[] o) {
                int r = 0;
        String qSql = "UPDATE usuario SET telefono_1=?,telefono_2=?,direccion=?,contacto_emergencia=?,"
                + "telefono_contacto_emergencia=? WHERE nit=?"; 
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return r;
        
    }

    public int modificarContrasena(Object[] o) {
                int r = 0;
        String qSql = "UPDATE usuario SET contrasena=? WHERE nit=?"; 
        
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
        String qSql = "UPDATE usuario SET estado_usuario=? WHERE nit=?"; 
        
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
    public EntidadUsuario buscarVendedor(String idendificador) {
        
        EntidadUsuario eu = new EntidadUsuario();
        String qSql = "SELECT * FROM usuario WHERE nit=? AND rol_usuario=2";
        
            try {
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setString(1, idendificador);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                eu.setIdUsuario(rs.getInt(1));
                eu.setNit(rs.getString(2));
                eu.setPrimerNombre(rs.getString(3));
                eu.setSegundoNombre(rs.getString(4));
                eu.setPrimerApellido(rs.getString(5));
                eu.setSegundoApellido(rs.getString(6));
                eu.setTelefono1(rs.getString(7));
                eu.setTelefono2(rs.getString(8));
                eu.setDireccion(rs.getString(9));
                eu.setContactoEmergencia(rs.getString(10));
                eu.setTelefonoEmergencia(rs.getString(11));
                eu.setRolUsuario(rs.getInt(12));
                eu.setContrasena(rs.getString(13));
                eu.setEdad(rs.getInt(14));
                eu.setEstadoUsuario(rs.getInt(15));
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        return eu;
    }
    
    public EntidadUsuario buscar(String idendificador) {
        
        EntidadUsuario eu = new EntidadUsuario();
        String qSql = "SELECT * FROM usuario WHERE nit=?";
        
            try {
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setString(1, idendificador);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                eu.setIdUsuario(rs.getInt(1));
                eu.setNit(rs.getString(2));
                eu.setPrimerNombre(rs.getString(3));
                eu.setSegundoNombre(rs.getString(4));
                eu.setPrimerApellido(rs.getString(5));
                eu.setSegundoApellido(rs.getString(6));
                eu.setTelefono1(rs.getString(7));
                eu.setTelefono2(rs.getString(8));
                eu.setDireccion(rs.getString(9));
                eu.setContactoEmergencia(rs.getString(10));
                eu.setTelefonoEmergencia(rs.getString(11));
                eu.setRolUsuario(rs.getInt(12));
                eu.setContrasena(rs.getString(13));
                eu.setEdad(rs.getInt(14));
                eu.setEstadoUsuario(rs.getInt(15));
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        return eu;
    }
    
    @Override
    public void eliminar(String identificador){
        String qSql = "DELETE FROM usuario WHERE nit=?"; 
        
        try {
            
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setString(1, identificador);
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
        public EntidadUsuario buscarPorId(int idUsuario) {
        
        EntidadUsuario eu = new EntidadUsuario();
        String qSql = "SELECT * FROM usuario WHERE idusuario=?";
        
            try {
            conectar = con.getConnection();
            ps = conectar.prepareStatement(qSql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                eu.setIdUsuario(rs.getInt(1));
                eu.setNit(rs.getString(2));
                eu.setPrimerNombre(rs.getString(3));
                eu.setSegundoNombre(rs.getString(4));
                eu.setPrimerApellido(rs.getString(5));
                eu.setSegundoApellido(rs.getString(6));
                eu.setTelefono1(rs.getString(7));
                eu.setTelefono2(rs.getString(8));
                eu.setDireccion(rs.getString(9));
                eu.setContactoEmergencia(rs.getString(10));
                eu.setTelefonoEmergencia(rs.getString(11));
                eu.setRolUsuario(rs.getInt(12));
                eu.setContrasena(rs.getString(13));
                eu.setEdad(rs.getInt(14));
                eu.setEstadoUsuario(rs.getInt(15));
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
        return eu;
    }
    
}
