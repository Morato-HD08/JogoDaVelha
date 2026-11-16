public class Main {
    public static void main(String[] args) {
        Jogador a = new JogadorHumano();
        Tabuleiro tabuleiroAtual = new Tabuleiro();

        a.realizarJogada(1, tabuleiroAtual);
        tabuleiroAtual.exibirTabuleiro();
        a.realizarJogada(2, tabuleiroAtual);
        tabuleiroAtual.exibirTabuleiro();
    }
    public static void exibirMenuInicial(){
        System.out.println("------------MENU INICIAL-----------");
        System.out.println("1- Iniciar Partida");
        System.out.println("2- Exibir Regras");
        System.out.println("3- Sair");
        System.out.printf("Digite o número de sua ação: ");
    }
    public static void exibirMenuJogada(){
        System.out.println("\n------------SUA VEZ!-----------");
        System.out.println("Posições do tabuleiro: ");
        System.out.println(" 0 | 1 | 2\n" +
                "---+---+---\n" +
                " 3 | 4 | 5\n" +
                "---+---+---\n" +
                " 6 | 7 | 8");
    }
}