package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(length = 8)
    private String codiUsua;

    @Column(length = 45)
    private String logiUsua;

    @Column(length = 45)
    private String passUsua;

    // GETTERS Y SETTERS

    public String getCodiUsua() { return codiUsua; }
    public void setCodiUsua(String codiUsua) { this.codiUsua = codiUsua; }

    public String getLogiUsua() { return logiUsua; }
    public void setLogiUsua(String logiUsua) { this.logiUsua = logiUsua; }

    public String getPassUsua() { return passUsua; }
    public void setPassUsua(String passUsua) { this.passUsua = passUsua; }
}