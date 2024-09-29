package br.com.alura.codechella.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UsuarioTest {

    @Test
    public void naoDeveAceitarUsuarioComCpfFormatoInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Usuario(0L, "12345678901", "nome qualquer", LocalDate.now(), "teste@teste.com"));
        assertThrows(IllegalArgumentException.class,
                () -> new Usuario(0L, null, "nome qualquer", LocalDate.now(), "teste@teste.com"));
    }

    @Test
    public void deveCriarUsuarioPelaFabrica() {
        UsuarioBuilder factory = new UsuarioBuilder();

        Usuario usuario = factory.comNomeCpfNascimento("Larissa", "123.456.789-01", LocalDate.of(2011, 1, 24));
        assertEquals(usuario.getNome(), "Larissa");

        usuario = factory.incluirEndereco("20.540-220", 346, "apto. 201");
        assertEquals(usuario.getEndereco().getNumero(), 346);
    }
}
