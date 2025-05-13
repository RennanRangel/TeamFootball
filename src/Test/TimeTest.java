package Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Lista07.Time;
import Lista07.SituacaoEscalacao;

public class TimeTest {
    private Time time;

    @BeforeEach
    public void setUp() {
        time = new Time("Time Exemplo", "Técnico Exemplo");
    }

    @Test
    public void devePermitirEscalar11Titulares() {
        for (int i = 1; i <= 11; i++) {
            time.contratarJogador("Jogador" + i, i);
        }


        for (int i = 1; i <= 11; i++) {
            boolean escalado = time.escalarJogador("Jogador" + i, SituacaoEscalacao.TITULAR);
            assertTrue(escalado, "Jogador" + i + " deveria ser escalado como titular.");
        }

        time.contratarJogador("JogadorExtra", 99);
        boolean escaladoExtra = time.escalarJogador("JogadorExtra", SituacaoEscalacao.TITULAR);

        assertFalse(escaladoExtra, "Não deveria permitir escalar mais de 11 titulares.");
    }
}
