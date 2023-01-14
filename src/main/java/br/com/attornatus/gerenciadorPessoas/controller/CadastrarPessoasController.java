package br.com.attornatus.gerenciadorPessoas.controller;

import br.com.attornatus.gerenciadorPessoas.model.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastrar")
public class CadastrarPessoasController {

    @Autowired
    private PessoaRepository repository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosPessoa dadosPessoa) {
        repository.save(new Pessoa(dadosPessoa));
    }

    @PostMapping
    @Transactional
    public void cadastrarEndereco(@RequestBody @Valid DadosEndereco dadosEndereco){enderecoRepository.save(new Endereco(dadosEndereco));}




//    @GetMapping
//    public List<Pessoa> listar(){
//        return repository.findAll();
//    }


}


