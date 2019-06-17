package funcionario;

import java.util.List;

public class TotalDosGastosComPagamentoDeFuncionario {
    public double somatorioDeTodosOsSalarios(List<Funcionario> funcionario) {
        double valorTotalDosSalarios = 0;
       for (Funcionario f : funcionario)
            valorTotalDosSalarios += f.salarioDoFuncionario();

        return valorTotalDosSalarios;
    }
}
