package br.com.rpg.Projeto_Ficha_RPG.service;

import br.com.rpg.Projeto_Ficha_RPG.repository.*;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class CrudPersonagem {

    private PersonagemRepository personagemRepository;
    private ArmasRepository armasRepository;
    private PoderesAprimoradosRepository poderesAprimoradosRepository;
    private PoderesParanormaisRepository poderesParanormaisRepository;
    private RituaisRepository rituaisRepository;
    private Personagem personagem = new Personagem();
    private Boolean system = true;

    public CrudPersonagem(PersonagemRepository personagemRepository, ArmasRepository armasRepository,
                          PoderesAprimoradosRepository poderesAprimoradosRepository,
                          PoderesParanormaisRepository poderesParanormaisRepository,
                          RituaisRepository rituaisRepository) {
        this.personagemRepository = personagemRepository;
        this.armasRepository = armasRepository;
        this.poderesAprimoradosRepository = poderesAprimoradosRepository;
        this.poderesParanormaisRepository = poderesParanormaisRepository;
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

    private List<Armas> armas(Scanner scanner) {
        Boolean deveContinuar = true;
        List<Armas> lista = new ArrayList<>();
        System.out.println("(Para sair digite 0)");
        System.out.println("Nome da arma:");

        while (deveContinuar) {
            String nome = scanner.nextLine();

            if (!nome.equals("0")) {
                Optional<Armas> arma = armasRepository.findByArma(nome);
                lista.add(arma.get());
            } else {
                deveContinuar = false;
            }
        }
        return lista;
    }

    private List<PoderesAprimorados> poderesAprimorados(Scanner scanner) {
        Boolean deveContinuar = true;
        List<PoderesAprimorados> lista = new ArrayList<>();
        System.out.println("(Para sair digite 0)");
        System.out.println("Nome do poder:");

        while (deveContinuar) {
            String nome = scanner.nextLine();

            if (!nome.equals("0")) {
                Optional<PoderesAprimorados> poder = poderesAprimoradosRepository.findByPoder(nome);
                lista.add(poder.get());
            } else {
                deveContinuar = false;
            }
        }
        return lista;
    }

    private List<PoderesParanormais> poderesParanormais(Scanner scanner) {
        Boolean deveContinuar = true;
        List<PoderesParanormais> lista = new ArrayList<>();
        System.out.println("(Para sair digite 0)");
        System.out.println("Nome do poder:");

        while (deveContinuar) {
            String nome = scanner.nextLine();

            if (!nome.equals("0")) {
                Optional<PoderesParanormais> poder = poderesParanormaisRepository.findByPoder(nome);
                lista.add(poder.get());
            } else {
                deveContinuar = false;
            }
        }
        return lista;
    }

    private List<Rituais> rituais(Scanner scanner) {
        Boolean deveContinuar = true;
        List<Rituais> lista = new ArrayList<>();
        System.out.println("(Para sair digite 0)");
        System.out.println("Nome do ritual:");

        while (deveContinuar) {
            String nome = scanner.nextLine();

            if (!nome.equals("0")) {
                Optional<Rituais> ritual = rituaisRepository.findByRitual(nome);
                lista.add(ritual.get());
            } else {
                deveContinuar = false;
            }
        }
        return lista;
    }

    public void salvar(Scanner scanner) {
        List<Armas> armas = armas(scanner);
        armas.forEach(armas1 -> armas1.getArma());
        List<PoderesAprimorados> poderes = poderesAprimorados(scanner);
        List<PoderesParanormais> paranormais = poderesParanormais(scanner);
        List<Rituais> rituais = rituais(scanner);

        personagem.setArmas(armas);
        personagem.setPoderesAprimorados(poderes);
        personagem.setPoderesParanormais(paranormais);
        personagem.setRituais(rituais);
        personagemRepository.save(personagem);
        System.out.println("Salvo!");
    }

    public void atualizar(Scanner scanner) {
        System.out.println("Id do persongem:");
        Integer id = Integer.valueOf(scanner.nextLine());
        personagem.setId(id);

        salvar(scanner);
    }

    public void visualizar(Scanner scanner) {
        Boolean visual = true;
        while (visual) {
            System.out.println("Como você gostaria de visualizar?");
            System.out.println("0 - Sair");
            System.out.println("1 - Todos");

            Integer action = Integer.parseInt(scanner.nextLine());

            switch (action) {
                case 1:
                    Iterable<Personagem> view = personagemRepository.findAll();
                    view.forEach(System.out::println);
                    break;
                default:
                    visual = false;
                    break;
            }
        }
    }

    public void deletar(Scanner scanner) {
        System.out.println("Id do poder:");
        Integer id = scanner.nextInt();
        armasRepository.deleteById(id);
        System.out.println("Deletado!");
    }
}
