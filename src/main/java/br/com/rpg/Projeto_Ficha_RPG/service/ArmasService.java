package br.com.rpg.Projeto_Ficha_RPG.service;

import br.com.rpg.Projeto_Ficha_RPG.domain.armas.Armas;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.DadosPersonagem;
import br.com.rpg.Projeto_Ficha_RPG.domain.personagm.Personagem;
import br.com.rpg.Projeto_Ficha_RPG.repository.ArmasRepository;
import br.com.rpg.Projeto_Ficha_RPG.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArmasService {


    @Autowired
    private ArmasRepository armasRepository;
    @Autowired
    private PersonagemRepository personagemRepository;

    @Transactional
    public void associarArmaPersonagem(DadosPersonagem dados, Personagem personagem) {
        List<Armas> lista = new ArrayList<>();
        for (String arma : dados.armas()) {
            try {
                Armas armas = armasRepository.findByNome(arma);
                if (armas != null) {
                    lista.add(armas);
                }
            } catch (Exception e) {
                e.printStackTrace();
                }
        }
        personagem.setArmas(lista);
        personagemRepository.save(personagem);
    }
}
