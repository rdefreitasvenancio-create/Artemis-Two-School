package com.senai.backend.artemis.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id") 
    private int id;
    
    
    @Column(name = "nome") 
    private String nome;
    
    
    @Column(name = "data_nascimento") 
    private int dataNascimento;
    
    
    @Column(name = "email") 
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

    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
