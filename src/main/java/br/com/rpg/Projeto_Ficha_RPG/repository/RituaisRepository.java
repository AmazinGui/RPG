package br.com.rpg.Projeto_Ficha_RPG.repository;

import br.com.rpg.Projeto_Ficha_RPG.tabelas.PoderesAprimorados;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.Rituais;
import org.springframework.data.repository.CrudRepository;

public interface RituaisRepository extends CrudRepository<Rituais, Integer> {
}
