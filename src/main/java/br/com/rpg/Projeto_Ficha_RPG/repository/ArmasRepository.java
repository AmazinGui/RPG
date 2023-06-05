package br.com.rpg.Projeto_Ficha_RPG.repository;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.CategoriaDeArma;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.SubcategoriaDeArma;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.Armas;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.PoderesAprimorados;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArmasRepository extends CrudRepository<Armas, Integer> {

    @Query("SELECT p FROM Armas p WHERE p.?1 = :?2")
    List<Armas> findBy(String parametro, String valor);
}
