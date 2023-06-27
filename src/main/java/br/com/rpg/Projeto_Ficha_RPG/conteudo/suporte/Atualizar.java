package br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte;

import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.DadosPersonagem;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.Personagem;
import jakarta.persistence.Entity;

@Entity
public class Atualizar extends Personagem {

    public void atualizar(DadosPersonagem dados, Personagem personagem) {
        if (dados.informacoesPessoais().nome() != null) {
            personagem.getInformacoesPessoais().setNome(dados.informacoesPessoais().nome());
        }
        if (dados.informacoesPessoais().dataDeNascimento() != null) {
            personagem.getInformacoesPessoais().setDataDeNascimento(dados.informacoesPessoais().dataDeNascimento());
        }
        if (dados.informacoesPessoais().genero() != null) {
            personagem.getInformacoesPessoais().setGenero(dados.informacoesPessoais().genero());
        }
        if (dados.informacoesPessoais().altura() != null) {
            personagem.getInformacoesPessoais().setAltura(dados.informacoesPessoais().altura());
        }
        if (dados.informacoesPessoais().peso() != null) {
            personagem.getInformacoesPessoais().setPeso(dados.informacoesPessoais().peso());
        }
        if (dados.informacoesPessoais().etnia() != null) {
            personagem.getInformacoesPessoais().setEtnia(dados.informacoesPessoais().etnia());
        }
        if (dados.informacoesPessoais().corCabelo() != null) {
            personagem.getInformacoesPessoais().setCorCabelo(dados.informacoesPessoais().corCabelo());
        }
        if (dados.informacoesPessoais().corOlho() != null) {
            personagem.getInformacoesPessoais().setCorOlho(dados.informacoesPessoais().corOlho());
        }
        if (dados.informacoesPessoais().tipoSanguineo() != null) {
            personagem.getInformacoesPessoais().setTipoSanguineo(dados.informacoesPessoais().tipoSanguineo());
        }
        if (dados.informacoesPessoais().nacionalidade() != null) {
            personagem.getInformacoesPessoais().setNacionalidade(dados.informacoesPessoais().nacionalidade());
        }
        if (dados.informacoesAgente().codinome() != null) {
            personagem.getInformacoesAgente().setCodinome(dados.informacoesAgente().codinome());
        }
        if (dados.informacoesAgente().ocupacao() != null) {
            personagem.getInformacoesAgente().setOcupacao(dados.informacoesAgente().ocupacao());
        }
        if (dados.informacoesAgente().origem() != null) {
            personagem.getInformacoesAgente().setOrigem(dados.informacoesAgente().origem());
        }
        if (dados.informacoesAgente().idAgente() != null) {
            personagem.getInformacoesAgente().setIdAgente(dados.informacoesAgente().idAgente());
        }
        if (dados.informacoesAgente().regiao() != null) {
            personagem.getInformacoesAgente().setRegiao(dados.informacoesAgente().regiao());
        }
        if (dados.informacoesAgente().status() != null) {
            personagem.getInformacoesAgente().setStatus(dados.informacoesAgente().status());
        }
        if (dados.informacoesAgente().patente() != null) {
            personagem.getInformacoesAgente().setPatente(dados.informacoesAgente().patente());
        }
        if (dados.informacoesAgente().nivel() != null) {
            personagem.getInformacoesAgente().setNivel(dados.informacoesAgente().nivel());
        }
    }
}
