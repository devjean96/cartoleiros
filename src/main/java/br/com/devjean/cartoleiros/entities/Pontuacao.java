package br.com.devjean.cartoleiros.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pontuacao")
public class Pontuacao {
	
	@EmbeddedId
	private PontuacaoPK id = new PontuacaoPK();
	
	private Integer trofeus;

	public Pontuacao() {
	}
	
	public void setEquipe(Equipe equipe) {
		id.setEquipe(equipe);
	}
	
	public void setCompeticao(Competicao competicao){
		id.setCompeticao(competicao);
	}

	public PontuacaoPK getId() {
		return id;
	}

	public void setId(PontuacaoPK id) {
		this.id = id;
	}

	public Integer getTrofeus() {
		return trofeus;
	}

	public void setTrofeus(Integer trofeus) {
		this.trofeus = trofeus;
	}
	
	
}
