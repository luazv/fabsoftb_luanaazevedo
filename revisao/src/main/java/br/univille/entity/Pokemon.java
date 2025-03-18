package br.univille.entity;
//conceito fundamental em diagrama de classes
//muitos pra um
//um pra muitos 
public class Pokemon {
    private String nome;
    public Pokemon(String nome){
        this.nome = nome;

    }
    public String toString(){
        return this.nome;
    }
//um cliente pode ter varios pokemons, mas um pokemon
//tem apenas um cliente 
}
