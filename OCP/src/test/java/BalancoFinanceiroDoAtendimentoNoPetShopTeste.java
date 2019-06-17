import PetShop.BalancoFinanceiroDoPetShop;
import animal.DadosDoAnimal.AnimalASerAtendido;
import animal.DadosDoAnimal.EspecieDoAnimal;
import funcionario.Funcionario;
import funcionario.Salarios.SalarioDoVeterinario;
import funcionario.TiposDeProfissaoDoFuncionario;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import java.util.Arrays;
import java.util.List;

class BalancoFinanceiroDoAtendimentoNoPetShopTeste {

    @Test
    public void deveConseguirRequisitarUmBalancoFinanceiroDoPetShop() {
        double valorDoBalancoFinanceiroEsperado = -6975.0;

        TiposDeProfissaoDoFuncionario profissaoDoFuncionario =TiposDeProfissaoDoFuncionario.VETERINARIO;
        String nome = "frank";
        int idade = 30;
        Funcionario funcionariosDoPetShop = new Funcionario(profissaoDoFuncionario, nome, idade, new SalarioDoVeterinario());

        double peso = 10;
        EspecieDoAnimal espcieDoAnimal = EspecieDoAnimal.CACHORRO;
        AnimalASerAtendido animaisAtendidosNoPetShop = new AnimalASerAtendido(nome,peso,espcieDoAnimal);
        BalancoFinanceiroDoPetShop balancoFinanceiroDoPetShop = new BalancoFinanceiroDoPetShop();

        List<Funcionario> funcionario = Arrays.asList(funcionariosDoPetShop);
        List<AnimalASerAtendido> animal = Arrays.asList(animaisAtendidosNoPetShop);
        Assertions.assertThat(valorDoBalancoFinanceiroEsperado).isEqualTo(balancoFinanceiroDoPetShop.totalDoBalancoFinanceiroDoPetShop(funcionario,animal));
    }
}