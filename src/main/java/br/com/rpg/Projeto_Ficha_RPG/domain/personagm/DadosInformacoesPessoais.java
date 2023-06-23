package br.com.rpg.Projeto_Ficha_RPG.domain.personagm;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record DadosInformacoesPessoais(

        @NotBlank
        String nome,
        @NotNull
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        //@JsonFormat(pattern = "dd/MM/yyyy")
        LocalDate dataDeNascimento,
        @NotBlank
        String genero,
        @NotNull
        Integer altura,
        @NotNull
        Integer peso,
        @NotBlank
        String etnia,
        @NotBlank
        String corCabelo,
        @NotBlank
        String corOlho,
        @NotBlank
        String tipoSanguineo,
        @NotBlank
        String nacionalidade) {
}
