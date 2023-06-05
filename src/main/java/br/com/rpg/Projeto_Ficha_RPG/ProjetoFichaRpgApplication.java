package br.com.rpg.Projeto_Ficha_RPG;

import br.com.rpg.Projeto_Ficha_RPG.service.CrudArmas;
import br.com.rpg.Projeto_Ficha_RPG.service.CrudPoderesAprimorados;
import br.com.rpg.Projeto_Ficha_RPG.service.CrudPoderesParanormais;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ProjetoFichaRpgApplication implements CommandLineRunner {

	private CrudPoderesAprimorados crudPoderesAprimorados;
	private CrudPoderesParanormais crudPoderesParanormais;
	private CrudArmas crudArmas;
	private Boolean system = true;

	public ProjetoFichaRpgApplication(CrudPoderesAprimorados crudPoderesAprimorados, CrudPoderesParanormais crudPoderesParanormais,
									  CrudArmas crudArmas) {
		this.crudPoderesAprimorados = crudPoderesAprimorados;
		this.crudPoderesParanormais = crudPoderesParanormais;
		this.crudArmas = crudArmas;
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
			System.out.println("2 - Poderes Paranormais");
			System.out.println("3 - Armas");

			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			if (!input.isEmpty()) {
				int opcao = Integer.parseInt(input);

				switch (opcao) {
					case 1:
						crudPoderesAprimorados.iniciar(scanner);
						break;
					case 2:
						crudPoderesParanormais.iniciar(scanner);
						break;
					case 3:
						crudArmas.iniciar(scanner);
						break;
					default:
						system = false;
						break;
				}
			} else {
					throw new Exception("Deu merda!");
			}
		}
	}
}