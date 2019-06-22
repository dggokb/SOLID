package funcionario.Salarios;

//REGRA DE NEGOCIO DO VALOR DO SALARIO DO TOSADOR, ESSA REGRA AO SER ALTERADA NAO AFETA AS OUTRAS, PODENDO SER ESTENDIDA MAS NAO MODIFICADA
//PODE SER POSSÍVEL APLICAR UM IMPOSTO EM CIMA DO SALARIO POR EXEMPLO
public class SalarioDoTosador implements SalarioDoProfissinal {
    public double valorDoSalarioDoProfissional() {
        return 2000;
    }
}
