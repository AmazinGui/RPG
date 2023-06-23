package br.com.rpg.Projeto_Ficha_RPG.domain.rituais;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.Alcance;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.Execucao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rituais")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Rituais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Execucao execucao;
    private Alcance alcance;
    private String duracao;
    private String descricao;
}
