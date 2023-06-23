package br.com.rpg.Projeto_Ficha_RPG.domain.poderes;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.Estilo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "poderes_paranormais")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class PoderesParanormais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private String requerimento;
    private Estilo estilo;
}
