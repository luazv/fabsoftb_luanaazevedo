package br.univille.projetofabsoftmapaasia.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Parabola {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String texto;

    @ManyToOne
    private Usuario usuario; // Associação com Usuario (quem criou a parábola)

    @ManyToMany(mappedBy = "parabolas")
    private List<Igreja> igrejas; // Associação com Igrejas

    // Getters and Setters
    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public List<Igreja> getIgrejas() {
        return igrejas;
    }
    public void setIgrejas(List<Igreja> igrejas) {
        this.igrejas = igrejas;
    }
}