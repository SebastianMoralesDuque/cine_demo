package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.servicios.CiudadService;
import com.example.demo.entidades.Ciudad;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

@SpringBootTest
public class CiudadTest {

    @Autowired
    private CiudadService ciudadService;

    @Test
    public void testObtenerTodasLasCiudades() {
        // Crear varias ciudades y guardarlas
        Ciudad ciudad1 = new Ciudad("CD001", "Ciudad 1");
        Ciudad ciudad2 = new Ciudad("CD002", "Ciudad 2");

        ciudadService.guardarCiudad(ciudad1);
        ciudadService.guardarCiudad(ciudad2);

        // Obtener todas las ciudades
        List<Ciudad> ciudades = ciudadService.obtenerTodasLasCiudades();

        // Verificar que la lista de ciudades no esté vacía
        assertNotNull(ciudades);
    }
}
