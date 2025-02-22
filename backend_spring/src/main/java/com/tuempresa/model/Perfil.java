package com.tuempresa.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "perfiles")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uid;

    private String nombre;
    private int edad;
    private String tarjetaCredito;
    private String caducidad;
    private String cvv;

    // Constructor vacío
    public Perfil() {
    }

    // Constructor con parámetros
    public Perfil(String nombre, int edad, String tarjetaCredito, String caducidad, String cvv) {
        this.nombre = nombre;
        this.edad = edad;
        this.tarjetaCredito = tarjetaCredito;
        this.caducidad = caducidad;
        this.cvv = cvv;
    }

    // Getters y Setters
    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
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

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
