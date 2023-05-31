package br.com.rpg.Projeto_Ficha_RPG.repository;

import br.com.rpg.Projeto_Ficha_RPG.tabelas.Armas;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.PoderesAprimorados;
import org.springframework.data.repository.CrudRepository;

public interface ArmasRepository extends CrudRepository<Armas, Integer> {
}
