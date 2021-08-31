package com.example.airlinetickets;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;


public class Vuelo {

    private String numeroDeVuelo;
    private String destino;
    private Integer capacidad;
    private LocalDate fecha;

    @OneToMany(mappedBy = "vuelo", fetch = FetchType.EAGER)
    private List<Pasajero> pasajeros;

    public Vuelo(){}
    public Vuelo(String numeroDeVuelo, String destino, Integer capacidad, LocalDate fecha) {
        this.numeroDeVuelo = numeroDeVuelo;
        this.destino = destino;
        this.capacidad = capacidad;
        this.fecha = fecha;
    }

    public Vuelo(String numeroDeVuelo, String destino, Integer capacidad, LocalDate fecha, List<Pasajero> pasajeros) {
        this.numeroDeVuelo = numeroDeVuelo;
        this.destino = destino;
        this.capacidad = capacidad;
        this.fecha = fecha;
        this.pasajeros = pasajeros;
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

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
}
