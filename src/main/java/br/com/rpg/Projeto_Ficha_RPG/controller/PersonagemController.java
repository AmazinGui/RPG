package br.com.rpg.Projeto_Ficha_RPG.controller;

import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.DadosListagemPersonagem;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.DadosPersonagem;
import br.com.rpg.Projeto_Ficha_RPG.service.PersonagemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("personagem")
public class PersonagemController {
    @Autowired
    private PersonagemService service;

    @PostMapping
    public void inserir(@RequestBody @Valid DadosPersonagem dados) {
        service.criarPersonagem(dados);
    }

    @GetMapping(path = "{nome}")
    public DadosListagemPersonagem ler(@PathVariable(name = "nome") String nome) {
        return service.verPersonagem(nome);
    }

    @GetMapping
    public List<DadosListagemPersonagem> lista() {
        return service.listarPersonagens();
    }

    @PutMapping
    public void atualizar(@RequestBody @Valid DadosPersonagem dados) {
        service.atualizarPersonagem(dados);
    }

    @PatchMapping
    public void ativar(@RequestParam("nome") @Valid String nome) {
        service.ativarPersonagem(nome);
    }

    @DeleteMapping
    public void deletar(@RequestParam("nome") @Valid String nome) {
        service.excluirPersonagem(nome);
    }
}
