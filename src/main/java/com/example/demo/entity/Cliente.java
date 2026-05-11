package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codiClie;

    @Column(length = 8)
    private String ndniClie;

    @Column(length = 45)
    private String appaClie;

    @Column(length = 45)
    private String apmaClie;

    @Column(length = 50)
    private String nombClie;

    @Temporal(TemporalType.DATE)
    private Date fechNaciClie;

    // GETTERS Y SETTERS

    public Integer getCodiClie() { return codiClie; }
    public void setCodiClie(Integer codiClie) { this.codiClie = codiClie; }

    public String getNdniClie() { return ndniClie; }
    public void setNdniClie(String ndniClie) { this.ndniClie = ndniClie; }

    public String getAppaClie() { return appaClie; }
    public void setAppaClie(String appaClie) { this.appaClie = appaClie; }

    public String getApmaClie() { return apmaClie; }
    public void setApmaClie(String apmaClie) { this.apmaClie = apmaClie; }

    public String getNombClie() { return nombClie; }
    public void setNombClie(String nombClie) { this.nombClie = nombClie; }

    public Date getFechNaciClie() { return fechNaciClie; }
    public void setFechNaciClie(Date fechNaciClie) { this.fechNaciClie = fechNaciClie; }
}