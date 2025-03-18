package br.univille;


public class Cliente {
    public Cliente(String nome) {

        this.nome = nome;
    }
    //variável - atributo
    private String nome;
    //polimorfismo - várias formas de existir a mesma coisa
    public Cliente() {

    }

    public String toString(){
        return getNome();
    }
    //método
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //encapsulamento = esconder a 
    //implementação dentro do objeto

}