package br.univille.projetofabsoftmapaasia.service;

import java.util.List;

import br.univille.projetofabsoftmapaasia.entity.Usuario;
import br.univille.projetofabsoftmapaasia.entity.Igreja; // Importação da classe Parabola

public interface IgrejaService {
    Usuario save(Igreja igrejaAntigo);
    List<Usuario> getAll();
    Usuario getUsuarioById(Long id);
    Usuario delete(Long id);
}