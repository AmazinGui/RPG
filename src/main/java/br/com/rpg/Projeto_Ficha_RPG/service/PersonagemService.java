package br.com.rpg.Projeto_Ficha_RPG.service;

import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.DadosListagemPersonagem;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.DadosPersonagem;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.Personagem;
import br.com.rpg.Projeto_Ficha_RPG.repository.PersonagemRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository repository;

    public void criarPersonagem(DadosPersonagem dados) {
        repository.save(new Personagem(dados));
    }

    public List<DadosListagemPersonagem> todosPersonagem() {
        return repository.findAllByInformacoesAgente_StatusTrue().stream().map(DadosListagemPersonagem::new).toList();
    }

    public DadosListagemPersonagem verPersonagem(String nome) {
        var personagem = repository.findByInformacoesPessoais_Nome(nome);
        if (personagem != null) {
            return new DadosListagemPersonagem(personagem);
        }
        return null;
    }

    public void atualizarPersonagem(DadosPersonagem dados) {
        var personagem = repository.findByInformacoesPessoais_Nome(dados.informacoesPessoais().nome());
        if (personagem != null) {
            BeanUtils.copyProperties(dados, personagem);
            repository.save(personagem);
        }
    }

    public void excluirPersonagem(String nome) {
        var personagens = repository.findAllByInformacoesPessoais_Nome(nome);
        for (var personagem : personagens) {
            personagem.getInformacoesAgente().setStatus(false);
        }
    }
}
