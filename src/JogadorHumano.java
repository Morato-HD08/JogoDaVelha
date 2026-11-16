public class JogadorHumano extends Jogador {
    public JogadorHumano() {

    }
    @Override
    public boolean realizarJogada(int posicao, Tabuleiro tabuleiroAtual) {
        if(posicao<0 || posicao>8){
            return false;
        }
        if(tabuleiroAtual.getPosicao(posicao).equals("-")){
            tabuleiroAtual.setPosicao("X", posicao);
            return true;
        }else{
            return false;
        }
    }
}