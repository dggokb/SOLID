package funcionario;

import funcionario.Salarios.SalarioDoProfissinal;
//UTILIZADO INJEÇÃO DE DEPENDÊNCIA PARA O SALARIO DO FUNCIONARIO, ASSIM, SE ALGUMA REGRA NO SALARIO, OU SE TIVER UM NOVO TIPO DE PROFISSAO
//E OU UM SALÁRIO ESPECIFICO, NÃO IRÁ MODIFICAR A CLASSE DO FUNCIONARIO
public class Funcionario {
    private TiposDeProfissaoDoFuncionario profissaoDoFuncionario;
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(TiposDeProfissaoDoFuncionario profissaoDoFuncionario, String nome, int idade, SalarioDoProfissinal salario) {
        this.profissaoDoFuncionario = profissaoDoFuncionario;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario.valorDoSalarioDoProfissional();
    }

    public double salarioDoFuncionario() {
        return salario = salario;
    }
}
