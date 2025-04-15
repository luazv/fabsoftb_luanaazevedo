package br.univille.projetofabsoftmapaasia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.projetofabsoftmapaasia.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

    
}
