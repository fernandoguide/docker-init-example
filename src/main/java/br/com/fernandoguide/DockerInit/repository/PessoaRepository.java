package br.com.fernandoguide.DockerInit.repository;

import br.com.fernandoguide.DockerInit.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public interface PessoaRepository extends JpaRepository<Pessoa,Integer> {
}
