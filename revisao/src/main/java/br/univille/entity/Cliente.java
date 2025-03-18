package br.univille.entity;

import java.util.ArrayList;

public class Cliente {
    //variável - atributo
    private long id;
    private String nome; //ctrl ponto
    private String endereco;

    private ArrayList listapokemon;

    private Cidade cidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //ctor - cria um método - construtor
    //inicializar atrubutos
    //obrigar a passagem de valores
    public Cliente(String nome) {
        this.nome = nome;
    }
    
    //polimorfismo - várias formas de existir a mesma coisa (torna opcional)
    public Cliente() {
        
    }

    //método
    //sobreescrita
    @Override
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
    //Encapsulamento = esconder a implementação do objeto

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public ArrayList getListapokemon() {
        return listapokemon;
    }

    public void setListapokemon(ArrayList listapokemon) {
        this.listapokemon = listapokemon;
    }
}

//classe é uma forma para criar coisas - podemos modar como queremos