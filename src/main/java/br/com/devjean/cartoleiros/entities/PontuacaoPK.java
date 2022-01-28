package br.com.devjean.cartoleiros.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class PontuacaoPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@ManyToOne
	@JoinColumn(name = "equipe_id")
	private Equipe equipe;
	
	@ManyToOne
	@JoinColumn(name = "competicao_id")
	private Competicao competicao;


	public PontuacaoPK() {
	}


	public Equipe getEquipe() {
		return equipe;
	}


	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}


	public Competicao getCompeticao() {
		return competicao;
	}


	public void setCompeticao(Competicao competicao) {
		this.competicao = competicao;
	}
	
}
