abstract public class Jogador {
    private static int Proxid=0;
    private int id;
    private boolean isValido;

    public Jogador() {
        this.id = Proxid++;
    }

    abstract public boolean realizarJogada(int posicao, Tabuleiro tabuleiroAtual);

    public int getId(){
        return id;
    }
}