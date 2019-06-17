package PetShop;
//UNICA ALTERACAO FEITA SERIA O TIPO DE ANIMAL E O TIPO DE ATENDIMENTO, ONDE SERIA ADICIONADO OU REFATORADO EM SEUS ENUM
import animal.DadosDoAnimal.AnimalASerAtendido;
import animal.TotalRecebidoDosAtendimentos;
import funcionario.Funcionario;
import funcionario.TotalDosGastosComPagamentoDeFuncionario;

import java.util.List;

public class BalancoFinanceiroDoPetShop {
    public BalancoFinanceiroDoPetShop() {
    }

    private double calculoReferenteAFuncionario(List<Funcionario> funcionario) {
        TotalDosGastosComPagamentoDeFuncionario totalDosGastosComPagamentoDeFuncionario = new TotalDosGastosComPagamentoDeFuncionario();
        return totalDosGastosComPagamentoDeFuncionario.somatorioDeTodosOsSalarios(funcionario);
    }

    private double calculoReferenteAClientes(List<AnimalASerAtendido> animalASerAtendido) {
        TotalRecebidoDosAtendimentos totalRecebidoDosAtendimentos = new TotalRecebidoDosAtendimentos();
        return totalRecebidoDosAtendimentos.somatorioDosValoresRecebidosDosAtendimentos(animalASerAtendido);
    }

    public double totalDoBalancoFinanceiroDoPetShop(List<Funcionario> funcionario,
                                                    List<AnimalASerAtendido> animalASerAtendido) {
        return calculoReferenteAClientes(animalASerAtendido) - calculoReferenteAFuncionario(funcionario);
    }
}
