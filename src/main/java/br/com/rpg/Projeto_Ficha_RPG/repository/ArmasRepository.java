package br.com.rpg.Projeto_Ficha_RPG.repository;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.CategoriaDeArma;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.tabelas.SubcategoriaDeArma;
import br.com.rpg.Projeto_Ficha_RPG.tabelas.Armas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArmasRepository extends CrudRepository<Armas, Integer> {

    Optional<Armas> findByArma(String arma);

    List<Armas> findByCategoria(CategoriaDeArma categoriaDeArma);
    List<Armas> findBySubcategoria(SubcategoriaDeArma subcategoriaDeArma);
}
