package br.com.rpg.Projeto_Ficha_RPG.controller;

import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.DadosListagemPersonagem;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.DadosPersonagem;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.Personagem;
import br.com.rpg.Projeto_Ficha_RPG.service.PersonagemService;
import org.springframework.transaction.annotation.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("personagem")
public class PersonagemController {
    @Autowired
    private PersonagemService service;

    @PostMapping
    @Transactional
    public void inserir(@RequestBody @Valid DadosPersonagem dados) {
        service.criarPersonagem(dados);
    }

    @GetMapping
    public DadosListagemPersonagem ler(@RequestBody @Valid DadosPersonagem dados) {
        return service.verPersonagem(dados.informacoesPessoais().nome());
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosPersonagem dados) {
        service.atualizarPersonagem(dados);
    }

    @DeleteMapping
    @Transactional
    public void deletar(String nome) {
        service.excluirPersonagem(nome);
    }
}
