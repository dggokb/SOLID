import PetShop.BalancoFinanceiro;
import PetShop.BalancoFinanceiroDoPetShop;
import animal.DadosDoAnimal.FichaDeCadastro;
import animal.DadosDoAnimal.FichaDeCadastroDoAnimalAtendido;
import animal.DadosDoAnimal.EspecieDoAnimal;
import Atendimentos.TipoDeAtendimento;
import Atendimentos.ValoresDosServicosPrestadosNoPetShop.ValorDoBanho;
import funcionario.Funcionario;
import funcionario.Salarios.SalarioDoTosador;
import funcionario.Salarios.SalarioDoVeterinario;
import funcionario.TiposDeProfissaoDoFuncionario;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class BalancoFinanceiroDoAtendimentoNoPetShopTeste {

    @Test
    public void deveSerPossívelConseguirRequisitarUmBalancoFinanceiroDoPetShop() {
        double valorDoBalancoFinanceiroEsperado = -6350;

        TiposDeProfissaoDoFuncionario profissaoDoPrimeiroFuncionario = TiposDeProfissaoDoFuncionario.VETERINARIO;
        TiposDeProfissaoDoFuncionario profissaoDoSegundoFuncionario = TiposDeProfissaoDoFuncionario.TOSADOR;
        String nomeDoFuncionario = "Frank";
        int idade = 30;
        Funcionario primeiroFuncionario = new Funcionario(
                profissaoDoPrimeiroFuncionario,
                nomeDoFuncionario,
                idade,
                new SalarioDoVeterinario());
        Funcionario segundoFuncionario = new Funcionario(
                profissaoDoSegundoFuncionario,
                nomeDoFuncionario,
                idade,
                new SalarioDoTosador());
        String nomeDoAnimal = "Max";
        double peso = 10;
        EspecieDoAnimal espcieDoAnimal = EspecieDoAnimal.CACHORRO;
        TipoDeAtendimento tipoDeAtendimento = TipoDeAtendimento.BANHO;
        ValorDoBanho valorDoBanho = new ValorDoBanho();
        FichaDeCadastro animaisAtendidosNoPetShop = new FichaDeCadastroDoAnimalAtendido(
                nomeDoAnimal,
                peso,
                espcieDoAnimal,
                tipoDeAtendimento,
                valorDoBanho);
        List<Funcionario> funcionario = Arrays.asList(primeiroFuncionario,segundoFuncionario);
        List<FichaDeCadastro> animal = Arrays.asList(animaisAtendidosNoPetShop);

        BalancoFinanceiro balancoFinanceiroDoPetShop = new BalancoFinanceiroDoPetShop();

        Assertions.assertThat(valorDoBalancoFinanceiroEsperado)
                .isEqualTo(balancoFinanceiroDoPetShop.totalDoBalancoFinanceiro(funcionario, animal));
    }
}