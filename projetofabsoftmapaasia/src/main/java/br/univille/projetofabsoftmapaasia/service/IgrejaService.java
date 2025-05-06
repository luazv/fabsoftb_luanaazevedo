package br.univille.projetofabsoftmapaasia.service;

import java.util.List;

import br.univille.projetofabsoftmapaasia.entity.Usuario;
import br.univille.projetofabsoftmapaasia.entity.Igreja; // Importação da classe Parabola

public interface IgrejaService {
    Igreja save(Igreja igrejaAntigo);
    List<Usuario> getAll();
    Igreja getUsuarioById(Long id);
    Igreja delete(Long id);
}