package br.com.rpg.Projeto_Ficha_RPG.domain.armas;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.Alcance;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.CategoriaDeArma;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.SubcategoriaDeArma;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "armas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Armas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String nome;
    private CategoriaDeArma categoria;
    private SubcategoriaDeArma subcategoria;
    private Alcance alcance;
    private String municao;
    private String dano;
    private String detalhe;
}