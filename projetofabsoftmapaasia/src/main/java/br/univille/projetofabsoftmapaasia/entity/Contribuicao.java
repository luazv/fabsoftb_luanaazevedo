package br.univille.projetofabsoftmapaasia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Contribuicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String conteudo;

    @ManyToOne
    private Usuario usuario; // Associação com Usuario (quem fez a contribuição)

    @ManyToOne
    private Parabola parabola; // Associação com Parabola (relacionada à contribuição)

    // Getters and Setters
    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Parabola getParabola() {
        return parabola;
    }
    public void setParabola(Parabola parabola) {
        this.parabola = parabola;
    }
}