package br.com.devjean.cartoleiros.controllers;

import java.util.Optional;

import br.com.devjean.cartoleiros.dto.request.EquipeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.devjean.cartoleiros.dto.EquipeDTO;
import br.com.devjean.cartoleiros.service.EquipeService;

import javax.validation.Valid;

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

	@PostMapping
	public EquipeDTO saveEquipe(@Valid @RequestBody EquipeRequest equipeRequest){
		return service.saveEquipe(equipeRequest);
	}

}
