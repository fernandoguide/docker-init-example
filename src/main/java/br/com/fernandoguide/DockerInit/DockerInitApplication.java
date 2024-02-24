package br.com.fernandoguide.DockerInit;

import br.com.fernandoguide.DockerInit.entity.Pessoa;
import br.com.fernandoguide.DockerInit.repository.PessoaRepository;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Locale;

@SpringBootApplication
public class DockerInitApplication implements CommandLineRunner {

    @Autowired
    private PessoaRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(DockerInitApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker(Locale.forLanguageTag("pt-br"));
//        Schema<String, String> schema =
//                Schema.of(
//                        field("id", () -> String.valueOf(faker.number().positive())),
//                        field("nome", () -> faker.name().firstName()),
//                        field("cpf", () -> faker.cpf().valid()),
//                        field("email", () -> faker.internet().emailAddress())
//                );
//        SqlTransformer<String> transformer = new SqlTransformer.SqlTransformerBuilder<String>()
//                .batch(5).tableName("Pessoa").dialect(SqlDialect.POSTGRES).build();
//        String output = transformer.generate(schema, 10);
//        System.out.println(output);

        List<Pessoa> objects = faker.collection(() -> new Pessoa(
                        faker.number().positive(),
                        faker.name().firstName(),
                        faker.cpf().valid(false),
                        faker.internet().emailAddress()))
                .maxLen(5)
                .generate();
        System.out.println(objects);
        repository.saveAll(objects);
    }

}
