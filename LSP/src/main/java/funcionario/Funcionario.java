package funcionario;

import funcionario.Salarios.SalarioDoProfissinal;

public class Funcionario {
    private TiposDeProfissaoDoFuncionario profissaoDoFuncionario;
    private String nome;
    private int idade;
    private SalarioDoProfissinal salario;

    public Funcionario(TiposDeProfissaoDoFuncionario profissaoDoFuncionario, String nome, int idade, SalarioDoProfissinal salario) {
        this.profissaoDoFuncionario = profissaoDoFuncionario;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public double salarioDoFuncionario() {
        return salario.valorDoSalarioDoProfissional();
    }
}
