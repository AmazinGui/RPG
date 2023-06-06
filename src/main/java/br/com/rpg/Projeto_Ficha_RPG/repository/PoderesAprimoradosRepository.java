package br.com.rpg.Projeto_Ficha_RPG.repository;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.Estilo;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.PoderesAprimorados;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoderesAprimoradosRepository extends CrudRepository<PoderesAprimorados, Integer> {

    List<PoderesAprimorados> findByEstilo(Estilo estilo);
}
