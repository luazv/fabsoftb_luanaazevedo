package br.univille.projetofabsoftmapaasia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoftmapaasia.entity.Usuario;
import br.univille.projetofabsoftmapaasia.repository.UsuarioRepository;
import br.univille.projetofabsoftmapaasia.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

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
        var retorno = repository.findById(id);
        if (retorno.isPresent()) {
            return retorno.get();
        } else {
            return null;
        }
    }

    @Override
    public Usuario delete(Long id) {
        var usuario = getUsuarioById(id);
        if (usuario != null) {
            repository.deleteById(id);
        }
        return usuario;
    }

    

}
