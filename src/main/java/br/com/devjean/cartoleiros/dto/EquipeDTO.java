package br.com.devjean.cartoleiros.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class EquipeDTO {
	
	private Long id;
	@NonNull private String nome;
	@NonNull private String treinador;
	private String escudo;

}
