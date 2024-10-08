package com.tienda.demotienda.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Inventarios")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idInventario")
    private Long idInventario;
    @Column(name = "cantidadDisponible")
    private int cantidadDisponible;
    @Column(name = "ubicacion")
    private String ubicacion;


    public Long getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Long idInventario) {
        this.idInventario = idInventario;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @OneToOne
    @JoinColumn(name = "id_producto")
    private Producto producto; // Cada inventario está asociado a un producto

}
