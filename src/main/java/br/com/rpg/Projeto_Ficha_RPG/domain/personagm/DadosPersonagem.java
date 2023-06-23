package br.com.rpg.Projeto_Ficha_RPG.domain.personagm;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosPersonagem(
    @NotNull @Valid
    DadosInformacoesPessoais informacoesPessoais,
    @NotNull @Valid
    DadosInformacoesAgente informacoesAgente
) {
}
