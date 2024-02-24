package br.com.fernandoguide.DockerInit.resource;

import br.com.fernandoguide.DockerInit.entity.Pessoa;
import br.com.fernandoguide.DockerInit.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PessoaResource {

    @Autowired
    private PessoaRepository repository;

    @GetMapping("/pessoa")
    public List<Pessoa> getAllPessoa() {
        return repository.findAll();
    }
}
