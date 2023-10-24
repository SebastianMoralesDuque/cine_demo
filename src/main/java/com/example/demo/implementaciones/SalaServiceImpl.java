package com.example.demo.implementaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entidades.Sala;
import com.example.demo.repositorios.SalaRepository;
import com.example.demo.servicios.SalaService;

import java.util.List;

@Service
public class SalaServiceImpl implements SalaService {

    @Autowired
    private SalaRepository salaRepository;

    @Override
    public List<Sala> obtenerTodasLasSalas() {
        return salaRepository.findAll();
    }
}
