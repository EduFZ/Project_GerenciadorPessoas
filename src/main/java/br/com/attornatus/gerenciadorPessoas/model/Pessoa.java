package br.com.attornatus.gerenciadorPessoas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

@Table(name = "pessoas")
@Entity(name = "Pessoa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataNascimento;
    @Embedded
    private Endereco endereco;

    public Pessoa(DadosPessoa dados) {
        this.nome = dados.nome();
        this.dataNascimento = dados.dataNascimento();

        Endereco endPrinc = new Endereco();
        endPrinc.getId();
        endPrinc.getEnderecoPrincipal();
        if (endPrinc.equals(true)) {

            this.endereco = new Endereco(dados.endereco());
        }
    }
}
