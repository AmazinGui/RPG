package br.com.rpg.Projeto_Ficha_RPG.service;

import br.com.rpg.Projeto_Ficha_RPG.conteudo.suporte.Atualizar;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.DadosListagemPersonagem;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.DadosPersonagem;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.Personagem;
import br.com.rpg.Projeto_Ficha_RPG.repository.ArmasRepository;
import br.com.rpg.Projeto_Ficha_RPG.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository repository;
    @Autowired
    private ArmasRepository armasRepository;
    @Autowired
    private Atualizar atualizador;
    @Autowired
    private ArmasService armasService;

    @Transactional
    public void criarPersonagem(DadosPersonagem dados) {
        repository.save(new Personagem(dados));
    }

    @Transactional(readOnly = true)
    public DadosListagemPersonagem verPersonagem(String nome) {
        var personagem = repository.findByInformacoesPessoais_Nome(nome);
        if (personagem != null) {
            return new DadosListagemPersonagem(personagem);
        }
        return null;
    }

    @Transactional(readOnly = true)
    public List<DadosListagemPersonagem> listarPersonagens() {
        var personagens = repository.findAllByInformacoesAgente_StatusTrue();
        List<DadosListagemPersonagem> lista = personagens.stream()
                .map(DadosListagemPersonagem::new)
                .collect(Collectors.toList());

        return lista;
    }

    @Transactional
    public void atualizarPersonagem(DadosPersonagem dados) {
        var personagem = repository.findByInformacoesPessoais_Nome(dados.informacoesPessoais().nome());
        if (personagem != null) {
            atualizador.atualizar(dados, personagem);
            armasService.associarArmaPersonagem(dados, personagem);
        }
    }

    @Transactional
    public void ativarPersonagem(String nome) {
        var personagem = repository.findByInformacoesPessoais_Nome(nome);
            personagem.getInformacoesAgente().setStatus(true);
            repository.save(personagem);
    }

    @Transactional
    public void desativarPersonagem(String nome) {
        var personagem = repository.findByInformacoesPessoais_Nome(nome);
            personagem.getInformacoesAgente().setStatus(false);
            repository.save(personagem);
    }

    @Transactional
    public void excluirPersonagem(String nome) {
        var personagem = repository.findByInformacoesPessoais_Nome(nome);
        if (personagem != null){
            repository.deleteByInformacoesPessoais_Nome(nome);
        }
    }
}
