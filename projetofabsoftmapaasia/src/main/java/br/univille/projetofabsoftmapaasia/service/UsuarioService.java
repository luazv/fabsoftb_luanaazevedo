package br.univille.projetofabsoftmapaasia.service;

import java.util.List;

import br.univille.projetofabsoftmapaasia.entity.Usuario;

public interface UsuarioService {
    Usuario save(Usuario usuarioAntigo);
    List<Usuario> getAll();
    Usuario getUsuarioById(Long id);
    Usuario delete (Long id);


}
