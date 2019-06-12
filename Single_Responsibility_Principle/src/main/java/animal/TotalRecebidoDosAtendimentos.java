package animal;

import java.util.List;

//CASO TENHA ALGUM MOTIVO PARA TER ALGUM NOVO TIPO DE RECEBIMENTO A SER ADICIONADO NOS VALORES, A CLASSE ANIMALASERATENDIDO NAO SOFRE ALTERAÇÃO

public class TotalRecebidoDosAtendimentos {
    public double somatorioDosValoresRecebidosDosAtendimentos(List<AnimalASerAtendido> animalASerAtendido) {
        double valorTotalDosAtendimentos = 0;
        for (AnimalASerAtendido a : animalASerAtendido)
            valorTotalDosAtendimentos += a.tipoDeAtendimentoDoAnimalASerAtendido().valorDoAtendimento();//violando o valor
                                                                                                        //queroAcucar().vouNoVizinho().EntroNaCasa().AbroAGeladeira().PegoAcucar();
                                                                                                        //vizinhoMeEmprestaOAcucar();
        return valorTotalDosAtendimentos;
    }
}
