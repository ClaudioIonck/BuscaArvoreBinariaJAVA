package br.com.example.arvorebusca;

import java.util.Scanner;

public class ArvoreBusca {

    public static NoArvore construirBusca(int[] valores) {
        NoArvore raiz = null;
        for (int valor : valores) {
            raiz = inserirBusca(raiz, valor);
        }
        return raiz;
    }

    public static NoArvore inserirBusca(NoArvore raiz, int valor) {
        if (raiz == null) {
            return new NoArvore(valor);
        }
        if (valor < raiz.getValor()) {
            raiz.setEsquerda(inserirBusca(raiz.getEsquerda(), valor));
        } else {
            raiz.setDireita(inserirBusca(raiz.getDireita(), valor));
        }
        return raiz;
    }

    public static int somaIntervaloBusca(NoArvore raiz, int inicial, int valorFinal) {
        return somaIntervaloBuscaRecursivo(raiz, inicial, valorFinal);
    }

    private static int somaIntervaloBuscaRecursivo(NoArvore raiz, int inicial, int valorFinal) {
        if (raiz == null) {
            return 0;
        }
        if (inicial <= raiz.getValor() && raiz.getValor() <= valorFinal) {
            return raiz.getValor() + somaIntervaloBuscaRecursivo(raiz.getEsquerda(), inicial, valorFinal) + somaIntervaloBuscaRecursivo(raiz.getDireita(), inicial, valorFinal);
        } else if (raiz.getValor() < inicial) {
            return somaIntervaloBuscaRecursivo(raiz.getDireita(), inicial, valorFinal);
        } else {
            return somaIntervaloBuscaRecursivo(raiz.getEsquerda(), inicial, valorFinal);
        }
    }
}
