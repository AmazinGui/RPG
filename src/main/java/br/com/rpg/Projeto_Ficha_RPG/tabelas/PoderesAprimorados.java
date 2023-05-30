package br.com.rpg.Projeto_Ficha_RPG.tabelas;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Estilo;
import jakarta.persistence.*;

@Entity
@Table(name = "Poderes_Aprimorados")
public class PoderesAprimorados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String poder;
    private String descricao;
    private String requerimento;
    private Estilo estilo;
    private Integer nex;

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

    public String getRequerimento() {
        return requerimento;
    }

    public void setRequerimento(String requerimento) {
        this.requerimento = requerimento;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public Integer getNex() {
        return nex;
    }

    public void setNex(Integer nex) {
        this.nex = nex;
    }

    @Override
    public String toString() {
        return "PoderesAprimorados{" +
                "id=" + id +
                ", poder='" + poder + '\'' +
                ", descricao='" + descricao + '\'' +
                ", requerimento='" + requerimento + '\'' +
                ", estilo='" + estilo + '\'' +
                ", nex=" + nex +
                '}';
    }
}
