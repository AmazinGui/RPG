package br.com.rpg.Projeto_Ficha_RPG.domain.personagm;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.Nivel;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.Patente;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.validator.constraints.NotBlank;

public record DadosInformacoesAgente(

        @NotBlank
        String codinome,
        @NotBlank
         String ocupacao,
        @NotBlank
        String origem,
        @NotBlank
        String idAgente,
        @NotBlank
        String regiao,
        @NotNull
        Boolean status,
        @NotNull
        Patente patente,
        @NotNull
        Nivel nivel) {
}
