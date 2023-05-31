package br.com.rpg.Projeto_Ficha_RPG.service;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Estilo;
import br.com.rpg.Projeto_Ficha_RPG.repository.PoderesAprimoradosRepository;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.PoderesAprimorados;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CrudPoderesAprimorados {

    private PoderesAprimoradosRepository poderesAprimoradosRepository;
    private PoderesAprimorados poderesAprimorados;
    private Boolean system = true;

    public CrudPoderesAprimorados(PoderesAprimoradosRepository poderesAprimoradosRepository) {
        this.poderesAprimoradosRepository = poderesAprimoradosRepository;
    }

    public void iniciar(Scanner scanner) {

        while (system) {
            System.out.println("Qual ação gostaria de executar?");
            System.out.println("0 - Sair");
            System.out.println("1 - Salvar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Visualizar");
            System.out.println("4 - Deletar");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    salvar(scanner);
                    break;
            }
        }
    }

    private void salvar(Scanner scanner) {
        System.out.println("Nome do poder:");
        String poder = scanner.next();

        System.out.println("Descrição:");
        String descricao = scanner.next();

        System.out.println("Requerimento:");
        String requerimento = scanner.next();

        System.out.println("Estilo:");
        Estilo estilo = Estilo.valueOf(scanner.next());

        System.out.println("NEX do poder:");
        Integer nex = scanner.nextInt();

        poderesAprimorados.setPoder(poder);
        poderesAprimorados.setDescricao(descricao);
        poderesAprimorados.setRequerimento(requerimento);
        poderesAprimorados.setEstilo(estilo);
        poderesAprimorados.setNex(nex);
        poderesAprimoradosRepository.save(poderesAprimorados);
        System.out.println("Salvo!");
    }
}
