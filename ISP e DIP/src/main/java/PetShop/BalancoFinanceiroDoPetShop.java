package PetShop;

import Atendimentos.TotalRecebidoDosAtendimentos;
import animal.DadosDoAnimal.FichaDeCadastro;
import funcionario.Funcionario;
import funcionario.TotalDosGastosComPagamentoDeFuncionario;

import java.util.List;

/*
O Balanço financeiro do PetShop agora assina um contrato BalancoFinanceiro, ou seja, BalançoFinanceiro se tornou um tipo génerico
podendo ser utilizado em qualquer classe que precise calcular um balanço financeiro, não somente o pet shop, também utilizando ISP
somente quem for necessitar dos métodos do BalancoFinanceiro que irá assinar esse contrato, se algum método novo nele surgir a classe que está
implementando deverá ver se ainda faz sentido assinar esse contrato, porém se ela quiser realizar um balanço financeiro com certeza precisará de
seus novos métodos.
Também foi alterado a Classe FichaDeCadastroDoAnimal, para uma uma abstração utilizando também o DIP, o que precisamos é somente o valor
do cálculo que a ficha de cadastro tem, como é feito esse cálculo a classe BalancoFinanceiroDoPetShop não sabe, Ficha de cadastro se torna mais genérica,
também podendo ser utilizada em outras classes que faça sentido o assinatura de seu contrato.
 */

public class BalancoFinanceiroDoPetShop implements BalancoFinanceiro{
    public BalancoFinanceiroDoPetShop() {
    }

    private double calculoReferenteAFuncionariosDoPetShop(List<Funcionario> funcionario) {
        TotalDosGastosComPagamentoDeFuncionario totalDosGastosComPagamentoDeFuncionario = new TotalDosGastosComPagamentoDeFuncionario();
        return totalDosGastosComPagamentoDeFuncionario.somatorioDeTodosOsSalarios(funcionario);
    }

    private double calculoReferenteAValorDosAnimaisAtendidos(List<FichaDeCadastro> fichaDeCadastroDoAnimalAtendido) {
        TotalRecebidoDosAtendimentos totalRecebidoDosAtendimentos = new TotalRecebidoDosAtendimentos();
        return totalRecebidoDosAtendimentos.somatorioDosValoresRecebidosDosAtendimentos(fichaDeCadastroDoAnimalAtendido);
    }

    public double totalDoBalancoFinanceiro(List<Funcionario> funcionario,
                                           List<FichaDeCadastro> fichaDeCadastroDoAnimalAtendido) {
        return calculoReferenteAValorDosAnimaisAtendidos(fichaDeCadastroDoAnimalAtendido) - calculoReferenteAFuncionariosDoPetShop(funcionario);
    }
}
