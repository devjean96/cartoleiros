package br.com.devjean.cartoleiros.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_equipe")
public class Equipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	@NotNull
	private String nome;
	
	@Column(name = "treinador")
	@NotNull
	private String treinador;
	
	@Column(name = "escudo")
	private String escudo;
	
	public Equipe() {
	}
	
	public Equipe(Long id, @NotNull String nome, @NotNull String treinador, String escudo) {
		this.id = id;
		this.nome = nome;
		this.treinador = treinador;
		this.escudo = escudo;
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
	
	@Override
    public String toString() {
        return "Equipe [id=" + id + ", nome=" + nome + ", treinador=" + treinador + ", escudo=" + escudo + "]";
 
    }
	
}
