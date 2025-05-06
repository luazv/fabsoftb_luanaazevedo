package br.univille.projetofabsoftmapaasia.service;

import java.util.List;

import br.univille.projetofabsoftmapaasia.entity.Usuario;
import br.univille.projetofabsoftmapaasia.entity.Mapa; // Importação da classe Parabola

public interface MapaService {
    Usuario save(Mapa mapaAntigo);
    List<Usuario> getAll();
    Usuario getUsuarioById(Long id);
    Usuario delete(Long id);
}