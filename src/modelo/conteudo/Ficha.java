package modelo.conteudo;

public class Ficha {

    private int PV;
    private int SAN;

    public int calcularPV(int forca, int cons, int nex) {
        return this.PV = ((forca + cons) / 10) + NEX.adicionarPV(cons, nex);
    }

    public int calcularSAN(int poder) {
        return this.SAN = poder + 20;
    }
}