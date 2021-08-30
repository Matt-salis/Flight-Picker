package com.example.airlinetickets;

import javax.persistence.*;

@Entity
public class Pasajero {

    @Id
    private Integer dni;

    private String nombre;

    private String apellido;

//    Establezco una relacion con la entidad de Vuelo

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="pasajeros")
    private Vuelo vuelo;

    public Pasajero(){}

    public Pasajero(Integer dni, String nombre, String apellido, Vuelo vuelo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.vuelo = vuelo;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
}
