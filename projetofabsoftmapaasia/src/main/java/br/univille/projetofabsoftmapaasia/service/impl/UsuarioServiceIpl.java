package br.univille.projetofabsoftmapaasia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoftmapaasia.entity.Usuario;
import br.univille.projetofabsoftmapaasia.repository.UsuarioRepository;
import br.univille.projetofabsoftmapaasia.service.UsuarioService;

public class UsuarioServiceIpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public Usuario save(Usuario usuario) {
        repository.save(usuario);
        return usuario;
        
    }

    @Override
    public List<Usuario> getAll() {
        return repository.findAll();
    }

    @Override
    public Usuario getUsuarioById(Long id) {
        return repository.getById(id);
    }

    @Override
    public Usuario delete(Long id) {
        var usuario = getById(id);
        if (usuario != null) {
            repository.deleteById(id);
        return null;
        }
    }

}
