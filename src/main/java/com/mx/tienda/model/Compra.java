package com.mx.tienda.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @Column(name="id_compra")
    private int idCompra;
    @Column(name="nombre_producto")
    private String nombreProducto;
    @Column(name="precio_producto")
    private double precioProducto;
    @Column(name="fecha_compra")
    private Date fechaCompra;
    @Column(name="sub_total_compra")
    private double subTotalCompra;
    @Column(name="total_compra")
    private double totalCompra;
    


    public Compra(){}


    public Compra(int idCompra, String nombreProducto, double  precioProducto, Date fechaCompra, double subTotalCompra,
            double totalCompra) {
        this.idCompra = idCompra;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.fechaCompra = fechaCompra;
        this.subTotalCompra = subTotalCompra;
        this.totalCompra = totalCompra;
    }


    public int getIdCompra() {
        return idCompra;
    }


    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }


    public String getNombreProducto() {
        return nombreProducto;
    }


    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }


    public double getPrecioProducto() {
        return precioProducto;
    }


    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }


    public Date getFechaCompra() {
        return fechaCompra;
    }


    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }


    public double getSubTotalCompra() {
        return subTotalCompra;
    }


    public void setSubTotalCompra(double subTotalCompra) {
        this.subTotalCompra = subTotalCompra;
    }


    public double getTotalCompra() {
        return totalCompra;
    }


    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }






}
