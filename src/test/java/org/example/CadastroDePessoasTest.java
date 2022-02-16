package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CadastroDePessoasTest {

    @Test
    @DisplayName(" Deve criar casdatro de pessoas!")
    public void deveCriarCadastroDePessoas() {
        //cenario e execução
        CadastroDePessoas cadastro = new CadastroDePessoas();

        //verificação
        Assertions.assertThat(cadastro.getPessoas()).isEmpty();
    }

    @Test
    @DisplayName("Deve adicionar pessoas")
    public void deveAdicionarPessoa(){

        //cenario
        CadastroDePessoas cadastroDePessoas = new CadastroDePessoas();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Wilson");

        //execução
        cadastroDePessoas.adicionar(pessoa);

        //verificção
        Assertions
                .assertThat(cadastroDePessoas.getPessoas())
                .isNotEmpty()
                .contains(pessoa);
    }

    @Test
    @DisplayName("Nao deve adicionar uma pessoa com nome vazio")
    public void naoDeveAdicionarPessoaComNomeVazio(){

        //cenario
        CadastroDePessoas cadastroDePessoas = new CadastroDePessoas();
        Pessoa pessoa = new Pessoa();

        //execução
        org.junit.jupiter.api.Assertions
                .assertThrows(PessoaSemNomeException.class, () -> cadastroDePessoas.adicionar(pessoa));
    }

    @Test
    @DisplayName("Deve remover pessoas")
    public void removerPessoa(){
        //cenario
        CadastroDePessoas cadastroDePessoas = new CadastroDePessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Wilson");
        cadastroDePessoas.adicionar(pessoa);

        //execução
        cadastroDePessoas.remover(pessoa);

        //verificação
        Assertions.assertThat(cadastroDePessoas.getPessoas()).isEmpty();
    }

    @Test
    @DisplayName(" Deve lançar erro ao passar pessoa inexistente")
    public void deveLançarErroAoRemoverPessoaInexistente(){
        //cenario
        CadastroDePessoas cadastroDePessoas = new CadastroDePessoas();
        Pessoa pessoa = new Pessoa();

        //execução
        org.junit.jupiter.api.Assertions
                .assertThrows(CadastroVazioExeption.class, () -> cadastroDePessoas.remover(pessoa));

    }
}
