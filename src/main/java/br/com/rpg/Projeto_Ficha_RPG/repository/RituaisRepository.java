package br.com.rpg.Projeto_Ficha_RPG.repository;

import br.com.rpg.Projeto_Ficha_RPG.domain.rituais.Rituais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RituaisRepository extends JpaRepository<Rituais, Integer> {
}
