package ordenacao;

public enum TiposOrdenacao {
    CRESCENTE(new OrdenacaoCrescente()),
    DECRESCENTE(new OrdenacaoDecrescente()),
    ALEATORIO(new OrdenacaoAleatoria());

    private final Ordenacao ordenacao;

    TiposOrdenacao(Ordenacao ordenacao) {
        this.ordenacao = ordenacao;
    }

    public Ordenacao getOrdenacao() {
        return ordenacao;
    }
}
