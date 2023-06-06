package br.com.rpg.Projeto_Ficha_RPG.service;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Estilo;
import br.com.rpg.Projeto_Ficha_RPG.repository.PoderesAprimoradosRepository;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.Armas;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.PoderesAprimorados;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class CrudPoderesAprimorados {

    private PoderesAprimoradosRepository poderesAprimoradosRepository;
    private PoderesAprimorados poderesAprimorados = new PoderesAprimorados();
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

            Integer action = Integer.parseInt(scanner.nextLine());

            switch (action) {
                case 1:
                    salvar(scanner);
                    break;
                case 2:
                    atualizar(scanner);
                    break;
                case 3:
                    visualizar(scanner);
                    break;
                case 4:
                    deletar(scanner);
                    break;
                default:
                    system = false;
                    break;
                }
        }
    }

    public void salvar(Scanner scanner) {
        System.out.println("Nome do poder:");
        String poder = scanner.nextLine();

        System.out.println("Descrição:");
        String descricao = scanner.nextLine();

        System.out.println("Requerimento:");
        String requerimento = scanner.nextLine();

        System.out.println("Estilo:");
        Estilo estilo = Estilo.valueOf(scanner.nextLine());

        poderesAprimorados.setPoder(poder);
        poderesAprimorados.setDescricao(descricao);
        poderesAprimorados.setRequerimento(requerimento);
        poderesAprimorados.setEstilo(estilo);
        poderesAprimoradosRepository.save(poderesAprimorados);
        System.out.println("Salvo!");
    }

    public void atualizar(Scanner scanner) {
        System.out.println("Id do poder:");
        Integer id = Integer.parseInt(scanner.nextLine());
        poderesAprimorados.setId(id);

        salvar(scanner);

    }

    public void visualizar(Scanner scanner) {
        Boolean visual = true;
        while (visual) {
            System.out.println("Como você gostaria de visualizar?");
            System.out.println("0 - Sair");
            System.out.println("1 - Todos");
            System.out.println("2 - Estilo");

            Integer action = Integer.parseInt(scanner.nextLine());

            switch (action) {
                case 1:
                    Iterable<PoderesAprimorados> view = poderesAprimoradosRepository.findAll();
                    view.forEach(System.out::println);
                    break;
                case 2:
                    visualizarEstilo(scanner);
                    break;
                default:
                    visual = false;
                    break;
            }
        }
    }

    public void visualizarEstilo(Scanner scanner) {
        System.out.println("Estilo a buscar:");
        Estilo estilo = Estilo.valueOf(scanner.nextLine());
        List<PoderesAprimorados> list = poderesAprimoradosRepository.findByEstilo(estilo);
        list.forEach(System.out::println);
    }

    public void deletar(Scanner scanner) {
        System.out.println("Id do poder:");
        Integer id = scanner.nextInt();
        poderesAprimoradosRepository.deleteById(id);
        System.out.println("Deletado!");
    }
}
