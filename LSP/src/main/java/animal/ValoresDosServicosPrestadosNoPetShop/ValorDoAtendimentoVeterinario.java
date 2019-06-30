package animal.ValoresDosServicosPrestadosNoPetShop;
/*
Removendo a regra de negocio do valor do atendimento da classe FichaDeCadastroDoAnimalAtendido, e utilizando uma interface mais genêrica
como o valorDeAtendimento, isolamos a regra de negócio do valorDeAtendimento, possibilitando que essa classe seja fechada para modificação
e aberta para extensão.
 */
public class ValorDoAtendimentoVeterinario implements ValorDoAtendimento {
    public double valorDoAtendimento() {
        return 200;
    }
}
