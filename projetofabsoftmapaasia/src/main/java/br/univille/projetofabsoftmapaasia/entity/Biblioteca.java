package br.univille.projetofabsoftmapaasia.entity;

import java.util.List;

public class Biblioteca {
    private Long id;
    private String nome;
    private List<String> materiais;

    // Getters and Setters
    public Long getId() {
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