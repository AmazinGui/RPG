package br.com.rpg.Projeto_Ficha_RPG.conteudo;

public class Ficha {

    private int PV;
    private int SAN;

    public int calcularPV(int tamanho, int cons, int nex) {
        return this.PV = ((tamanho + cons) / 10) + NEX.adicionarPV(cons, nex);
    }

    public int calcularSAN(int poder) {
        if (poder >= 70) {
            return this.SAN = 90;
        }
        return this.SAN = poder + 20;
    }
}