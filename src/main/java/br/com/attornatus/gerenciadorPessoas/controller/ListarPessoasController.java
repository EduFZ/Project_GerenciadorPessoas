package br.com.attornatus.gerenciadorPessoas.controller;

import br.com.attornatus.gerenciadorPessoas.model.Pessoa;
import br.com.attornatus.gerenciadorPessoas.model.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listar")
public class ListarPessoasController {

    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public List<Pessoa> listar(){
        return repository.findAll();
    }

}
