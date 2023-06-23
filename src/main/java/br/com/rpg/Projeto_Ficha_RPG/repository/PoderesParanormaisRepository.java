package br.com.rpg.Projeto_Ficha_RPG.repository;

import br.com.rpg.Projeto_Ficha_RPG.domain.poderes.PoderesParanormais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PoderesParanormaisRepository extends JpaRepository<PoderesParanormais, Integer> {
}
