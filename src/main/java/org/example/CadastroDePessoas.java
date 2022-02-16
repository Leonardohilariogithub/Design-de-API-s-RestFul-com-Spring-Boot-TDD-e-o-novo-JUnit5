package org.example;

import java.util.ArrayList;
import java.util.List;

public class CadastroDePessoas {

    private List<Pessoa> pessoas;

    public CadastroDePessoas() {
        this.pessoas = new ArrayList<>();
    }

    public List<Pessoa> getPessoas(){
        return this.pessoas;
    }

    public void adicionar(Pessoa pessoa) {
        if (pessoa.getNome() == null){
            throw new PessoaSemNomeException();
        }
        this.pessoas.add(pessoa);
    }

    public void remover(Pessoa pessoa) {
        if (this.pessoas.isEmpty()){
            throw new CadastroVazioExeption();
        }
        this.pessoas.remove(pessoa);
    }
}
