import PetShop.BalancoFinanceiroDoPetShop;
import animal.AnimalASerAtendido;
import animal.TipoDeAtendimentoNoPetShop;
import animal.TipoDoAnimal;
import funcionario.Funcionario;
import funcionario.TiposDeProfissaoDoFuncionario;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import java.util.Arrays;
import java.util.List;

class BalancoFinanceiroDoPetShopTeste {

    @Test
    public void deveConseguirRequisitarUmBalancoFinanceiroDoPetShop() {
        double valorDoBalancoFinanceiroEsperado = -6975.0;

        String nomeDoFuncionario = "Diego";
        int idadeDoFuncionario = 30;
        TiposDeProfissaoDoFuncionario profissaoDoPrimeiroFuncionario = TiposDeProfissaoDoFuncionario.TOSADOR;
        TiposDeProfissaoDoFuncionario profissaoDoSegundoFuncionario = TiposDeProfissaoDoFuncionario.VETERINARIO;
        Funcionario funcionarioDaProfissaoTosador = new Funcionario(profissaoDoPrimeiroFuncionario,nomeDoFuncionario,idadeDoFuncionario);
        Funcionario funcionarioDaProfissaoVeterinario = new Funcionario(profissaoDoSegundoFuncionario,nomeDoFuncionario,idadeDoFuncionario);
        List<Funcionario> funcionariosDoPetShop = Arrays.asList(funcionarioDaProfissaoTosador,funcionarioDaProfissaoVeterinario);

        String nomeDoAnimal = "Max";
        double pesoDoAnimal = 5.00;
        TipoDoAnimal tipoDoAnimal = TipoDoAnimal.CACHORRO;
        TipoDeAtendimentoNoPetShop tipoDeAtendimentoNoPetShopParaOAnimal = TipoDeAtendimentoNoPetShop.BANHO;
        AnimalASerAtendido animalASerAtendido = new AnimalASerAtendido(nomeDoAnimal,pesoDoAnimal,tipoDoAnimal, tipoDeAtendimentoNoPetShopParaOAnimal);
        List<AnimalASerAtendido> animaisAtendidosNoPetShop = Arrays.asList(animalASerAtendido);

        BalancoFinanceiroDoPetShop balancoFinanceiroDoPetShop = new BalancoFinanceiroDoPetShop(funcionariosDoPetShop,animaisAtendidosNoPetShop);

        Assertions.assertThat(valorDoBalancoFinanceiroEsperado).isEqualTo(balancoFinanceiroDoPetShop.totalDoBalancoFinanceiroDoPetShop());
    }
}