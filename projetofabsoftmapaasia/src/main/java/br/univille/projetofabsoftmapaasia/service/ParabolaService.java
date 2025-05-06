package br.univille.projetofabsoftmapaasia.service;

import java.util.List;

import br.univille.projetofabsoftmapaasia.entity.Usuario;
import br.univille.projetofabsoftmapaasia.entity.Parabola; // Importação da classe Parabola

public interface ParabolaService {
    Usuario save(Parabola parabolaAntigo);
    List<Usuario> getAll();
    Usuario getUsuarioById(Long id);
    Usuario delete(Long id);
}