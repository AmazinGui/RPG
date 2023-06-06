package br.com.rpg.Projeto_Ficha_RPG.repository;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.CategoriaDeArma;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.SubcategoriaDeArma;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.Armas;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.PoderesAprimorados;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArmasRepository extends CrudRepository<Armas, Integer> {

    List<Armas> findByCategoria(CategoriaDeArma categoriaDeArma);
    List<Armas> findBySubcategoria(SubcategoriaDeArma subcategoriaDeArma);
}
