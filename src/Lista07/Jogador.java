package Lista07;

public class Jogador {
    private String nome;
    private Integer numeroCamisa;
    private SituacaoEscalacao situacaoEscalacao;

    public Jogador(String nome, Integer numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {

        return nome;
    }

    public Integer getNumeroCamisa() {

        return numeroCamisa;
    }



    public SituacaoEscalacao getSituacaoEscalacao() {

        return situacaoEscalacao;
    }

    public void setSituacaoEscalacao(SituacaoEscalacao situacaoEscalacao) {
        this.situacaoEscalacao = situacaoEscalacao;
    }

    @Override
    public String toString() {
        return nome + " - Camisa " + numeroCamisa + " - " +
                (situacaoEscalacao != null ? situacaoEscalacao() : "Não Escalado");
    }

    private String situacaoEscalacao() {
        return " ";
    }


}

