package br.com.devjean.cartoleiros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devjean.cartoleiros.dto.CompeticaoDTO;
import br.com.devjean.cartoleiros.entities.Competicao;
import br.com.devjean.cartoleiros.repositories.CompeticaoRepository;

@Service
public class CompeticaoService {
	
	@Autowired
	private CompeticaoRepository repository;
	
	@Transactional(readOnly = true)
	public Page<CompeticaoDTO> findAll(Pageable pageable){
		Page<Competicao> result = repository.findAll(pageable);
		Page<CompeticaoDTO> page = result.map(x -> new CompeticaoDTO(x));
		return page;
	}
}
