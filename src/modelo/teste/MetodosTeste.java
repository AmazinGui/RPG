package modelo.teste;

import modelo.conteudo.Atributos;
import modelo.conteudo.Ficha;
import modelo.conteudo.NEX;
import modelo.conteudo.Rolar_Teste;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MetodosTeste {

    private static Map<Enum, Integer> atributos = new HashMap();

    public static void main(String[] args) {

        //Rolar_Teste teste = new Rolar_Teste();
        //teste.desvantagem(5);

        atributos.put(Atributos.FOR, 70);
        atributos.put(Atributos.DES, 60);
        atributos.put(Atributos.CON, 60);
        atributos.put(Atributos.INT, 95);
        atributos.put(Atributos.NEX, 80);

        Ficha ficha = new Ficha();
        System.out.println(ficha.calcularPV(atributos.get(Atributos.FOR), atributos.get(Atributos.CON), atributos.get(Atributos.NEX)));
        System.out.println(NEX.calcularOcultismo(atributos.get(Atributos.INT), atributos.get(Atributos.NEX)));

    }
}
