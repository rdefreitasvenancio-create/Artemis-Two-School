package com.senai.backend.artemis.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.artemis.Models.Aluno;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

    
}
    

    

