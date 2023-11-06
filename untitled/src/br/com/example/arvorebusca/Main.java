package br.com.example.arvorebusca;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Digite os valores da arvore separados por espacos (valores nulos são necessários utilizar um espaço ex.:10 5 15 3 7   18): ");
        String[] valores = scanner.nextLine().trim().split(" +");

        NoArvore raiz = ArvoreBusca.construirBusca(valores);

        System.out.println("Digite o valor inicial do intervalo: ");
        int inicial = scanner.nextInt();

        System.out.println("Digite o valor final do intervalo: ");
        int valorFinal = scanner.nextInt();

        int resultado = ArvoreBusca.somaIntervaloBusca(raiz, inicial, valorFinal);

        System.out.println(
                String.format("A soma dos valores no intervalo [%d, %d] é %d.", inicial, valorFinal, resultado));
    }
}
