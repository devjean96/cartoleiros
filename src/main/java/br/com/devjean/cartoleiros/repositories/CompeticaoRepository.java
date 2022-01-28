package br.com.devjean.cartoleiros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devjean.cartoleiros.entities.Competicao;

public interface CompeticaoRepository extends JpaRepository<Competicao, Long> {
	
	
}
