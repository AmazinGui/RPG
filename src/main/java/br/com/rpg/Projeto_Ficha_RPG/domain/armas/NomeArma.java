package br.com.rpg.Projeto_Ficha_RPG.domain.armas;

import jakarta.validation.constraints.NotBlank;

public record NomeArma(
        @NotBlank
        String nome
) {
}
