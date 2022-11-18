/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;


public class EntidadPerdida {
    
    int idPerdida;
    int idVenta;
    int idProducto;
    int t6;
    int t8;
    int t10;
    int t12;
    int t14;
    int t16;
    int t18;
    int t20;
    int t22;
    double valorPerdida;
    String fecha;
    
    public EntidadPerdida(){
    
    }

    public EntidadPerdida(int idPerdida, int idVenta, int idProducto, int t6, int t8, int t10, int t12, int t14, int t16, int t18, int t20, int t22, double valorPerdida, String fecha) {
        this.idPerdida = idPerdida;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.t6 = t6;
        this.t8 = t8;
        this.t10 = t10;
        this.t12 = t12;
        this.t14 = t14;
        this.t16 = t16;
        this.t18 = t18;
        this.t20 = t20;
        this.t22 = t22;
        this.valorPerdida = valorPerdida;
        this.fecha = fecha;
    }

    public int getIdPerdida() {
        return idPerdida;
    }

    public void setIdPerdida(int idPerdida) {
        this.idPerdida = idPerdida;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getT6() {
        return t6;
    }

    public void setT6(int t6) {
        this.t6 = t6;
    }

    public int getT8() {
        return t8;
    }

    public void setT8(int t8) {
        this.t8 = t8;
    }

    public int getT10() {
        return t10;
    }

    public void setT10(int t10) {
        this.t10 = t10;
    }

    public int getT12() {
        return t12;
    }

    public void setT12(int t12) {
        this.t12 = t12;
    }

    public int getT14() {
        return t14;
    }

    public void setT14(int t14) {
        this.t14 = t14;
    }

    public int getT16() {
        return t16;
    }

    public void setT16(int t16) {
        this.t16 = t16;
    }

    public int getT18() {
        return t18;
    }

    public void setT18(int t18) {
        this.t18 = t18;
    }

    public int getT20() {
        return t20;
    }

    public void setT20(int t20) {
        this.t20 = t20;
    }

    public int getT22() {
        return t22;
    }

    public void setT22(int t22) {
        this.t22 = t22;
    }

    public double getValorPerdida() {
        return valorPerdida;
    }

    public void setValorPerdida(double valorPerdida) {
        this.valorPerdida = valorPerdida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
