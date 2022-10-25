package br.com.devjean.cartoleiros.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class EquipeRequest {

    @NotBlank(message = "Nome da Equipe nao pode ser branco ou nulo")
    private String nome;
    @NotBlank(message = "Treinador nao pode ser branco ou nulo")
    private String treinador;
    private String escudo;
}
