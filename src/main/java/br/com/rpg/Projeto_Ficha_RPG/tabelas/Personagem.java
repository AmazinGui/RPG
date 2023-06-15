package br.com.rpg.Projeto_Ficha_RPG.tabelas;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "personagens")
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "arma_id")
    private List<Armas> armas;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "poderes_aprimorados_id")
    private List<PoderesAprimorados> poderesAprimorados;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "poderes_paranormais_id")
    private List<PoderesParanormais> poderesParanormais;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "rituais_id")
    private List<Rituais> rituais;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Armas> getArmas() {
        return armas;
    }

    public void setArmas(List<Armas> armas) {
        this.armas = armas;
    }

    public List<PoderesAprimorados> getPoderesAprimorados() {
        return poderesAprimorados;
    }

    public void setPoderesAprimorados(List<PoderesAprimorados> poderesAprimorados) {
        this.poderesAprimorados = poderesAprimorados;
    }

    public List<PoderesParanormais> getPoderesParanormais() {
        return poderesParanormais;
    }

    public void setPoderesParanormais(List<PoderesParanormais> poderesParanormais) {
        this.poderesParanormais = poderesParanormais;
    }

    public List<Rituais> getRituais() {
        return rituais;
    }

    public void setRituais(List<Rituais> rituais) {
        this.rituais = rituais;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", armas=" + armas +
                ", poderesAprimorados=" + poderesAprimorados +
                ", poderesParanormais=" + poderesParanormais +
                ", rituais=" + rituais +
                '}';
    }
}
