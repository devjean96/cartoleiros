package br.com.devjean.cartoleiros.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devjean.cartoleiros.dto.CompeticaoDTO;
import br.com.devjean.cartoleiros.service.CompeticaoService;

@RestController
@RequestMapping(value = "/competicoes")
public class CompeticaoController {
	
	@Autowired
	private CompeticaoService service;
	
	@GetMapping
	public Page<CompeticaoDTO> findAll(Pageable pageble){
		return service.findAll(pageble);
	}

}
