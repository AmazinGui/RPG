package br.com.rpg.Projeto_Ficha_RPG.controller;

import br.com.rpg.Projeto_Ficha_RPG.repository.PersonagemRepository;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.Personagem;
import jakarta.annotation.Resource;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonagemServiceTeste {

    @Resource
    private PersonagemRepository personagemRepository;
    @Transactional
    public Optional<Personagem> teste() {
        return personagemRepository.findById(1);
    }
}
