package br.com.fernandoguide.DockerInit.resource;

import br.com.fernandoguide.DockerInit.entity.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PessoaResource {

    @GetMapping("/pessoa")
    public List<Pessoa> getAllPessoa(){
        return List.of(new Pessoa(1L,"Fernando","123456","fernando@gmail.com"),
                new Pessoa(2L,"Rodrigo","54354354","rodrigo@gmail.com"),
                new Pessoa(3L,"Lucas","5345345346","lucas@gmail.com"),
                new Pessoa(4L,"Marcos","645345345","marcos@gmail.com"));
    }
}
