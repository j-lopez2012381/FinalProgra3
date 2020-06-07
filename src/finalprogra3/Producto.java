/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprogra3;

/**
 *
 * @author Estuardo
 */
public class Producto {
    
    int numero;
    String producto, tipoProducto, fabricanteProducto, fechaIngreso;
    double precioProducto;

    public Producto(int numero, String producto, String tipoProducto, String fabricanteProducto, String fechaIngreso, double precioProducto) {
        this.numero = numero;
        this.producto = producto;
        this.tipoProducto = tipoProducto;
        this.fabricanteProducto = fabricanteProducto;
        this.fechaIngreso = fechaIngreso;
        this.precioProducto = precioProducto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getFabricanteProducto() {
        return fabricanteProducto;
    }

    public void setFabricanteProducto(String fabricanteProducto) {
        this.fabricanteProducto = fabricanteProducto;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    
    
}
