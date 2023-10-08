package poo.avaliacaora02;

import java.util.Random;

/**
 *
 * @author renan
 */
public class AvaliacaoRA02 {

    public static void main(String[] args) {

        ArvoreAVL arvoreAVL = new ArvoreAVL();
        ArvoreBinariaDeBusca arvoreBinaria = new ArvoreBinariaDeBusca();

        Random randomSeed = new Random();
        Random random = new Random(randomSeed.nextInt());

        int numDeOperacoes = 500;
        int[] elementos = new int[numDeOperacoes];

        for (int i = 0; i < numDeOperacoes; i++) {
            elementos[i] = random.nextInt(numDeOperacoes / 2);
        }

        long startBin = System.nanoTime();

        for (int i = 0; i < numDeOperacoes; i++) {
            arvoreBinaria.Insere(elementos[i]);
        }

        long finishBin = System.nanoTime();
        long timeElapsedBin = finishBin - startBin;

        long startAVL = System.nanoTime();

        for (int i = 0; i < numDeOperacoes; i++) {
            arvoreAVL.Insere(elementos[i]);
        }

        long finishAVL = System.nanoTime();
        long timeElapsedAVL = finishAVL - startAVL;

        System.out.println("Tempo da inserção na arvore AVL: " + timeElapsedAVL + " ns");
        System.out.println("Tempo da inserção na arvore Binária: " + timeElapsedBin + " ns");

        startBin = System.nanoTime();

        for (int i = 0; i < numDeOperacoes; i++) {
            arvoreBinaria.Busca(elementos[i]);
        }

        finishBin = System.nanoTime();
        timeElapsedBin = finishBin - startBin;

        startAVL = System.nanoTime();

        for (int i = 0; i < numDeOperacoes; i++) {
            arvoreAVL.Busca(elementos[i]);
        }

        finishAVL = System.nanoTime();
        timeElapsedAVL = finishAVL - startAVL;

        System.out.println("Tempo da Busca na arvore AVL: " + timeElapsedAVL + " ns");
        System.out.println("Tempo da Busca na arvore Binária: " + timeElapsedBin + " ns");

        startBin = System.nanoTime();

        for (int i = 0; i < numDeOperacoes; i++) {
            arvoreBinaria.Remove(elementos[i]);
        }

        finishBin = System.nanoTime();
        timeElapsedBin = finishBin - startBin;

        startAVL = System.nanoTime();

        for (int i = 0; i < numDeOperacoes; i++) {
            arvoreAVL.Remove(elementos[i]);
        }

        finishAVL = System.nanoTime();
        timeElapsedAVL = finishAVL - startAVL;

        System.out.println("Tempo da Remoção na arvore AVL: " + timeElapsedAVL + " ns");
        System.out.println("Tempo da Remoção na arvore Binária: " + timeElapsedBin + " ns");
    }
}
