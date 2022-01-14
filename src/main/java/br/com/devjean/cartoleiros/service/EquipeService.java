package br.com.devjean.cartoleiros.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devjean.cartoleiros.dto.EquipeDTO;
import br.com.devjean.cartoleiros.entities.Equipe;
import br.com.devjean.cartoleiros.repositories.EquipeRepository;


@Service
public class EquipeService {
	
	@Autowired
	private EquipeRepository repository;
	
	@Transactional(readOnly = true)
	public Page<EquipeDTO> findAll(Pageable pageable){
		Page<Equipe> result = repository.findAll(pageable);
		Page<EquipeDTO> page = result.map(x -> new EquipeDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public Optional<EquipeDTO> findById(Long id){
		Optional<Equipe> equipe = repository.findById(id);
		if (equipe.isPresent())
			return Optional.of(new EquipeDTO(equipe.get()));
		else 
			return Optional.empty();
	}
	
	@Transactional(readOnly = true)
	public EquipeDTO findByNome(String nome) {
		Equipe equipe = repository.findByNome(nome);
		return new EquipeDTO(equipe);
	}
	
	@Transactional(readOnly = true)
	public EquipeDTO findByTreinador(String treinador) {
		Equipe equipe = repository.findByTreinador(treinador);
		return new EquipeDTO(equipe);
	}
}
