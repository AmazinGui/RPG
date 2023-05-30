package br.com.rpg.Projeto_Ficha_RPG.conteudo.ficha;

public class NEX {

    private int NEX;
    private static int PVAdicional;
    private static int ocultismo;
    private static int mental;

    private static Nivel nivel;

    public static int adicionarPV(int cons, int NEX) {
        if (NEX >= 0) {
            PVAdicional += nivel.NIVEL20.calcularNivel(NEX)*(2 + cons / 35);
        }
        if (NEX >= 25) {
            PVAdicional += nivel.NIVEL40.calcularNivel(NEX)*(3 + cons / 35);
        }
        if (NEX >= 45) {
            PVAdicional += nivel.NIVEL60.calcularNivel(NEX)*(5 + cons / 35);
        }
        if (NEX >= 65) {
            PVAdicional += nivel.NIVEL80.calcularNivel(NEX)*(7 + cons / 35);
        }
        if (NEX >= 85) {
            PVAdicional += nivel.NIVEL95.calcularNivel(NEX)*(10 + cons / 35);
        }
        if (NEX == 99) {
            PVAdicional += (20 + cons / 35);
        }

        return PVAdicional;
    }

    public static int calcularOcultismo(int intel, int NEX) {
        if (NEX < 15) {
            return ocultismo = 0;
        } else if (NEX <= 95) {
            for (int i=0; i <= NEX; i++) {
                ocultismo = 2*(i/15-1) + intel/40;
            }
            return ocultismo;
        }
        return 12 + intel/40;
    }
    public static int calcularMental(int pod, int NEX) {
        if (NEX < 25) {
            return mental = 0;
        } else if (NEX <= 95) {
            for (int i=0; i <= NEX; i++) {
                mental = i/25 + pod/40;
            }
            return mental;
        }
        return 5 + pod/40;
    }
}
