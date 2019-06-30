package PetShop;

import animal.DadosDoAnimal.FichaDeCadastro;
import funcionario.Funcionario;

import java.util.List;

public interface BalancoFinanceiro {
    double totalDoBalancoFinanceiro(List<Funcionario> funcionario,
                                    List<FichaDeCadastro> fichaDeCadastroDoAnimalAtendido);
}
