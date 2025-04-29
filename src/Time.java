import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String nomeTecnico;
    private List<Jogador> jogadores = new ArrayList<>();
    private List<Jogador> jogadoresEscalados = new ArrayList<>();

    public Time(String nome, String nomeTecnico) {
        this.nome = nome;
        this.nomeTecnico = nomeTecnico;
    }

    public void contratarJogador(String nome, int numeroCamisa) {
        jogadores.add(new Jogador(nome, numeroCamisa));
    }

    public boolean escalarJogador(String nomeJogador, SituacaoEscalacao situacaoEscalacao) {
        Jogador jogador = encontrarJogador(nomeJogador);
        if (jogador == null || jogador.getSituacaoEscalacao() != null) {
            return false;
        }

        if (calcularQtdJogadores(situacaoEscalacao) >= situacaoEscalacao.getQtdMaxima()) {
            return false;
        }

        jogador.setSituacaoEscalacao(situacaoEscalacao);
        jogadoresEscalados.add(jogador);
        return true;
    }

    private Jogador encontrarJogador(String nomeJogador) {
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equalsIgnoreCase(nomeJogador)) {
                return jogador;
            }
        }
        return null;
    }

    private int calcularQtdJogadores(SituacaoEscalacao situacaoEscalacao) {
        int count = 0;
        for (Jogador jogador : jogadoresEscalados) {
            if (situacaoEscalacao.equals(jogador.getSituacaoEscalacao())) {
                count++;
            }
        }
        return count;
    }

    public void removerJogadorEscalacao(String nomeJogador) {
        Jogador jogador = encontrarJogador(nomeJogador);
        if (jogador != null && jogador.getSituacaoEscalacao() != null) {
            jogadoresEscalados.remove(jogador);
            jogador.setSituacaoEscalacao(null);
        }
    }

    public List<Jogador> obterEscalacao() {
        return jogadoresEscalados;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }


}
