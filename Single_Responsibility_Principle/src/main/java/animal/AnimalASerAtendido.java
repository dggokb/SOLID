package animal;
//UNICA ALTERACAO FEITA SERIA O TIPO DE ANIMAL E O TIPO DE ATENDIMENTO, ONDE SERIA ADICIONADO OU REFATORADO EM SEUS ENUM
public class AnimalASerAtendido {
    private String nome;
    private double peso;
    private TipoDoAnimal tipoDoAnimal;
    private TipoDeAtendimentoNoPetShop tipoDeAtendimentoNoPetShop;
    private double valorDoAtendimento;

    public AnimalASerAtendido(String nome, double peso, TipoDoAnimal tipoDoAnimal, TipoDeAtendimentoNoPetShop tipoDeAtendimentoNoPetShop) {
        this.nome = nome;
        this.peso = peso;
        this.tipoDoAnimal = tipoDoAnimal;
        this.tipoDeAtendimentoNoPetShop = tipoDeAtendimentoNoPetShop;//aqui
        this.valorDoAtendimento = tipoDeAtendimentoNoPetShop.valorDoAtendimento();//nao seria um responsabilidade do animal
    }

    public String nomeDoAnimalASerAtendido() {
        return nome;
    }

    public double pesoDoAnimalASerAtendido() {
        return peso;
    }

    public TipoDoAnimal tipoDoAnimalDoAnimalASerAtendido() {
        return tipoDoAnimal;
    }

    public TipoDeAtendimentoNoPetShop tipoDeAtendimentoDoAnimalASerAtendido() {
        return tipoDeAtendimentoNoPetShop;
    }
}
