# JogoDaVelha
Trabalho de conclusão do curso de extensão sobre Git e GitHub da UFCI-MG, Campus V.

##  Sobre o projeto

Este projeto consiste no desenvolvimento de um **Jogo da Velha** utilizando a linguagem Java e os princípios da **Programação Orientada a Objetos (POO)**, com o objetivo de aplicar os conhecimentos adquiridos sobre **Git e GitHub**, incluindo versionamento de código, criação de branches, commits, Issues e Pull Requests.

##  Tecnologias utilizadas

- **Java** — Linguagem de programação.
- **IntelliJ IDEA** — Ambiente de desenvolvimento integrado (IDE).
- **Git** — Sistema de controle de versão.
- **GitHub** — Plataforma de hospedagem e colaboração.
- **Programação Orientada a Objetos** — Paradigma utilizado na estruturação do projeto.

##  Funcionamento do jogo

O Jogo da Velha é disputado em um tabuleiro de 3 linhas e 3 colunas, totalizando 9 posições.

Os jogadores realizam suas jogadas alternadamente, utilizando os símbolos `X` e `O`.

O objetivo é preencher três posições consecutivas com o mesmo símbolo, seja horizontalmente, verticalmente ou diagonalmente.

### Representação do tabuleiro

```text
 0 | 1 | 2
---+---+---
 3 | 4 | 5
---+---+---
 6 | 7 | 8
```

Cada número representa uma posição que poderá ser escolhida durante a partida.

##  Estrutura do projeto

O projeto foi organizado em classes com responsabilidades específicas:

| Classe          | Responsabilidade                                                |
| --------------- |-----------------------------------------------------------------|
| `Main`          | Inicialização do programa e apresentação dos menus.             |
| `Jogador`       | Classe abstrata que define comportamentos comuns aos jogadores. |
| `JogadorHumano` | Representação do jogador controlado pelo usuário.               |
| `JogadorRobo`   | Representação do jogador controlado pelo computador.            |
| `Tabuleiro`     | Armazenamento e gerenciamento das posições do jogo.             |
| `Partida`       | Gerenciamento do andamento.                                     |

##  Funcionalidades

As funcionalidades previstas para o projeto incluem:

-  Estruturação inicial das classes.
-  Representação do tabuleiro com nove posições.
-  Criação dos menus iniciais.
-  Implementação completa das jogadas.
-  Validação das posições escolhidas.
-  Alternância entre jogadores.
-  Implementação das jogadas do computador.
-  Verificação de vitória.
-  Identificação de empate.
-  Finalização e reinício de partidas.

*Os itens devem ser atualizados conforme o desenvolvimento do projeto.*

##  Como executar

### Pré-requisitos

- Java Development Kit (JDK) instalado.
- IntelliJ IDEA ou outra IDE compatível com Java.
- Git instalado, caso deseje clonar o repositório.

### Execução

1. Clone o repositório:

   ```bash
   git clone <URL-DO-REPOSITORIO>
   ```

2. Abra o projeto no IntelliJ IDEA.

3. Configure o JDK do projeto.

4. Definir a pasta `src` como `source root`

5. Localize a classe `Main.java`.

6. Execute o método `main()`.

##  Versionamento com Git e GitHub

O desenvolvimento utiliza boas práticas de versionamento, incluindo:

- Criação de branches para novas funcionalidades e correções.
- Commits com mensagens descritivas.
- Utilização de Issues para organizar tarefas.
- Pull Requests para revisão e integração de alterações.
- Integração das funcionalidades à branch principal (`main`).

### Exemplos de branches

```text
feat/implementar-jogada
feat/add-jogadorRobo
feat/add-cond-vitoria
```

### Exemplos de commits

```bash
git commit -m "feat(jogadorHumano): implementação de realizarJogada()
"
git commit -m "feat(Partida): implementação da classe partida
"
git commit -m "feat(Partida): add condição de vitória
"
```

##  Conceitos aplicados

Durante o desenvolvimento, são explorados conceitos como:

- Classes e objetos.
- Atributos e métodos.
- Construtores.
- Encapsulamento.
- Herança.
- Classes e métodos abstratos.
- Polimorfismo.
- Sobrescrita de métodos.
- Arrays e estruturas condicionais.
- Organização e reutilização de código.

##  Licença

Projeto desenvolvido para fins acadêmicos e de aprendizagem.
