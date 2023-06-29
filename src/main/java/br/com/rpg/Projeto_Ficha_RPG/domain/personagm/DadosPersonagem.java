package br.com.rpg.Projeto_Ficha_RPG.domain.personagm;

import br.com.rpg.Projeto_Ficha_RPG.domain.armas.Armas;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record DadosPersonagem(
    @NotNull @Valid
    DadosInformacoesPessoais informacoesPessoais,
    @NotNull @Valid
    DadosInformacoesAgente informacoesAgente,
    List<String> armas
) {
}
