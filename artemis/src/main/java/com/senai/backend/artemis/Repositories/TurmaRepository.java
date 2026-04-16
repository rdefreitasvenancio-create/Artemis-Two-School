package com.senai.backend.artemis.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.artemis.Models.Turma;
@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer>{
    
}
