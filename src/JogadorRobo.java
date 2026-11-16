public class JogadorRobo extends Jogador{
    public JogadorRobo(){

    }

    @Override
    public boolean realizarJogada(int posicao, Tabuleiro tabuleiroAtual) {
        jogada(tabuleiroAtual);
        return false;
    }

    public boolean jogada(Tabuleiro tabuleiroAtual){
        for(int i=0; i<tabuleiroAtual.getPosicoes().length; i++){
            if(tabuleiroAtual.getPosicao(i).equals("-")){
                tabuleiroAtual.setPosicao("O", i);
                return true;
            }
        }
        return false;
    }
}
