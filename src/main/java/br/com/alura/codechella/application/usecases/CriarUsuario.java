package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.UsuarioRepository;
import br.com.alura.codechella.naousar.model.Usuario;

public class CriarUsuario {

    private UsuarioRepository repository;

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

}
