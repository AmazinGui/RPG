package br.com.rpg.Projeto_Ficha_RPG.repository;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.CategoriaDeArma;
import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.SubcategoriaDeArma;
import br.com.rpg.Projeto_Ficha_RPG.domain.armas.Armas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArmasRepository extends JpaRepository<Armas, Integer> {

    Armas findByNome (String nome);
}
