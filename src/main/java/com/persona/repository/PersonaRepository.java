package com.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
