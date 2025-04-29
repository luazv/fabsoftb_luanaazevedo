package br.univille.projetofabsoftmapaasia.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private String senha;
    private String endereco; // Adicionado
    private String telefone; // Adicionado
    private LocalDate dataNascimento; // Adicionado

    // Getters and Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEndereco() { // Adicionado
        return endereco;
    }
    public void setEndereco(String endereco) { // Adicionado
        this.endereco = endereco;
    }
    public String getTelefone() { // Adicionado
        return telefone;
    }
    public void setTelefone(String telefone) { // Adicionado
        this.telefone = telefone;
    }
    public LocalDate getDataNascimento() { // Adicionado
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) { // Adicionado
        this.dataNascimento = dataNascimento;
    }
}