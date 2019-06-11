package PetShop;

import animal.AnimalASerAtendido;
import animal.TotalRecebidoDosAtendimentos;
import funcionario.Funcionario;
import funcionario.TotalDosGastosComPagamentoDeFuncionario;

import java.util.List;

public class BalancoFinanceiroDoPetShop {
    private List<Funcionario> funcionario;
    private List<AnimalASerAtendido> animalASerAtendido;

    public BalancoFinanceiroDoPetShop(List<Funcionario> funcionario,
                                      List<AnimalASerAtendido> animalASerAtendido) {
        this.funcionario = funcionario;
        this.animalASerAtendido = animalASerAtendido;
    }

    private double calculoReferenteAFuncionario() {
        TotalDosGastosComPagamentoDeFuncionario totalDosGastosComPagamentoDeFuncionario = new TotalDosGastosComPagamentoDeFuncionario();
        return totalDosGastosComPagamentoDeFuncionario.somatorioDeTodosOsSalarios(funcionario);
    }

    private double calculoReferenteAClientes() {
        TotalRecebidoDosAtendimentos totalRecebidoDosAtendimentos = new TotalRecebidoDosAtendimentos();
        return totalRecebidoDosAtendimentos.somatorioDosValoresRecebidosDosAtendimentos(animalASerAtendido);
    }

    public double totalDoBalancoFinanceiroDoPetShop() {
        return calculoReferenteAClientes() - calculoReferenteAFuncionario();
    }
}
