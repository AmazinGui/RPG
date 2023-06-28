package br.com.rpg.Projeto_Ficha_RPG;

import br.com.rpg.Projeto_Ficha_RPG.domain.armas.Armas;
import br.com.rpg.Projeto_Ficha_RPG.repository.ArmasRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class ProjetoFichaRpgApplication{
	public static void main(String[] args) {
		SpringApplication.run(ProjetoFichaRpgApplication.class, args);
	}

	@Bean
	CommandLineRunner lerArmas(ArmasRepository repository) {
		return args -> {
			ObjectMapper objectMapper = new ObjectMapper();
			TypeReference<List<Armas>> typeReference = new TypeReference<List<Armas>>() {};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/Armas.json");
			try {
				List<Armas> armas = objectMapper.readValue(inputStream, typeReference);
				armas.forEach(arma -> {
					if (arma.getNome() == null) {
						repository.save(arma);
					}
				});
			} catch (IOException e) {
				System.out.println("Não foi possível salvar armas: " + e.getMessage());
			}
		};
	}
}