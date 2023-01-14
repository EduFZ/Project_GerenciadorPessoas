package br.com.attornatus.gerenciadorPessoas.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        Long id,
        @NotBlank
        String logradouro,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,
        String numero,
        @NotBlank
        String cidade,
        Boolean enderecoPrincipal) {

}


