package PetShop;

import animal.DadosDoAnimal.FichaDeCadastroDoAnimalAtendido;
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

    private double calculoReferenteAValorDosAnimaisAtendidos(List<FichaDeCadastroDoAnimalAtendido> fichaDeCadastroDoAnimalAtendido) {
        TotalRecebidoDosAtendimentos totalRecebidoDosAtendimentos = new TotalRecebidoDosAtendimentos();
        return totalRecebidoDosAtendimentos.somatorioDosValoresRecebidosDosAtendimentos(fichaDeCadastroDoAnimalAtendido);
    }

    public double totalDoBalancoFinanceiroDoPetShop(List<Funcionario> funcionario,
                                                    List<FichaDeCadastroDoAnimalAtendido> fichaDeCadastroDoAnimalAtendido) {
        return calculoReferenteAValorDosAnimaisAtendidos(fichaDeCadastroDoAnimalAtendido) - calculoReferenteAFuncionariosDoPetShop(funcionario);
    }
}
