package funcionario.Salarios;

/*utilizando herança para criar uma classe imposto ao aplicar uma regra de imposto diferente para cada tipo de funcionario (veterinario,tosador,etc),
suas subclasses teriam que alterar o comportamento do método da classe pai, assim, foi utilizado composicao para que cada funcionario tenha sua regra de imposto separada,
utilizando o manipulador de imposto para aplicar a regra de imposto correta.*/

public class ManipuladorDeImposto {
    public double aplicarImpostoDoVeterinario(double valorASerAplicadoOImposto) {
        return valorASerAplicadoOImposto * .10;
    }

    public double aplicarImpostoDoTosador(double valorASerAplicadoOImposto) {
        return valorASerAplicadoOImposto * .05;
    }
}

