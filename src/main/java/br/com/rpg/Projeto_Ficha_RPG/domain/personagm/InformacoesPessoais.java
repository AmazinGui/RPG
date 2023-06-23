package br.com.rpg.Projeto_Ficha_RPG.domain.personagm;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class InformacoesPessoais {

    private String nome;
    private LocalDate dataDeNascimento;
    private String genero;
    private Integer altura;
    private Integer peso;
    private String etnia;
    private String corCabelo;
    private String corOlho;
    private String tipoSanguineo;
    private String nacionalidade;

    public InformacoesPessoais(DadosInformacoesPessoais dados) {
        this.nome = dados.nome();
        this.dataDeNascimento = dados.dataDeNascimento();
        this.genero = dados.genero();
        this.altura = dados.altura();
        this.peso = dados.peso();
        this.etnia = dados.etnia();
        this.corCabelo = dados.corCabelo();
        this.corOlho = dados.corOlho();
        this.tipoSanguineo = dados.tipoSanguineo();
        this.nacionalidade = dados.nacionalidade();
    }
}
