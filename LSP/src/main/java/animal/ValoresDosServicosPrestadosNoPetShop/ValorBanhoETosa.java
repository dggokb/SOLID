package animal.ValoresDosServicosPrestadosNoPetShop;
//REGRA DE NEGOCIO DO VALOR DO BANHO E TOSA, ESSA REGRA AO SER ALTERADA NAO AFETA AS OUTRAS, PODENDO SER ESTENDIDA MAS NAO MODIFICADA
//SE A REGRA DE NEGOCIO DO BANHO NAO EXISTIR, A TOSA NAO EXISTIRA TAMBÉM
public class ValorBanhoETosa implements ValorDoAtendimento {
    public double valorDoAtendimento() {
        ValorDoBanho valorDoBanho = new ValorDoBanho();
        return valorDoBanho.valorDoAtendimento()+70;
    }
}
