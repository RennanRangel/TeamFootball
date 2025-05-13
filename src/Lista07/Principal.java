package Lista07;

public class Principal {
    public static void main(String[] args) {

        Time time = new Time("Vitoria", "Thiago Carpini");

        ((Time) time).contratarJogador("Lionel Messi", 10);
        time.contratarJogador("Neymar", 11);
        time.contratarJogador("Luiz Suarez", 9);
        time.contratarJogador("Matheusinho", 30);
        time.contratarJogador("Iniesta", 8);




        listarJogadoresEscalados(time);


    }

    private static void listarJogadoresEscalados(Time time) {
        System.out.println("Jogadores Escalados:");
        for (Jogador jogador : time.obterEscalacao()) {
            System.out.println(jogador);
        }

    }



}