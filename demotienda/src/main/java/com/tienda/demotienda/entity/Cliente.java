package com.tienda.demotienda.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "idCliente")
    private Long idCliente;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "email")
    private String email;
    @Column (name = "direccion")
    private String direccion;


    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;  // Referencia a la entidad Usuario
}
