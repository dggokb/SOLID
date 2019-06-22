package animal;

import animal.DadosDoAnimal.CadastroDoAnimalAtendido;

import java.util.List;

//CASO TENHA ALGUM MOTIVO PARA TER ALGUM NOVO TIPO DE RECEBIMENTO A SER ADICIONADO NOS VALORES, A CLASSE ANIMALASERATENDIDO NAO SOFRE ALTERAÇÃO

public class TotalRecebidoDosAtendimentos {
    public double somatorioDosValoresRecebidosDosAtendimentos(List<CadastroDoAnimalAtendido> cadastroDoAnimalAtendido) {
         return cadastroDoAnimalAtendido.stream().mapToDouble(CadastroDoAnimalAtendido::valorDoAtendimento).sum();
    }
}
