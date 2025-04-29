package br.univille.projetofabsoftmapaasia.entity;

import java.util.List;

public class Mapa {
    private long id;
    private String nome;
    private List<Igreja> igrejas;

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
    public List<Igreja> getIgrejas() {
        return igrejas;
    }
    public void setIgrejas(List<Igreja> igrejas) {
        this.igrejas = igrejas;
    }
}