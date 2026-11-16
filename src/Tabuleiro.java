public class Tabuleiro {
    private String[] posicoes = {"-","-","-","-","-","-","-","-","-"} ;

    public Tabuleiro() {
        this.posicoes= new String[]{"-","-","-","-","-","-","-","-","-"};
    }

    public String getPosicao(int i) {
        return posicoes[i];
    }
    public void setPosicao(String valor, int posicao) {
        posicoes[posicao] = valor;
    }

    public String[] getPosicoes() {
        return posicoes;
    }

    public void exibirTabuleiro(){
        System.out.printf("\n %s | %s | %s \n",  posicoes[0], posicoes[1], posicoes[2]);
        System.out.println("---+---+---");
        System.out.printf(" %s | %s | %s \n",  posicoes[3], posicoes[4], posicoes[5]);
        System.out.println("---+---+---");
        System.out.printf(" %s | %s | %s \n",  posicoes[6], posicoes[7], posicoes[8]);
        System.out.println("---+---+---");
    }

    public void limparTabuleiro(){
        for(int i=0; i<posicoes.length; i++){
            setPosicao("-", i);
        }
    }
}
