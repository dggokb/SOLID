package animal;

public enum TipoDeAtendimentoNoPetShop {
    VETERINARIO(50.00),//aqui
    BANHO(25.00),//aqui
    BANHO_E_TOSA(50.00);//valor nao eh um tipo de atendimento,separar!

    private double valorDoAtendimento;

    TipoDeAtendimentoNoPetShop(double valorDoAtendimento) {
        this.valorDoAtendimento = valorDoAtendimento;
    }

    public double valorDoAtendimento() {
        return valorDoAtendimento;
    }
}
