package com.tienda.demotienda.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Productos")
public class Producto   {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idProducto")
    private Long idProducto;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio")
    private double precio;
    @Column(name = "stock")
    private int stock;

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    @OneToMany(mappedBy = "producto")
    private List<DetallePedido> detalles;
}
