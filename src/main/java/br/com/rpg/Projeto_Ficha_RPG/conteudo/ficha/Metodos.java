package br.com.rpg.Projeto_Ficha_RPG.conteudo.ficha;

import java.util.*;

public class Metodos {

    public Set rolar(int quantidade) {
        Set<Integer> valores = new HashSet<>();
        for (int i = 0; i < quantidade;  i++) {
            int valor = new Random().nextInt(1,100);
            valores.add(valor);
        }
        return valores;
    }

    public static Map<Atributos, Integer> poder_inicial_valor(int poder) {
        Map<Atributos, Integer> map = new EnumMap<>(Atributos.class);
        map.put(Atributos.POD_INICIAL, poder);

        return map;
    }

    public static Map<Atributos, Integer> atributos_valor(int FOR, int DES, int CON, int TAM, int APA, int INT, int POD, int NEX) {
        Map<Atributos, Integer> atributos = new EnumMap<>(Atributos.class);
        atributos.put(Atributos.FOR, FOR);
        atributos.put(Atributos.DES, DES);
        atributos.put(Atributos.CON, CON);
        atributos.put(Atributos.TAM, TAM);
        atributos.put(Atributos.APA, APA);
        atributos.put(Atributos.INT, INT);
        atributos.put(Atributos.POD, POD);
        atributos.put(Atributos.NEX, NEX);

        return atributos;
    }
}
