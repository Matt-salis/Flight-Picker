package com.example.airlinetickets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


@SpringBootApplication
public class AirlineTicketsApplication {


    public static void main(String[] args) {
		SpringApplication.run(AirlineTicketsApplication.class, args);

        List<Vuelo> vuelos = new ArrayList<>();
        Vuelo vuelo1 = new Vuelo("B542", "Mendoza", 5, LocalDate.of(2021,9,02));
        Vuelo vuelo2 = new Vuelo("B545", "Mendoza", 4, LocalDate.of(2021,9,03));
        Vuelo vuelo3 = new Vuelo("B534", "Mendoza", 2, LocalDate.of(2021,9,04));
        Vuelo vuelo4 = new Vuelo("B577", "Mendoza", 2, LocalDate.of(2021,9,03));
        Vuelo vuelo5 = new Vuelo("B571", "Mendoza", 3, LocalDate.of(2021,9,02));
        Vuelo vuelo6 = new Vuelo("B511", "Mendoza", 1, LocalDate.of(2021,9,04));
        Vuelo vuelo7 = new Vuelo("B520", "Mendoza", 7, LocalDate.of(2021,9,02));
        Vuelo vuelo8 = new Vuelo("C633", "Tucuman", 5, LocalDate.of(2021,9,02));
        Vuelo vuelo9 = new Vuelo("C648", "Tucuman", 3, LocalDate.of(2021,9,02));
        Vuelo vuelo10 = new Vuelo("C639", "Tucuman", 8, LocalDate.of(2021,9,03));
        Vuelo vuelo11 = new Vuelo("C682", "Tucuman", 4, LocalDate.of(2021,9,03));
        Vuelo vuelo12 = new Vuelo("C677", "Tucuman", 5, LocalDate.of(2021,9,03));
        Vuelo vuelo13 = new Vuelo("C691", "Tucuman", 2, LocalDate.of(2021,9,04));
        Vuelo vuelo14 = new Vuelo("C616", "Tucuman", 6, LocalDate.of(2021,9,04));
        Vuelo vuelo15 = new Vuelo("C644", "Tucuman", 7, LocalDate.of(2021,9,04));
        Vuelo vuelo16 = new Vuelo("D855", "San Luis", 4, LocalDate.of(2021,9,02));
        Vuelo vuelo17 = new Vuelo("D812", "San Luis", 6, LocalDate.of(2021,9,02));
        Vuelo vuelo18 = new Vuelo("D842", "San Luis", 2, LocalDate.of(2021,9,02));
        Vuelo vuelo19 = new Vuelo("D864", "San Luis", 4, LocalDate.of(2021,9,03));
        Vuelo vuelo20 = new Vuelo("D866", "San Luis", 6, LocalDate.of(2021,9,03));
        Vuelo vuelo21 = new Vuelo("D884", "San Luis", 2, LocalDate.of(2021,9,03));
        Vuelo vuelo22 = new Vuelo("D854", "San Luis", 3, LocalDate.of(2021,9,04));
        Vuelo vuelo23 = new Vuelo("D832", "San Luis", 5, LocalDate.of(2021,9,04));
        Vuelo vuelo24 = new Vuelo("D874", "San Luis", 6, LocalDate.of(2021,9,04));
        vuelos.add(vuelo1);
        vuelos.add(vuelo2);
        vuelos.add(vuelo3);
        vuelos.add(vuelo4);
        vuelos.add(vuelo5);
        vuelos.add(vuelo6);
        vuelos.add(vuelo7);
        vuelos.add(vuelo8);
        vuelos.add(vuelo9);
        vuelos.add(vuelo10);
        vuelos.add(vuelo11);
        vuelos.add(vuelo12);
        vuelos.add(vuelo13);
        vuelos.add(vuelo14);
        vuelos.add(vuelo15);
        vuelos.add(vuelo16);
        vuelos.add(vuelo17);
        vuelos.add(vuelo18);
        vuelos.add(vuelo19);
        vuelos.add(vuelo20);
        vuelos.add(vuelo21);
        vuelos.add(vuelo22);
        vuelos.add(vuelo23);
        vuelos.add(vuelo24);

//      Ahora creo una lista de pasajeros que proximamente voy a asociar a un vuelo

        List<Pasajero> tripulacion1 = new ArrayList<>();
        tripulacion1.add(new Pasajero(23565849, "Pedro", "Picapiedra", vuelo1));
        tripulacion1.add(new Pasajero(48955651, "Nicolas", "Cage", vuelo1));
        tripulacion1.add(new Pasajero(54124474, "Clark", "Kent", vuelo1));
        tripulacion1.add(new Pasajero(14789889, "Roger", "Federer", vuelo1));



//        Actualizo el mensaje en consola
        System.out.println("< -- ------------------------------------ -- >");
        System.out.println("Lista de pasajeros del vuelo numero:");
        System.out.println("B542");


//       Imprimendo en consola se puede apreciar que ya tienen una relacion entre ambas entidades pudiendo asi un pasajero acceder a las propiedades de su vuelo y viceversa

        tripulacion1.forEach(x -> System.out.println(x.getNombre() +" "+ x.getApellido() +" "+ x.getDni() +" N de vuelo: " +x.getVuelo().getNumeroDeVuelo() ));


    }

}

