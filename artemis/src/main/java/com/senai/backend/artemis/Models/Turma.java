package com.senai.backend.artemis.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Turma {
    @OneToMany(mappedBy = "turma")

    @Id
    private int id;

    @Column
    private String nome;

    @Column
    private List<Aluno> alunos;

    public Turma() {
    }

    public Turma(int id, String nome, List alunos) {
        this.id = id;
        this.nome = nome;
        this.alunos = alunos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List getAlunos() {
        return alunos;
    }

    public void setAlunos(List alunos) {
        this.alunos = alunos;
    }
    
    
}
