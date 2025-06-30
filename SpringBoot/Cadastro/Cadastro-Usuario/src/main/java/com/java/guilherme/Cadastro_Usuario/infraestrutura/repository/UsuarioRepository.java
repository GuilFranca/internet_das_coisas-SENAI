package com.java.guilherme.Cadastro_Usuario.infraestrutura.repository;

import com.java.guilherme.Cadastro_Usuario.infraestrutura.entites.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);

    void deletByEmail(String email);

    @Override
    Optional<Usuario> findById(Integer integer);

}
