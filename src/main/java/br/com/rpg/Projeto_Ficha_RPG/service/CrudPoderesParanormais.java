package br.com.rpg.Projeto_Ficha_RPG.service;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Estilo;
import br.com.rpg.Projeto_Ficha_RPG.repository.PoderesAprimoradosRepository;
import br.com.rpg.Projeto_Ficha_RPG.repository.PoderesParanormaisRepository;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.PoderesAprimorados;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.PoderesParanormais;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CrudPoderesParanormais {

    private PoderesParanormaisRepository poderesParanormaisRepository;
    private PoderesParanormais poderesParanormais = new PoderesParanormais();
    private Boolean system = true;

    public CrudPoderesParanormais(PoderesParanormaisRepository poderesParanormaisRepository) {
        this.poderesParanormaisRepository = poderesParanormaisRepository;
    }

    public void iniciar(Scanner scanner) {

        while (system) {
            System.out.println("Qual ação gostaria de executar?");
            System.out.println("0 - Sair");
            System.out.println("1 - Salvar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Visualizar");
            System.out.println("4 - Deletar");
            int action = Integer.parseInt(scanner.nextLine());

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
        System.out.println("Nome do poder:");
        String poder = scanner.nextLine();

        System.out.println("Descrição:");
        String descricao = scanner.nextLine();

        System.out.println("Requerimento:");
        String requerimento = scanner.nextLine();

        System.out.println("Estilo:");
        Estilo estilo = Estilo.valueOf(scanner.nextLine());


        poderesParanormais.setPoder(poder);
        poderesParanormais.setDescricao(descricao);
        poderesParanormais.setRequerimento(requerimento);
        poderesParanormais.setEstilo(estilo);
        poderesParanormaisRepository.save(poderesParanormais);
        System.out.println("Salvo!");
    }

    public void atualizar(Scanner scanner) {
        System.out.println("Id do poder:");
        Integer id = Integer.parseInt(scanner.nextLine());
        poderesParanormais.setId(id);

        salvar(scanner);

    }

    public void visualizar() {
        Iterable<PoderesParanormais> view = poderesParanormaisRepository.findAll();
        view.forEach(System.out::println);
    }

    public void deletar(Scanner scanner) {
        System.out.println("Id do poder:");
        Integer id = Integer.parseInt(scanner.nextLine());
        poderesParanormaisRepository.deleteById(id);
        System.out.println("Deletado!");
    }
}
