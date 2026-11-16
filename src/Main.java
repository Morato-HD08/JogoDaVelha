import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Partida partida = new Partida();
        Tabuleiro tabuleiro = partida.getTabuleiro();
        Jogador humano = partida.getJogador1();
        Jogador robo = partida.getJogador2();
        int escolha=-2;
        Scanner sc = new Scanner(System.in);
        int voltar;
        boolean jogada;

        while (escolha!=-1){
            tabuleiro.limparTabuleiro();
            exibirMenuInicial();
            escolha = sc.nextInt();
            switch(escolha){
                case 1:
                    do{
                        tabuleiro.exibirTabuleiro();

                        System.out.println("Digite a posição desejada: ");
                        int posit = sc.nextInt();

                        do{
                            jogada = humano.realizarJogada(posit, tabuleiro);
                            if(!jogada){
                                System.out.printf("Posição inválida. Tente novamente: ");
                                posit = sc.nextInt();
                            }
                        }while(!jogada);

                        robo.realizarJogada(0, tabuleiro);

                        if(partida.verificarVitoria(tabuleiro)!=0){
                            tabuleiro.exibirTabuleiro();
                            if(partida.verificarVitoria(tabuleiro)==1){
                                System.out.println("Vitória do jogador!");
                            }else{
                                System.out.println("Vitória do robô!");
                            }
                            do{
                                System.out.println("Pressione 1 para voltar ao menu: ");
                                voltar = sc.nextInt();
                            }while (voltar!=1);
                        }
                    }while (partida.verificarVitoria(tabuleiro)==0);

                break;
                case 2:
                    System.out.println("------------REGRAS---------");
                    System.out.println("O jogador deve escolher um valor para posicionar um 'X'. As posições possíveis são mostradas a seguir:");
                    exibirMenuJogada();
                    System.out.println("O jogador que tiver uma sequência de 3 valores iguais (vertical, horizontal ou diagonal) vence.");
                    do{
                        System.out.printf("Pressione 1 para voltar: ");
                        voltar = sc.nextInt();
                    }while(voltar!=1);
                break;
                case 0:
                    System.out.println("Saindo...");
                    escolha=-1;
                break;
            }
        }
    }

    public static void exibirMenuInicial(){
        System.out.println("------------MENU INICIAL-----------");
        System.out.println("1- Iniciar Partida");
        System.out.println("2- Exibir Regras");
        System.out.println("0- Sair");
        System.out.printf("Digite o número de sua ação: ");
    }
    public static void exibirMenuJogada(){
        System.out.println("Posições do tabuleiro: ");
        System.out.println(" 0 | 1 | 2\n" +
                "---+---+---\n" +
                " 3 | 4 | 5\n" +
                "---+---+---\n" +
                " 6 | 7 | 8");
    }
}