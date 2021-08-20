package com.example.airlinetickets;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
public class Vuelo {
    @Id
    private String numeroDeVuelo;

    private String destino;
    private Integer capacidad;
    private LocalDate fecha;

    public Vuelo(){}
    public Vuelo(String numeroDeVuelo, String destino, Integer capacidad, LocalDate fecha) {
        this.numeroDeVuelo = numeroDeVuelo;
        this.destino = destino;
        this.capacidad = capacidad;
        this.fecha = fecha;
    }
    public Vuelo(String destino, Integer capacidad, LocalDate fecha) {
        this.destino = destino;
        this.fecha = fecha;
    }

    public String getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public void setNumeroDeVuelo(String numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
