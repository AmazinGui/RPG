package br.com.rpg.Projeto_Ficha_RPG.tabelas;

import jakarta.persistence.*;

@Entity
@Table(name = "Tabela_de_nivel")
public class NEX {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer nex;
    private Integer pontos;
    private String melhoria;
    private String pv;
    private String mental;
    private String ocultismo;
    private Integer sanidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNex() {
        return nex;
    }

    public void setNex(Integer nex) {
        this.nex = nex;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public String getMelhoria() {
        return melhoria;
    }

    public void setMelhoria(String melhoria) {
        this.melhoria = melhoria;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public String getMental() {
        return mental;
    }

    public void setMental(String mental) {
        this.mental = mental;
    }

    public String getOcultismo() {
        return ocultismo;
    }

    public void setOcultismo(String ocultismo) {
        this.ocultismo = ocultismo;
    }

    public Integer getSanidade() {
        return sanidade;
    }

    public void setSanidade(Integer sanidade) {
        this.sanidade = sanidade;
    }

    @Override
    public String toString() {
        return "NEX{" +
                "id=" + id +
                ", nex=" + nex +
                ", pontos=" + pontos +
                ", melhoria='" + melhoria + '\'' +
                ", pv='" + pv + '\'' +
                ", mental='" + mental + '\'' +
                ", ocultismo='" + ocultismo + '\'' +
                ", sanidade=" + sanidade +
                '}';
    }
}
