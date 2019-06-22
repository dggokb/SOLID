import PetShop.BalancoFinanceiroDoPetShop;
import animal.DadosDoAnimal.CadastroDoAnimalAtendido;
import animal.DadosDoAnimal.EspecieDoAnimal;
import animal.TipoDeAtendimentoNoPetShop;
import animal.ValoresDosServicosPrestadosNoPetShop.ValorDoBanho;
import funcionario.Funcionario;
import funcionario.Salarios.SalarioDoVeterinario;
import funcionario.TiposDeProfissaoDoFuncionario;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class BalancoFinanceiroDoAtendimentoNoPetShopTeste {

    @Test
    public void deveConseguirRequisitarUmBalancoFinanceiroDoPetShop() {
        double valorDoBalancoFinanceiroEsperado = -4950.0;

        TiposDeProfissaoDoFuncionario profissaoDoFuncionario = TiposDeProfissaoDoFuncionario.VETERINARIO;
        String nomeDoFuncionario = "Frank";
        int idade = 30;
        Funcionario funcionariosDoPetShop = new Funcionario(
                profissaoDoFuncionario,
                nomeDoFuncionario,
                idade,
                new SalarioDoVeterinario());

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
        List<Funcionario> funcionario = Arrays.asList(funcionariosDoPetShop);
        List<CadastroDoAnimalAtendido> animal = Arrays.asList(animaisAtendidosNoPetShop);

        BalancoFinanceiroDoPetShop balancoFinanceiroDoPetShop = new BalancoFinanceiroDoPetShop();

        Assertions.assertThat(valorDoBalancoFinanceiroEsperado)
                .isEqualTo(balancoFinanceiroDoPetShop.totalDoBalancoFinanceiroDoPetShop(funcionario, animal));
    }
}