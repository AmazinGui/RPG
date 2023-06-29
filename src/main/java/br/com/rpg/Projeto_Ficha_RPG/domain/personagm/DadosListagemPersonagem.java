package br.com.rpg.Projeto_Ficha_RPG.domain.personagm;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.Nivel;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.Patente;
import br.com.rpg.Projeto_Ficha_RPG.domain.armas.Armas;

import java.util.List;

public record DadosListagemPersonagem(
        String idAgente,
        String codinome,
        String ocupacao,
        String regiao,
        Patente patente,
        Nivel nivel,
        List<Armas> armas
        ) {

    public DadosListagemPersonagem(Personagem personagem) {
        this(
                personagem.getInformacoesAgente().getIdAgente(),
                personagem.getInformacoesAgente().getCodinome(),
                personagem.getInformacoesAgente().getOcupacao(),
                personagem.getInformacoesAgente().getRegiao(),
                personagem.getInformacoesAgente().getPatente(),
                personagem.getInformacoesAgente().getNivel(),
                personagem.getArmas()
        );
    }
}
