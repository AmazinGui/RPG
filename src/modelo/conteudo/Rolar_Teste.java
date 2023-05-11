package modelo.conteudo;

import java.util.Collections;

public class Rolar_Teste {

    private Metodos rolar;

    public void vantagem(int quantidade) {
        int valor = (int) Collections.min(rolar.rolar(quantidade));
        System.out.println(valor);
    }
    public void desvantagem(int quantidade) {
        int valor = (int) Collections.max(rolar.rolar(quantidade));
        System.out.println(valor);
    }
};
