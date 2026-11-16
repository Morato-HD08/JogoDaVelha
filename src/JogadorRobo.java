public class JogadorRobo extends Jogador{
    public JogadorRobo(){

    }

    @Override
    public boolean realizarJogada(int posicao, Tabuleiro tabuleiroAtual) {
        if(posicao<0 && posicao>8){
            return false;
        }
        if(tabuleiroAtual.getPosicao(posicao).equals("-")){
            tabuleiroAtual.setPosicoes("O", posicao);
            return true;
        }
        return false;
    }
}
