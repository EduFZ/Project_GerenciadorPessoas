package br.com.attornatus.gerenciadorPessoas.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosPessoa(
        @NotBlank
        String nome,
        @NotBlank
        String dataNascimento,
        @NotNull @Valid DadosEndereco endereco) {

}
