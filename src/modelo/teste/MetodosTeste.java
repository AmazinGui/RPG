package modelo.teste;

import modelo.conteudo.*;

import java.util.Map;

public class MetodosTeste {
    public static void main(String[] args) {

        Rolar_Teste teste = new Rolar_Teste();
        teste.vantagem(2);

        Map <Atributos, Integer> poderInicial = Metodos.poder_inicial_valor(50);

        Map <Atributos, Integer> personagem = Metodos.atributos_valor(40, 60, 50, 50,
                60, 75, 55, 5);

        Ficha ficha = new Ficha();
        System.out.println("PV: " + ficha.calcularPV(personagem.get(Atributos.TAM), personagem.get(Atributos.CON), personagem.get(Atributos.NEX)));
        System.out.println("SAN: " + ficha.calcularSAN(poderInicial.get(Atributos.POD_INICIAL)));
        System.out.println("Ocultismo: " + NEX.calcularOcultismo(personagem.get(Atributos.INT), personagem.get(Atributos.NEX)));
        System.out.println("Resistêncial Mental: " + NEX.calcularMental(personagem.get(Atributos.POD), personagem.get(Atributos.NEX)));
    }
}
