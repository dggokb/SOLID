package funcionario;

public enum TiposDeProfissaoDoFuncionario {

    TOSADOR("Tosador", 2000.00),
    VETERINARIO("Veterinario", 5000.00),
    RECEPCIONISTA("Recepcionista", 1000.00),
    SERVIÇOS_GERAIS("Recepcionista", 1000.00);//valor nao eh um tipo de Da Profissao do Funcionario,separar!

    private String profissao;
    private double salario;

    TiposDeProfissaoDoFuncionario(String profissao, double Salario) {

        this.profissao = profissao;
        this.salario = Salario;
    }

    public String tipoDeProfissao() {
        return profissao;
    }

    public double valorDoSalario() {
        return salario;
    }
}
