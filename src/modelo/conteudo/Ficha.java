package modelo.conteudo;


import java.util.Map;

public class Ficha {

    private int PV;
    private int SAN;
    private int NEX;

    public void setNEX(int NEX) {
        this.NEX = NEX;

    }

    public int calcularPV(int forca, int cons) {
        return this.PV = (forca + cons) / 10;
    }

    public int calcularSAN(int poder) {
        return this.SAN = poder + 20;
    }
}