package com.example.airlinetickets;

import org.springframework.data.jpa.repository.JpaRepository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface VueloRepository extends JpaRepository<Vuelo, String> {

    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    List<Vuelo> findAllByFechaAndDestino(LocalDate fecha, String destino);

    List<Vuelo> findAllByDestino(String destino);

    List<Vuelo> findAllByFecha(LocalDate fecha);
}
