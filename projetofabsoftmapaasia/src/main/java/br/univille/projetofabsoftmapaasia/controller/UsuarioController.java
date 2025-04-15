package br.univille.projetofabsoftmapaasia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.projetofabsoftmapaasia.entity.Usuario;
import br.univille.projetofabsoftmapaasia.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<Usuario>> getUsuarios(){
        
        var listaUsuarios = service.getAll();

        return new ResponseEntity<List<Usuario>>(listaUsuarios, HttpStatus.OK);
    }
    //salvar um objeto novo no banco
    @PostMapping
    public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario usuario){
        if(usuario == null){
            return ResponseEntity.badRequest().build();
        }
    }

}
