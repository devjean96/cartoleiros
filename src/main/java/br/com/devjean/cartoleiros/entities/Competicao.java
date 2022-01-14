package br.com.devjean.cartoleiros.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_competicao")
public class Competicao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	@NotNull
	private String nome;
	
	@Column(name = "trofeu")
	private String trofeu;
	
	@Column(name = "peso")
	@NotNull
	private Integer peso;
	
	public Competicao() {
	}
	
	
	public Competicao(Long id, @NotNull String nome, String trofeu, @NotNull Integer peso) {
		this.id = id;
		this.nome = nome;
		this.trofeu = trofeu;
		this.peso = peso;
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


	@Override
    public String toString() {
        return "Competição [id=" + id + ", nome=" + nome + ", trofeu=" + trofeu + ", peso=" + peso + "]";
 
    }

}
