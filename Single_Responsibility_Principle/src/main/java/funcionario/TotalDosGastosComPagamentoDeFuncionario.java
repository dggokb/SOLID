package funcionario;

import funcionario.Funcionario;

import java.util.List;

//CASO TENHA ALGUM MOTIVO PARA DESCONTAR ALGUM VALOR NA HORA DE SOMAR OS SALÁRIOS, A CLASSE FUNCIONARIO NAO SOFRE ALTERAÇÃO

public class TotalDosGastosComPagamentoDeFuncionario {
    public double somatorioDeTodosOsSalarios(List<Funcionario> funcionario) {
        double valorTotalDosSalarios = 0;
        for (Funcionario f : funcionario)
            valorTotalDosSalarios += f.salarioDoFuncionario();

        return valorTotalDosSalarios;
    }
}
