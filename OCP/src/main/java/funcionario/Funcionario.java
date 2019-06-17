package funcionario;

import funcionario.Salarios.SalarioDaProfissao;

public class Funcionario {
    private TiposDeProfissaoDoFuncionario profissaoDoFuncionario;
    private double salario;
    private String nome;
    private int idade;

    public Funcionario(TiposDeProfissaoDoFuncionario profissaoDoFuncionario, String nome, int idade, SalarioDaProfissao salario) {
        this.profissaoDoFuncionario = profissaoDoFuncionario;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario.valorDoSalarioDoProfissional();
    }

    public TiposDeProfissaoDoFuncionario profissaoDoFuncionario() {
        return profissaoDoFuncionario;
    }

    public double salarioDoFuncionario() {
        return salario = salario;
    }

    public String nomeDoFuncionario() {
        return nome;
    }

    public int idadeDoFuncionario() {
        return idade;
    }
}
