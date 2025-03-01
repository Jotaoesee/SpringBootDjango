package com.compuglobalhipermeganet.user_service.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int edad;
    private String tarjetaCredito;
    private String caducidad;
    private String cvv;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String gettarjetaCredito() {
        return tarjetaCredito;
    }

    public void settarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getcaducidad() {
        return caducidad;
    }

    public void setcaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String getcvv() {
        return cvv;
    }

    public void setccvv(String cvv) {
        this.cvv = cvv;
    }
}
