package br.com.rpg.Projeto_Ficha_RPG.repository;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.Estilo;
import br.com.rpg.Projeto_Ficha_RPG.domain.poderes.PoderesAprimorados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PoderesAprimoradosRepository extends JpaRepository<PoderesAprimorados, Integer> {
}
