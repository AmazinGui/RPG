package br.com.rpg.Projeto_Ficha_RPG.controller;

import br.com.rpg.Projeto_Ficha_RPG.domain.armas.Armas;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.DadosListagemPersonagem;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.DadosPersonagem;
import br.com.rpg.Projeto_Ficha_RPG.service.PersonagemService;
import jakarta.annotation.Resource;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("personagem")
public class PersonagemController {
    @Resource
    private PersonagemServiceTeste serviceTeste;
    @Autowired
    private PersonagemService service;

    @PostMapping
    @Transactional
    public void inserir(@RequestBody @Valid DadosPersonagem dados) {
        service.criarPersonagem(dados);
    }

    @GetMapping
    public List<DadosListagemPersonagem> listar() {
        return service.verPersonagem();
    }

    public void teste1() {
        serviceTeste.teste().ifPresent(p -> {
            System.out.println(p.getArmas().stream().map(Armas::getNome));
        });
    }
}
