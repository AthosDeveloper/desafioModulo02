package desafioModulo02;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {

      public static void main(String[] args) {
          Random aleatorio = new Random();
          Scanner sc = new Scanner(System.in);
          int varia = 0;
          int pontos = 0;
          int nivel = 0;
          String resposta = "nao";
          int numero = 0;
int vezes = 0;
int vitoria = 0;
int derrota = 0;
          do {
              System.out.println("Defina o nível desejado: 1 para o mais fácil e 3 para o mais difícil: ");
              nivel = sc.nextInt();

              if (nivel == 1) {
                  System.out.println("Escolha um número de 0 a 2.");
                  numero = sc.nextInt();
                  varia = aleatorio.nextInt(3);
       if (numero == varia) {
                      System.out.println("Você escolheu o número: " + numero + " e o número gerado foi: " + varia);
                      System.out.println("Você acertou!");
                      vitoria ++;
                      pontos += 10;
                  } else {
                      System.out.println("Você perdeu! O número sorteado era: " + varia);
                      derrota ++;
                  }
              } else if (nivel == 2) {
                  System.out.println("Escolha um número de 0 a 4.");
                  numero = sc.nextInt();
                  varia = aleatorio.nextInt(5);
                  if (numero == varia) {
                      System.out.println("Você escolheu o número: " + numero + " e o número gerado foi: " + varia);
                      System.out.println("Você acertou!");
pontos += 10;
vitoria ++;
                  } else if (numero == varia - 1 || numero == varia + 1) {
         System.out.println("Seu número escolhido está próximo do número sorteado.");
                      pontos += 5;
                  } else {
                      System.out.println("Você perdeu! O número sorteado era: " + varia);
                      derrota ++;
                  }
              } else if (nivel == 3) {
                  System.out.println("Escolha um número de 0 a 9.");
                  numero = sc.nextInt();
                  varia = aleatorio.nextInt(10);

                  if (numero == varia) {
                      System.out.println("Você escolheu o número: " + numero + " e o número gerado foi: " + varia);
                      System.out.println("Você acertou!");
                      pontos += 10;
                      vitoria ++;
                  } else if (numero == varia - 1 || numero == varia + 1) {
                      System.out.println("Seu número escolhido está próximo do número sorteado.");
                      pontos += 5;
                  } else {
                      System.out.println("Você perdeu! O número sorteado era: " + varia);
                      derrota ++;
                  }
              } else {
                  System.out.println("Nível inválido!");
                  continue;
              }
vezes ++;
              System.out.println("Você deseja jogar novamente? (Sim ou Não)");
              resposta = sc.next().toLowerCase();
          } while (!resposta.equals("nao"));

          System.out.println("Pontuação final: " + pontos + " você jogou: " + vezes + " vezes " + " vitórias: " + vitoria + " erros: " + derrota);
      }
}

