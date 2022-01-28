package br.com.devjean.cartoleiros.dto;

import br.com.devjean.cartoleiros.entities.Competicao;

public class CompeticaoDTO {

	private Long id;
	private String nome;
	private String trofeu;
	private Integer peso;
	
	public CompeticaoDTO() {
	}
	
	
	public CompeticaoDTO(Competicao competicao) {
		this.id = competicao.getId();
		this.nome = competicao.getNome();
		this.trofeu = competicao.getTrofeu();
		this.peso = competicao.getPeso();
	}
	
	public Long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTrofeu() {
		return trofeu;
	}


	public void setTrofeu(String trofeu) {
		this.trofeu = trofeu;
	}


	public Integer getPeso() {
		return peso;
	}


	public void setPeso(Integer peso) {
		this.peso = peso;
	}


}

