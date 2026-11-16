public class Tabuleiro {
    String[] posicoes = {"-","-","-","-","-","-","-","-","-"} ;

    public Tabuleiro() {
        this.posicoes= new String[]{"-","-","-","-","-","-","-","-","-"};
    }

    public String getPosicao(int i) {
        return posicoes[i];
    }
    public void setPosicoes(String valor, int posicao) {
        posicoes[posicao] = valor;
    }
    public void exibirTabuleiro(){
        System.out.printf(" %s | %s | %s \n",  posicoes[0], posicoes[1], posicoes[2]);
        System.out.println("---+---+---");
        System.out.printf(" %s | %s | %s \n",  posicoes[3], posicoes[4], posicoes[5]);
        System.out.println("---+---+---");
        System.out.printf(" %s | %s | %s \n",  posicoes[6], posicoes[7], posicoes[8]);
        System.out.println("---+---+---");
    }
}
