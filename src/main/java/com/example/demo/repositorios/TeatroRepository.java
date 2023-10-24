package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entidades.Teatro;

@Repository
public interface TeatroRepository extends JpaRepository<Teatro, Long> {
}
