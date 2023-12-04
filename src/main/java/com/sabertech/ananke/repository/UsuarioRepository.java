package com.sabertech.ananke.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sabertech.ananke.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
