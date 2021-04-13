/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.modelo;

/**
 *
 * @author Carlos
 */
public class Producto {
    
    private int id;
    private String producto;
    private double precio;
    private int cantidad;
    
    public Producto(){
        id =0;
        producto ="";
        precio=0;
        cantidad=0;
        
    }
    public Producto(int id, String producto,double precio, int cantidad){
        
        this.id =id;
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}

    