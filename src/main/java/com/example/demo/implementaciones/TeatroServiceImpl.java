package com.example.demo.implementaciones;
import org.springframework.stereotype.Service;
import com.example.demo.entidades.Teatro;
import com.example.demo.repositorios.TeatroRepository;
import com.example.demo.servicios.TeatroService;

import java.util.List;

@Service
public class TeatroServiceImpl implements TeatroService {

    private final TeatroRepository teatroRepository;

    public TeatroServiceImpl(TeatroRepository teatroRepository) {
        this.teatroRepository = teatroRepository;
    }

    @Override
    public List<Teatro> obtenerTodosLosTeatros() {
        return teatroRepository.findAll();
    }
}
