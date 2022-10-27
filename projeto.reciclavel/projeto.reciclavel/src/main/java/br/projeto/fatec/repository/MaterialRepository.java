package br.projeto.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.projeto.fatec.model.MaterialObj;

@Repository
public interface MaterialRepository extends JpaRepository<MaterialObj, Long>{

}
