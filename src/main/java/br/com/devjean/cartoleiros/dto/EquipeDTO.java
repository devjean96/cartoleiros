package br.com.devjean.cartoleiros.dto;

import br.com.devjean.cartoleiros.entities.Equipe;


public class EquipeDTO {
	
	private Long id;
	private String nome;
	private String treinador;
	private String escudo;
	
	public EquipeDTO() {
		
	}
	
	public EquipeDTO(Equipe equipe) {
		this.id = equipe.getId();
		this.nome = equipe.getNome();
		this.treinador = equipe.getTreinador();
		this.escudo = equipe.getEscudo();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTreinador() {
		return treinador;
	}

	public void setTreinador(String treinador) {
		this.treinador = treinador;
	}

	public String getEscudo() {
		return escudo;
	}

	public void setEscudo(String escudo) {
		this.escudo = escudo;
	}
	
}
