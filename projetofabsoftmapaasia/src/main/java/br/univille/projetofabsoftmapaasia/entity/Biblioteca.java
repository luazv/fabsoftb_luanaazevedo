package br.univille.projetofabsoftmapaasia.entity;

import java.util.List;

public class Biblioteca {
    private long id;
    private String nome;
    private List<String> materiais;

    // Getters and Setters
    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<String> getMateriais() {
        return materiais;
    }
    public void setMateriais(List<String> materiais) {
        this.materiais = materiais;
    }
}