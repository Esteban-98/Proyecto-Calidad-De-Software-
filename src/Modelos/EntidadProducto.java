package Modelos;

public class EntidadProducto {
    
    int idProducto;
    String nombre;
    String codigo;
    int precioVenta;
    int costo;
    int estadoProducto;
    int t6;
    int t8;
    int t10;
    int t12;
    int t14;
    int t16;
    int t18;
    int t20;
    int t22;
    int stock;
    
    public EntidadProducto() {
    }

    public EntidadProducto(int idProducto, String nombre, String codigo, int precioVenta, int costo, int estadoProducto, int t6, int t8, int t10, int t12, int t14, int t16, int t18, int t20, int t22,int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.codigo = codigo;
        this.precioVenta = precioVenta;
        this.costo = costo;
        this.estadoProducto = estadoProducto;
        this.t6 = t6;
        this.t8 = t8;
        this.t10 = t10;
        this.t12 = t12;
        this.t14 = t14;
        this.t16 = t16;
        this.t18 = t18;
        this.t20 = t20;
        this.t22 = t22;
        this.stock = stock;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(int estadoProducto) {
        this.estadoProducto = estadoProducto;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
}
