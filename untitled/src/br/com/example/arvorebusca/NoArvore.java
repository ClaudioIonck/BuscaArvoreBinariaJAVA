package br.com.example.arvorebusca;

public class NoArvore {

    private int valor;
    private NoArvore esquerda;
    private NoArvore direita;

    public NoArvore(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoArvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvore esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvore getDireita() {
        return direita;
    }

    public void setDireita(NoArvore direita) {
        this.direita = direita;
    }
}
