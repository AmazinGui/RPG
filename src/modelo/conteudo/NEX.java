package modelo.conteudo;

public class NEX {

    private int NEX;
    private int PVAdicional;
    private int ocultismo;
    private int mental;

    public void adicionarPV(int cons) {
        int nivel = NEX / 5;
        if (NEX <= 20) {
            PVAdicional = nivel * (2 + cons / 35);
        } else if (NEX <= 40) {
            PVAdicional = (3 + cons / 35);
        } else if (NEX <= 60) {
            PVAdicional = 5 + cons / 35;
        } else if (NEX <= 80) {
            PVAdicional = 7 + cons / 35;
        } else if (NEX <= 95) {
            PVAdicional = 10 + cons / 35;
        } else if (NEX <= 99) {
            PVAdicional = 20 + cons / 35;
        }
    }
}
