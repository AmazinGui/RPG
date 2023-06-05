package br.com.rpg.Projeto_Ficha_RPG.service;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Alcance;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Estilo;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Execucao;
import br.com.rpg.Projeto_Ficha_RPG.repository.RituaisRepository;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.Rituais;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CrudRituais {

    private RituaisRepository rituaisRepository;
    private Rituais rituais = new Rituais();
    private Boolean system = true;

    public CrudRituais(RituaisRepository rituaisRepository) {
        this.rituaisRepository = rituaisRepository;
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
                    visualizar();
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
        System.out.println("Nome do ritual:");
        String ritual = scanner.nextLine();

        System.out.println("Execução:");
        Execucao execucao = Execucao.valueOf(scanner.nextLine());

        System.out.println("Alcance:");
        Alcance alcance = Alcance.valueOf(scanner.nextLine());

        System.out.println("Duração:");
        String duracao = scanner.nextLine();

        System.out.println("Descrição:");
        String descricao = scanner.nextLine();

        rituais.setRitual(ritual);
        rituais.setExecucao(execucao);
        rituais.setAlcance(alcance);
        rituais.setDuracao(duracao);
        rituais.setDescricao(descricao);
        rituaisRepository.save(rituais);
        System.out.println("Salvo!");
    }

    public void atualizar(Scanner scanner) {
        System.out.println("Id do ritual:");
        Integer id = Integer.parseInt(scanner.nextLine());
        rituais.setId(id);

        salvar(scanner);

    }

    public void visualizar() {
        Iterable<Rituais> view = rituaisRepository.findAll();
        view.forEach(System.out::println);
    }

    public void deletar(Scanner scanner) {
        System.out.println("Id do poder:");
        Integer id = scanner.nextInt();
        rituaisRepository.deleteById(id);
        System.out.println("Deletado!");
    }
}
