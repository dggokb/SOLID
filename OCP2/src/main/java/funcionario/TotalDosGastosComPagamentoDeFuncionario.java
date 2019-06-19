package funcionario;

import java.util.List;

public class TotalDosGastosComPagamentoDeFuncionario {
    public double somatorioDeTodosOsSalarios(List<Funcionario> funcionario) {
        return funcionario.stream().mapToDouble(Funcionario::salarioDoFuncionario).sum();
    }
}

