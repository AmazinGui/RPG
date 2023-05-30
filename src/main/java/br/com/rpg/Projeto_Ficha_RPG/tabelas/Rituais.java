package br.com.rpg.Projeto_Ficha_RPG.tabelas;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Alcance;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Elementos;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Execucao;
import jakarta.persistence.*;

@Entity
@Table
public class Rituais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ritual;
    private Elementos elemento;
    private Execucao execucao;
    private Alcance alcance;
    private String duracao;
    private String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRitual() {
        return ritual;
    }

    public void setRitual(String ritual) {
        this.ritual = ritual;
    }

    public Elementos getElemento() {
        return elemento;
    }

    public void setElemento(Elementos elemento) {
        this.elemento = elemento;
    }

    public Execucao getExecucao() {
        return execucao;
    }

    public void setExecucao(Execucao execucao) {
        this.execucao = execucao;
    }

    public Alcance getAlcance() {
        return alcance;
    }

    public void setAlcance(Alcance alcance) {
        this.alcance = alcance;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Rituais{" +
                "id=" + id +
                ", ritual='" + ritual + '\'' +
                ", elemento=" + elemento +
                ", execucao=" + execucao +
                ", alcance=" + alcance +
                ", duracao='" + duracao + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
