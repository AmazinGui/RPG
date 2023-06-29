package br.com.rpg.Projeto_Ficha_RPG.domain.personagm;

import br.com.rpg.Projeto_Ficha_RPG.domain.poderes.PoderesAprimorados;
import br.com.rpg.Projeto_Ficha_RPG.domain.poderes.PoderesParanormais;
import br.com.rpg.Projeto_Ficha_RPG.domain.rituais.Rituais;
import br.com.rpg.Projeto_Ficha_RPG.domain.armas.Armas;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "personagens")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Embedded
    private InformacoesAgente informacoesAgente;
    @Embedded
    private InformacoesPessoais informacoesPessoais;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "personagens_armas",
            joinColumns = @JoinColumn(name = "personagens_id"),
            inverseJoinColumns = @JoinColumn(name = "armas_id")
    )
    private List<Armas> armas;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "personagens_poderes_aprimorados",
            joinColumns = @JoinColumn(name = "personagens_id"),
            inverseJoinColumns = @JoinColumn(name = "poderes_aprimorados_id")
    )
    private List<PoderesAprimorados> poderesAprimorados;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "personagens_poderes_paranormais",
            joinColumns = @JoinColumn(name = "personagens_id"),
            inverseJoinColumns = @JoinColumn(name = "poderes_paranormais_id")
    )
    private List<PoderesParanormais> poderesParanormais;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "personagens_rituais",
            joinColumns = @JoinColumn(name = "personagens_id"),
            inverseJoinColumns = @JoinColumn(name = "rituais_id")
    )
    private List<Rituais> rituais;

    public Personagem(DadosPersonagem dados) {
        this.informacoesPessoais = new InformacoesPessoais(dados.informacoesPessoais());
        this.informacoesAgente = new InformacoesAgente(dados.informacoesAgente());
    }
}
