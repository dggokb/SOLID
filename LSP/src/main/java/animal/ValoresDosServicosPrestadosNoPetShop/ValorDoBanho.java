package animal.ValoresDosServicosPrestadosNoPetShop;
//REGRA DE NEGOCIO DO VALOR DO BANHO, ESSA REGRA AO SER ALTERADA NAO AFETA AS OUTRAS, PODENDO SER ESTENDIDA MAS NAO MODIFICADA
public class ValorDoBanho implements ValorDoAtendimento {
    public double valorDoAtendimento() {
        return 50;
    }
}
