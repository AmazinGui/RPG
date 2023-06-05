package br.com.rpg.Projeto_Ficha_RPG.service;

import br.com.rpg.Projeto_Ficha_RPG.repository.NEXRepository;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.NEX;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CrudNEX {

    private NEXRepository nexRepository;
    private NEX NEX = new NEX();
    private Boolean system = true;

    public CrudNEX(NEXRepository nexRepository) {
        this.nexRepository = nexRepository;
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
        System.out.println("NEX:");
        Integer nex = Integer.valueOf(scanner.nextLine());

        System.out.println("Pontos:");
        Integer pontos = Integer.valueOf(scanner.nextLine());

        System.out.println("Melhoria:");
        String melhoria = scanner.nextLine();

        System.out.println("PV:");
        String pv = scanner.nextLine();

        System.out.println("Mental:");
        String mental = scanner.nextLine();

        System.out.println("Ocultismo:");
        String ocultismo = scanner.nextLine();

        System.out.println("Sanidade:");
        Integer sanidade = Integer.valueOf(scanner.nextLine());

        NEX.setNex(nex);
        NEX.setPontos(pontos);
        NEX.setMelhoria(melhoria);
        NEX.setPv(pv);
        NEX.setMental(mental);
        NEX.setOcultismo(ocultismo);
        NEX.setSanidade(sanidade);
        nexRepository.save(NEX);
        System.out.println("Salvo!");
    }

    public void atualizar(Scanner scanner) {
        System.out.println("Id do NEX:");
        Integer id = Integer.parseInt(scanner.nextLine());
        NEX.setId(id);

        salvar(scanner);

    }

    public void visualizar() {
        Iterable<NEX> view = nexRepository.findAll();
        view.forEach(System.out::println);
    }

    public void deletar(Scanner scanner) {
        System.out.println("Id do poder:");
        Integer id = scanner.nextInt();
        nexRepository.deleteById(id);
        System.out.println("Deletado!");
    }
}
