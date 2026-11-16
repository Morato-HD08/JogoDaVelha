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

    public int verificarVitoria(Tabuleiro tabuleiro){
        for(int i=0; i<=6; i+=3){
            if(tabuleiro.getPosicao(i).equals(tabuleiro.getPosicao(i+1)) && tabuleiro.getPosicao(i).equals(tabuleiro.getPosicao(i+2)) && !tabuleiro.getPosicao(i).equals("-")){
                if(tabuleiro.getPosicao(i).equals("X")){
                    return 1;
                }else{
                    return 2;
                }
            }
        }

        if(tabuleiro.getPosicao(0).equals(tabuleiro.getPosicao(4)) && tabuleiro.getPosicao(0).equals(tabuleiro.getPosicao(8)) && !tabuleiro.getPosicao(0).equals("-")){
            if(tabuleiro.getPosicao(2).equals("X")){
                return 1;
            }else{
                return 2;
            }
        }
        if(tabuleiro.getPosicao(2).equals(tabuleiro.getPosicao(4)) && tabuleiro.getPosicao(2).equals(tabuleiro.getPosicao(6)) && !tabuleiro.getPosicao(2).equals("-")){
            if(tabuleiro.getPosicao(2).equals("X")){
                return 1;
            }else{
                return 2;

            }
        }

        for(int i=0;i<3;i++){
            if(tabuleiro.getPosicao(i).equals(tabuleiro.getPosicao(i+3)) && tabuleiro.getPosicao(i).equals(tabuleiro.getPosicao(i+6)) && !tabuleiro.getPosicao(i).equals("-")){
                if(tabuleiro.getPosicao(i).equals("X")){
                    return 1;
                }else{
                    return 2;
                }
            }
        }
        return 0;
    }
}
