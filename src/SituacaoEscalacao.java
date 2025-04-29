public enum SituacaoEscalacao {
    TITULAR(11),
    RESERVA(12);

    private final Integer qtdMaxima;

    // Construtor correto da enum
    SituacaoEscalacao(Integer qtdMaxima) {
        this.qtdMaxima = qtdMaxima;
    }

    public Integer getQtdMaxima() {
        return qtdMaxima;
    }
}
