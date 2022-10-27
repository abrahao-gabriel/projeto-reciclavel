package br.projeto.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.projeto.fatec.model.CategoriaObj;

public interface CategoriaRepository extends JpaRepository<CategoriaObj, Long>{

}
