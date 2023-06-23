package br.com.rpg.Projeto_Ficha_RPG.domain.personagm;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.Patente;

public record DadosListagemPersonagem(
        String idAgente,
        String codinome,
        String ocupacao,
        String regiao,
        Boolean status,
        Patente patente,
        String nivel) {

    public DadosListagemPersonagem(Personagem personagem) {
        this(
                personagem.getInformacoesAgente().getIdAgente(),
                personagem.getInformacoesAgente().getCodinome(),
                personagem.getInformacoesAgente().getOcupacao(),
                personagem.getInformacoesAgente().getRegiao(),
                personagem.getInformacoesAgente().getStatus(),
                personagem.getInformacoesAgente().getPatente(),
                personagem.getInformacoesAgente().getNivel()
        );
    }
}
