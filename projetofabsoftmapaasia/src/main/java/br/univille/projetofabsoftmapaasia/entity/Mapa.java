package br.univille.projetofabsoftmapaasia.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Mapa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    @ManyToMany
    private List<Igreja> igrejas; // Associação com Igrejas

    @ManyToMany
    private List<Parabola> parabolas; // Associação com Parabolas

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
    public List<Parabola> getParabolas() {
        return parabolas;
    }
    public void setParabolas(List<Parabola> parabolas) {
        this.parabolas = parabolas;
    }
}