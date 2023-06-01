package br.com.rpg.Projeto_Ficha_RPG;

import br.com.rpg.Projeto_Ficha_RPG.service.CrudPoderesAprimorados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ProjetoFichaRpgApplication implements CommandLineRunner {

	private CrudPoderesAprimorados crudPoderesAprimorados;
	private Boolean system = true;

	public ProjetoFichaRpgApplication(CrudPoderesAprimorados crudPoderesAprimorados) {
		this.crudPoderesAprimorados = crudPoderesAprimorados;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoFichaRpgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		while (system) {
			System.out.println("Qual tabela você quer executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Poderes Aprimorados");

			Scanner scanner = new Scanner(System.in);
			int opcao = Integer.parseInt(scanner.nextLine());
			switch (opcao) {
				case 1:
					crudPoderesAprimorados.iniciar(scanner);
					break;
				default:
					system = false;
					break;
			}
		}
	}
}