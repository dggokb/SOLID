package animal.DadosDoAnimal;

import Atendimentos.TipoDeAtendimento;
import Atendimentos.ValoresDosServicosPrestadosNoPetShop.ValorDoAtendimento;
/*
Utilizando uma abstração temos uma inversão de dependência para a composição do valor do atendimento, assim se minha classe
ValorDoAtendimento mudar, minha classe FichaDeCadastroDoAnimalAtendido não sofrerá com essa mudança, pois ela nao sabe como é a regra de negocio
do valor do atendimento.
 */
public class FichaDeCadastroDoAnimalAtendido implements FichaDeCadastro{
    private String nome;
    private double peso;
    private EspecieDoAnimal especieDoAnimal;
    private TipoDeAtendimento tipoDeAtendimento;
    private ValorDoAtendimento valorDoAtendimento;

    public FichaDeCadastroDoAnimalAtendido(String nome,
                                           double peso,
                                           EspecieDoAnimal especieDoAnimal,
                                           TipoDeAtendimento tipoDeAtendimento,
                                           ValorDoAtendimento valorDoAtendimento) {
        this.nome = nome;
        this.peso = peso;
        this.especieDoAnimal = especieDoAnimal;
        this.tipoDeAtendimento = tipoDeAtendimento;
        this.valorDoAtendimento = valorDoAtendimento;
    }
    public double valorDoAtendimento() {
        return valorDoAtendimento.valorDoAtendimento();
    }
}
