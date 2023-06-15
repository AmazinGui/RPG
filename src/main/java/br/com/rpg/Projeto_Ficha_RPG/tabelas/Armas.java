package br.com.rpg.Projeto_Ficha_RPG.tabelas;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Alcance;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.CategoriaDeArma;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.SubcategoriaDeArma;
import jakarta.persistence.*;

@Entity
@Table
@Embeddable
public class Armas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String arma;
    private CategoriaDeArma categoria;
    private SubcategoriaDeArma subcategoria;
    private Alcance alcance;
    private String municao;
    private String dano;
    private String detalhe;

    public Armas() {}

    public Armas(String arma) {
        this.arma = arma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public CategoriaDeArma getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDeArma categoria) {
        this.categoria = categoria;
    }

    public SubcategoriaDeArma getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(SubcategoriaDeArma subcategoria) {
        this.subcategoria = subcategoria;
    }

    public Alcance getAlcance() {
        return alcance;
    }

    public void setAlcance(Alcance alcance) {
        this.alcance = alcance;
    }

    public String getMunicao() {
        return municao;
    }

    public void setMunicao(String municao) {
        this.municao = municao;
    }

    public String getDano() {
        return dano;
    }

    public void setDano(String dano) {
        this.dano = dano;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    @Override
    public String toString() {
        return "Armas{" +
                "id=" + id +
                ", arma='" + arma + '\'' +
                ", categoria=" + categoria +
                ", subcategoria=" + subcategoria +
                ", alcance=" + alcance +
                ", municao='" + municao + '\'' +
                ", dano='" + dano + '\'' +
                ", detalhe='" + detalhe + '\'' +
                '}';
    }
}
