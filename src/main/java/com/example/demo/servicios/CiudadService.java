package com.example.demo.servicios;

import com.example.demo.entidades.Ciudad;
import java.util.List;

public interface CiudadService {
    List<Ciudad> obtenerTodasLasCiudades();
    Ciudad guardarCiudad(Ciudad ciudad);
}
