package br.univille.projetofabsoftmapaasia.entity;

public class Resumo {
    private long id;
    private String conteudo;
    private Igreja igreja;

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
    public Igreja getIgreja() {
        return igreja;
    }
    public void setIgreja(Igreja igreja) {
        this.igreja = igreja;
    }
}