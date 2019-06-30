package animal.DadosDoAnimal;

import animal.TipoDeAtendimentoNoPetShop;
import animal.ValoresDosServicosPrestadosNoPetShop.ValorDoAtendimento;
/*
Utilizando uma abstração temos uma inversão de dependência para a composição do valor do atendimento, assim se minha classe
ValorDoAtendimento mudar, minha classe FichaDeCadastroDoAnimalAtendido não sofrerá com essa mudança, pois ela nao sabe como é a regra de negocio
do valor do atendimento.
 */
public class FichaDeCadastroDoAnimalAtendido {
    private String nome;
    private double peso;
    private EspecieDoAnimal especieDoAnimal;
    private TipoDeAtendimentoNoPetShop tipoDeAtendimentoNoPetShop;
    private ValorDoAtendimento valorDoAtendimento;

    public FichaDeCadastroDoAnimalAtendido(String nome,
                                           double peso,
                                           EspecieDoAnimal especieDoAnimal,
                                           TipoDeAtendimentoNoPetShop tipoDeAtendimentoNoPetShop,
                                           ValorDoAtendimento valorDoAtendimento) {
        this.nome = nome;
        this.peso = peso;
        this.especieDoAnimal = especieDoAnimal;
        this.tipoDeAtendimentoNoPetShop = tipoDeAtendimentoNoPetShop;
        this.valorDoAtendimento = valorDoAtendimento;
    }
    public double valorDoAtendimento() {
        return valorDoAtendimento.valorDoAtendimento();
    }
}
