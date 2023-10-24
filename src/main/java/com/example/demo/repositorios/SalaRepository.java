package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entidades.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {
}
