package funcionario.Salarios;
//REGRA DE NEGOCIO DO VALOR DO SALARIO DO VETERINARIO, ESSA REGRA AO SER ALTERADA NAO AFETA AS OUTRAS, PODENDO SER ESTENDIDA MAS NAO MODIFICADA
//PODE SER POSSÍVEL APLICAR UM IMPOSTO EM CIMA DO SALARIO POR EXEMPLO

public class SalarioDoVeterinario implements SalarioDoProfissinal {
    public double valorDoSalarioDoProfissional() {
        return 5000;
    }
}
