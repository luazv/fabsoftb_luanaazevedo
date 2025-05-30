package br.univille.projetofabsoftmapaasia.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Igreja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String origem;
    private String significado;

    @ManyToMany
    private List<Parabola> parabolas; // Associação com Parabola

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
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getSignificado() {
        return significado;
    }
    public void setSignificado(String significado) {
        this.significado = significado;
    }
    public List<Parabola> getParabolas() {
        return parabolas;
    }
    public void setParabolas(List<Parabola> parabolas) {
        this.parabolas = parabolas;
    }
}