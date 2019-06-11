package animal;

public enum TipoDeAtendimentoNoPetShop {
    VETERINARIO(50.00),
    BANHO(25.00),
    BANHO_E_TOSA(50.00);

    private double valorDoAtendimento;

    TipoDeAtendimentoNoPetShop(double valorDoAtendimento) {
        this.valorDoAtendimento = valorDoAtendimento;
    }

    public double valorDoAtendimento() {
        return valorDoAtendimento;
    }
}
