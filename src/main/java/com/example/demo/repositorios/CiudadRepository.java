package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Ciudad;;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, String> {
}
