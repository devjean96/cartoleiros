package br.com.devjean.cartoleiros.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devjean.cartoleiros.dto.EquipeDTO;
import br.com.devjean.cartoleiros.service.EquipeService;

@RestController
@RequestMapping(value = "/equipes")
public class EquipeController {
	
	@Autowired
	private EquipeService service;
	
	@GetMapping
	public Page<EquipeDTO> findAll(Pageable pageble){
		return service.findAll(pageble);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<EquipeDTO> findById(@PathVariable Long id){
		Optional<EquipeDTO> equipe = service.findById(id);
		
		if (equipe.isPresent()) {
            return new ResponseEntity<>(equipe.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
	}

}
