package br.com.devjean.cartoleiros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devjean.cartoleiros.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long>{
	
	Equipe findByNome(String nome);
	Equipe findByTreinador(String treinador);
	
}
