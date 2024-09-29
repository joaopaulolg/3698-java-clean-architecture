package br.com.alura.codechella.domain;

import java.time.LocalDate;

public class UsuarioBuilder {
    private Usuario usuario;

    public Usuario comNomeCpfNascimento(String nome, String cpf, LocalDate nascimento) {
        this.usuario = new Usuario(0L, cpf, nome, nascimento, "");
        return this.usuario;
    }

    public Usuario incluirEndereco(String cep, Integer numero, String complemento) {
        this.usuario.setEndereco(new Endereco(cep, numero, complemento));
        return this.usuario;
    }

}
