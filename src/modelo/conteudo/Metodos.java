package modelo.conteudo;

import java.util.*;

public class Metodos {

    public Set rolar(int quantidade) {
        Set<Integer> valores = new HashSet<>();
        for (int i = 0; i < quantidade;  i++) {
            int valor = new Random().nextInt(100);
            valores.add(valor);
        }
        return valores;
    }

    public void atributos_valores(Map atributos, Atributos a, int valor) {
        atributos.put(a, valor);
    }

    public void pericias_valores(Map pericias, Pericias a, int valor) {
        pericias.put(a, valor);
    }
}
