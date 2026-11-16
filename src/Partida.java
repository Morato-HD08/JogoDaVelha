public class Partida {
    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;

    public Partida(){
        this.tabuleiro = new Tabuleiro();
        this.jogador1 = new JogadorHumano();
        this.jogador2 = new JogadorRobo();
    }

    public Tabuleiro getTabuleiro(){
        return tabuleiro;
    }
    public Jogador getJogador1(){
        return jogador1;
    }
    public Jogador getJogador2(){
        return jogador2;
    }
}
