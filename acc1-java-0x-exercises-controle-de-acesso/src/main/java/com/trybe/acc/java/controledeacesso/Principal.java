package com.trybe.acc.java.controledeacesso;

import java.util.Scanner;

public class Principal {

  /**
   * Método principal.
   * 
   * @author rafael
   */
  public static void main(String[] args) {
    // ESCREVA SEU CÓDIGO AQUI
    Scanner scanner = new Scanner(System.in);

    float totalAcessos = 0;
    float deMenor = 0;
    float deMaior = 0;
    float maiorQ50 = 0;
    short opcao = 1;

    do {
      System.out.println("Entre com o número correspondente à opção desejada:\n"
          + "1 - Acessar o estabelecimento\n" + "2 - Finalizar sistema e mostrar relatório");
      opcao = scanner.nextShort();
      if (opcao == 1) {
        totalAcessos += 1;
        System.out.println("Entre com a idade:");
        int idadePessoa = scanner.nextInt();
        if (idadePessoa < 18) {
          System.out.println("Pessoa cliente menor de idade, catraca liberada!");
          deMenor += 1;
        } else if (idadePessoa < 50) {
          System.out.println("Pessoa adulta, catraca liberada!");
          deMaior += 1;
        } else {
          System.out.println("Pessoa adulta maior de 50, catraca liberada!");
          maiorQ50 += 1;
        }
      }
      if (opcao == 2) {
        break;
      }
      if (opcao != 1) {
        System.out.println("Entre com uma opção válida");
      }
    } while (opcao == 1);

    if (totalAcessos > 0) {
      float porcDeMenor = ((deMenor * 100) / totalAcessos);
      float porcentagemDeMaior = ((deMaior * 100) / totalAcessos);
      float percentagemMaiorQ50 = ((maiorQ50) * 100 / totalAcessos);
      System.out.println("----- Quantidade -----\n" + "menores: " + deMenor + " \n" + "adultas: "
          + deMaior + " \n" + "maiores que 50: " + maiorQ50 + " \n \n" + "----- Percentual -----\n"
          + "menores: " + porcDeMenor + "% \n" + "adultas: " + porcentagemDeMaior + "% \n"
          + "maiores que 50: " + percentagemMaiorQ50 + "% \n \n" + "TOTAL: " + totalAcessos);
    } else {
      System.out.println("Opção Inválida");
    }
  }
}
