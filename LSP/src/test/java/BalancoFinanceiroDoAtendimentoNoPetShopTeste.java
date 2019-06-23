import PetShop.BalancoFinanceiroDoPetShop;
import animal.DadosDoAnimal.CadastroDoAnimalAtendido;
import animal.DadosDoAnimal.EspecieDoAnimal;
import animal.TipoDeAtendimentoNoPetShop;
import animal.ValoresDosServicosPrestadosNoPetShop.ValorDoBanho;
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
    public void deveConseguirRequisitarUmBalancoFinanceiroDoPetShop() {
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
        TipoDeAtendimentoNoPetShop tipoDeAtendimentoNoPetShop = TipoDeAtendimentoNoPetShop.BANHO;
        ValorDoBanho valorDoBanho = new ValorDoBanho();
        CadastroDoAnimalAtendido animaisAtendidosNoPetShop = new CadastroDoAnimalAtendido(
                nomeDoAnimal,
                peso,
                espcieDoAnimal,
                tipoDeAtendimentoNoPetShop,
                valorDoBanho);
        List<Funcionario> funcionario = Arrays.asList(primeiroFuncionario,segundoFuncionario);
        List<CadastroDoAnimalAtendido> animal = Arrays.asList(animaisAtendidosNoPetShop);

        BalancoFinanceiroDoPetShop balancoFinanceiroDoPetShop = new BalancoFinanceiroDoPetShop();

        Assertions.assertThat(valorDoBalancoFinanceiroEsperado)
                .isEqualTo(balancoFinanceiroDoPetShop.totalDoBalancoFinanceiroDoPetShop(funcionario, animal));
    }
}