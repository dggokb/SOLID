package PetShop;

import animal.DadosDoAnimal.CadastroDoAnimalAtendido;
import animal.TotalRecebidoDosAtendimentos;
import funcionario.Funcionario;
import funcionario.TotalDosGastosComPagamentoDeFuncionario;

import java.util.List;

public class BalancoFinanceiroDoPetShop {
    public BalancoFinanceiroDoPetShop() {
    }

    private double calculoReferenteAFuncionariosDoPetShop(List<Funcionario> funcionario) {
        TotalDosGastosComPagamentoDeFuncionario totalDosGastosComPagamentoDeFuncionario = new TotalDosGastosComPagamentoDeFuncionario();
        return totalDosGastosComPagamentoDeFuncionario.somatorioDeTodosOsSalarios(funcionario);
    }

    private double calculoReferenteAValorDosAnimaisAtendidos(List<CadastroDoAnimalAtendido> cadastroDoAnimalAtendido) {
        TotalRecebidoDosAtendimentos totalRecebidoDosAtendimentos = new TotalRecebidoDosAtendimentos();
        return totalRecebidoDosAtendimentos.somatorioDosValoresRecebidosDosAtendimentos(cadastroDoAnimalAtendido);
    }

    public double totalDoBalancoFinanceiroDoPetShop(List<Funcionario> funcionario,
                                                    List<CadastroDoAnimalAtendido> cadastroDoAnimalAtendido) {
        return calculoReferenteAValorDosAnimaisAtendidos(cadastroDoAnimalAtendido) - calculoReferenteAFuncionariosDoPetShop(funcionario);
    }
}
