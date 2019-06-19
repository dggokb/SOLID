package animal.ValoresDosServicosPrestadosNoPetShop;
//REGRA DE NEGOCIO DO VALOR DO ATENDIMENTO DO VETERINARIO, ESSA REGRA AO SER ALTERADA NAO AFETA AS OUTRAS, PODENDO SER ESTENDIDA MAS NAO MODIFICADA
public class ValorDoAtendimentoVeterinario implements ValorDoAtendimento {
    public double valorDoAtendimento() {
        return 200;
    }
}
