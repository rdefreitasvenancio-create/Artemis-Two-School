package com.senai.backend.artemis.Models;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "alunos")
public class Aluno {
    private int id;
    private String nome;
    private int dataNascimento;
    private String email;


    public Aluno(int id, String nome, int dataNascimento, String email) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }
    public Aluno() {
    }
    public int getId() {
        return id;
    }
    @Id
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    @Column
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Column
    public int getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    @Column
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
