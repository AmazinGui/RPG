package br.com.rpg.Projeto_Ficha_RPG.repository;

import br.com.rpg.Projeto_Ficha_RPG.tabelas.PoderesAprimorados;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.PoderesParanormais;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PoderesParanormaisRepository extends CrudRepository<PoderesParanormais, Integer> {

    PoderesParanormais findByPoder(String nome);
}
