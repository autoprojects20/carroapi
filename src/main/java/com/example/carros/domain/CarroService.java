package com.example.carros.domain;

import java.util.ArrayList;
import java.util.List;

public class CarroService {
    public List<Carro> getCarros() {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro( 1L, "23/06/2021", "Grande Nigeria",
                "76", "0", "SPRINTER 314 CDI STREET 21/22", "29176204" ));
        carros.add(new Carro( 2L, "24/06/2021", "Grande Nigeria",
                "77", "2", "SPRINTER CAMPOS 22/23", "789821281408" ));
        carros.add(new Carro( 3L, "25/06/2021", "Grande Nigeria",
                "78", "3", "SPRINTER BERNARDO  22/24", "740617206937" ));

        return carros;
    }

}
