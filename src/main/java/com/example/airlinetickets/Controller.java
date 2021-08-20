package com.example.airlinetickets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    VueloRepository vueloRepository;


    @GetMapping("/searchFlights")
    public ResponseEntity<List<Vuelo>> id(@RequestParam(required = false) String destino, @RequestParam(required = false) String fecha) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date;

        if (destino != null && fecha != null) {
            date = LocalDate.parse(fecha, format);
            List<Vuelo> found = vueloRepository.findAllByFechaAndDestino(date, destino);
            return new ResponseEntity<>(found, HttpStatus.ACCEPTED);
        } else if (destino != null) {
            List<Vuelo> found = vueloRepository.findAllByDestino(destino);
            return new ResponseEntity<>(found, HttpStatus.ACCEPTED);
        } else if (fecha != null) {
            date = LocalDate.parse(fecha, format);
            List<Vuelo> found = vueloRepository.findAllByFecha(date);
            return new ResponseEntity<>(found, HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(vueloRepository.findAll(), HttpStatus.ACCEPTED);
        }


    }
}

