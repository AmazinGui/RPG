package br.com.rpg.Projeto_Ficha_RPG.service;

import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.DadosListagemPersonagem;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.DadosPersonagem;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.Personagem;
import br.com.rpg.Projeto_Ficha_RPG.repository.PersonagemRepository;
import jakarta.transaction.TransactionScoped;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository repository;

    public void criarPersonagem(DadosPersonagem dados) {
        var personagem = new Personagem(dados);
        repository.save(personagem);
    }

    public List<DadosListagemPersonagem> verPersonagem() {
        return repository.findAll().stream().map(DadosListagemPersonagem::new).toList();
    }
}
