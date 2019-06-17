package animal.DadosDoAnimal;

import animal.TipoDeAtendimentoNoPetShop;
import animal.ValoresDosServicosPrestados.ValorBanhoETosa;
import animal.ValoresDosServicosPrestados.ValorDoAtendimento;

public class AnimalASerAtendido {
    private TipoDeAtendimentoNoPetShop tipoDeAtendimentoNoPetShop;
    private double valorDoAtendimento;
    private String nome;
    private double peso;
    private EspecieDoAnimal especieDoAnimal;

    public AnimalASerAtendido(String nome, double peso, EspecieDoAnimal especieDoAnimal, TipoDeAtendimentoNoPetShop tipoDeAtendimentoNoPetShop, ValorDoAtendimento valorDoAtendimento) {
        this.nome = nome;
        this.peso = peso;
        this.especieDoAnimal = especieDoAnimal;
        this.tipoDeAtendimentoNoPetShop = tipoDeAtendimentoNoPetShop;
        this.valorDoAtendimento = valorDoAtendimento.valorDoAtendimento();
        //usar aqui a interface com valores
    }

    public String nomeDoAnimalASerAtendido() {
        return nome;
    }

    public double pesoDoAnimalASerAtendido() {
        return peso;
    }

    public EspecieDoAnimal especieDoAnimalASerAtendido() {
        return especieDoAnimal;
    }

}
