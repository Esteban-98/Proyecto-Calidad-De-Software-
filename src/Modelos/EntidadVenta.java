/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;


public class EntidadVenta {
    
    int idVenta;
    String fecha;
    int estadoVenta;
    double total;
    int idVendedor;
    int metodoPago;
    int idCliente;
    
    public EntidadVenta(){
    }

    public EntidadVenta(int idVenta, String fecha, int estadoVenta, double total, int idVendedor, int metodoPago, int idCliente) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.estadoVenta = estadoVenta;
        this.total = total;
        this.idVendedor = idVendedor;
        this.metodoPago = metodoPago;
        this.idCliente = idCliente;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEstadoVenta() {
        return estadoVenta;
    }

    public void setEstadoVenta(int estadoVenta) {
        this.estadoVenta = estadoVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(int metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
