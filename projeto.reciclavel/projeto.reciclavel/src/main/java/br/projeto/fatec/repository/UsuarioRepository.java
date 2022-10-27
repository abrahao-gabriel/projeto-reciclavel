package br.projeto.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.projeto.fatec.model.UsuarioObj;

public interface UsuarioRepository extends JpaRepository<UsuarioObj, Long>{

}
