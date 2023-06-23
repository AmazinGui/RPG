package br.com.rpg.Projeto_Ficha_RPG.domain.personagm;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.Patente;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class InformacoesAgente {

    private String codinome;
    private String ocupacao;
    private String origem;
    private String idAgente;
    private String regiao;
    private Boolean status;
    private Patente patente;
    private String nivel;

    public InformacoesAgente(DadosInformacoesAgente dados) {
        this.codinome = dados.codinome();
        this.ocupacao = dados.ocupacao();
        this.origem = dados.origem();
        this.idAgente = dados.idAgente();
        this.regiao = dados.regiao();
        this.status = dados.status();
        this.patente = dados.patente();
        this.nivel = dados.nivel();
    }
}
