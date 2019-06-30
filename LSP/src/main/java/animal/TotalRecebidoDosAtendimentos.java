package animal;

import animal.DadosDoAnimal.FichaDeCadastroDoAnimalAtendido;

import java.util.List;

//CASO TENHA ALGUM MOTIVO PARA TER ALGUM NOVO TIPO DE RECEBIMENTO A SER ADICIONADO NOS VALORES, A CLASSE ANIMALASERATENDIDO NAO SOFRE ALTERAÇÃO

public class TotalRecebidoDosAtendimentos {
    public double somatorioDosValoresRecebidosDosAtendimentos(List<FichaDeCadastroDoAnimalAtendido> fichaDeCadastroDoAnimalAtendido) {
         return fichaDeCadastroDoAnimalAtendido.stream().mapToDouble(FichaDeCadastroDoAnimalAtendido::valorDoAtendimento).sum();
    }
}
