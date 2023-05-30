package br.com.rpg.Projeto_Ficha_RPG.tabelas;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Elementos;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Estilo;
import jakarta.persistence.*;

@Entity
@Table(name = "Poderes_Elementais")
public class PoderesParanormaisElementais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String poder;
    private String descricao;
    private Integer requerimento;
    private Estilo estilo;
    private Elementos elemento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getRequerimento() {
        return requerimento;
    }

    public void setRequerimento(Integer requerimento) {
        this.requerimento = requerimento;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public Elementos getElemento() {
        return elemento;
    }

    public void setElemento(Elementos elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "PoderesParanormaisElementais{" +
                "id=" + id +
                ", poder='" + poder + '\'' +
                ", descricao='" + descricao + '\'' +
                ", requerimento=" + requerimento +
                ", estilo=" + estilo +
                ", elemento=" + elemento +
                '}';
    }
}
