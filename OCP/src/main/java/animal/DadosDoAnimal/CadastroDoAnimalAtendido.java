package animal.DadosDoAnimal;

import animal.TipoDeAtendimentoNoPetShop;
import animal.ValoresDosServicosPrestadosNoPetShop.ValorDoAtendimento;
//UTILIZADO INJEÇÃO DE DEPENDÊNCIA PARA O VALOR DE ATENDIMENTO, ASSIM, SE ALGUMA REGRA FOR ALTERADA NO ATENDIMENTO, OU SE TIVER UM NOVO TIPO DE ATENDIMENTO
//NÃO IRÁ MODIFICAR A CLASSE DO CADASTRO
public class CadastroDoAnimalAtendido {
    private TipoDeAtendimentoNoPetShop tipoDeAtendimentoNoPetShop;
    private double valorDoAtendimento;
    private String nome;
    private double peso;
    private EspecieDoAnimal especieDoAnimal;

    public CadastroDoAnimalAtendido(String nome, double peso, EspecieDoAnimal especieDoAnimal, TipoDeAtendimentoNoPetShop tipoDeAtendimentoNoPetShop, ValorDoAtendimento valorDoAtendimento) {
        this.nome = nome;
        this.peso = peso;
        this.especieDoAnimal = especieDoAnimal;
        this.tipoDeAtendimentoNoPetShop = tipoDeAtendimentoNoPetShop;
        this.valorDoAtendimento = valorDoAtendimento.valorDoAtendimento();
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

    public double valorDoAtendimento() {
        return valorDoAtendimento;
    }
}
