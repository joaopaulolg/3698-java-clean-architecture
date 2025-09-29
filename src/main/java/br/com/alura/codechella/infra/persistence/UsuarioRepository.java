package br.com.alura.codechella.infra.persistence;

import br.com.alura.codechella.naousar.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
