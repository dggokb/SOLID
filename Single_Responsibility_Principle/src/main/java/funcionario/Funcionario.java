package funcionario;
//UNICA ALTERACAO FEITA SERIA O SALARIO DO FUNCIONARIO, ONDE SERIA ADICIONADO OU REFATORADO EM SEUS ENUM
public class Funcionario {
    private TiposDeProfissaoDoFuncionario profissaoDoFuncionario;
    private Double salario;
    private String nome;
    private int idade;

    public Funcionario(TiposDeProfissaoDoFuncionario profissaoDoFuncionario, String nome, int idade) {
        this.profissaoDoFuncionario = profissaoDoFuncionario;
        this.nome = nome;
        this.idade = idade;
        this.salario = profissaoDoFuncionario.valorDoSalario();
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
