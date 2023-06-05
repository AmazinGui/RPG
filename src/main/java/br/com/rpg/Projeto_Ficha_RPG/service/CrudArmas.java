package br.com.rpg.Projeto_Ficha_RPG.service;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Alcance;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.CategoriaDeArma;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Estilo;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.SubcategoriaDeArma;
import br.com.rpg.Projeto_Ficha_RPG.repository.ArmasRepository;
import br.com.rpg.Projeto_Ficha_RPG.repository.PoderesAprimoradosRepository;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.Armas;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.PoderesAprimorados;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CrudArmas {

    private ArmasRepository armasRepository;
    private Armas armas = new Armas();
    private Boolean system = true;

    public CrudArmas(ArmasRepository armasRepository) {
        this.armasRepository = armasRepository;
    }

    public void iniciar(Scanner scanner) throws Exception {

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
        System.out.println("Nome da arma:");
        String arma = scanner.nextLine();

        System.out.println("Categoria:");
        CategoriaDeArma categoria = CategoriaDeArma.valueOf(scanner.nextLine());

        System.out.println("Subcategoria:");
        SubcategoriaDeArma subcategoria = SubcategoriaDeArma.valueOf(scanner.nextLine());

        System.out.println("Alcance:");
        Alcance alcance = Alcance.valueOf(scanner.nextLine());

        System.out.println("Munição:");
        String municao = scanner.nextLine();

        System.out.println("Dano:");
        String dano = scanner.nextLine();

        System.out.println("Detalhe:");
        String detalhe = scanner.nextLine();

        armas.setArma(arma);
        armas.setCategoria(categoria);
        armas.setSubcategoria(subcategoria);
        armas.setAlcance(alcance);
        armas.setMunicao(municao);
        armas.setDano(dano);
        armas.setDetalhe(detalhe);
        armasRepository.save(armas);
        System.out.println("Salvo!");
    }

    public void atualizar(Scanner scanner) {
        System.out.println("Id do poder:");
        Integer id = Integer.parseInt(scanner.nextLine());
        armas.setId(id);

        salvar(scanner);
    }

    public void visualizar() {
        Iterable<Armas> view = armasRepository.findAll();
        view.forEach(System.out::println);
    }

    public void deletar(Scanner scanner) {
        System.out.println("Id do poder:");
        Integer id = scanner.nextInt();
        armasRepository.deleteById(id);
        System.out.println("Deletado!");
    }
}
