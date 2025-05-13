package Lista07;

public enum SituacaoEscalacao {
    TITULAR(11),
    RESERVA(12);

    private final Integer qtdMaxima;


    SituacaoEscalacao(Integer qtdMaxima) {

        this.qtdMaxima = qtdMaxima;
    }

    public Integer getQtdMaxima() {

        return qtdMaxima;
    }
}
