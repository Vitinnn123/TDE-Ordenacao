public class Ordenacao {
    static int comparacoes = 0;
    static int trocas = 0;
    static final int M = 3; // Número de buckets reduzido para melhor desempenho

    // Node pro Bucket sort
    static class Node {
        int k;
        Node next;
    }

    static Node Last; // Ponteiro Bucket Sort

    // Gnome Sort
    public static void gnomeSort(int[] ar, int n) {
        comparacoes = 0;
        trocas = 0;

        int i = 0;
        while (i < n) {
            comparacoes++;
            if (i == 0 || ar[i - 1] <= ar[i]) { // Verifica ordem e avança
                i++;
            } else { // Troca se tiver fora de ordem e volta
                int tmp = ar[i];
                ar[i] = ar[i - 1];
                ar[i - 1] = tmp;
                trocas++;
                i--;
            }
        }

        System.out.println("\n-GNOME SORT-");
        imprimirVetor(ar, n);
        System.out.println("Comparações: " + comparacoes + " | Trocas: " + trocas);
    }

    // Comb Sort
    public static void combSort(int[] A, int n) {
        comparacoes = 0;
        trocas = 0;

        int sorted = 0;
        int gap = n;
        float shrink = 1.3f;
        int i, sm, aux;

        while (sorted == 0) {
            gap = (int) (gap / shrink);
            if (gap <= 1) {
                gap = 1;
                sorted = 1;
            }

            i = 0;
            while (i < n - gap) {
                sm = gap + i;
                comparacoes++;
                if (A[i] > A[sm]) {
                    aux = A[sm];
                    A[sm] = A[i];
                    A[i] = aux;
                    trocas++;
                    sorted = 0;
                }
                i++;
            }
        }

        System.out.println("\n-COMB SORT-");
        imprimirVetor(A, n);
        System.out.println("Comparações: " + comparacoes + " | Trocas: " + trocas);
    }

    // Bucket Sort (atualizado com contagem de trocas)
    public static Node sort(Node s, int min, int max) {
        if (s == null) return s;
        if (s.next == null) return s; // Evita recursão desnecessária
        if (max == min) {
            for (Last = s; Last.next != null; Last = Last.next);
            return s;
        }

        int div = (max - min + 1) / M;
        if (div < 1) div = 1;

        Node[] head = new Node[M];
        int[] minb = new int[M];
        int[] maxb = new int[M];
        Node t;
        Node aux = new Node();

        int i = 0;
        while (i < M) {
            head[i] = null;
            i++;
        }

        while (s != null) {
            i = (s.k - min) / div;
            if (i < 0) i = 0;
            else if (i >= M) i = M - 1;

            t = s;
            s = s.next;
            t.next = head[i];

            if (head[i] == null) {
                minb[i] = t.k;
                maxb[i] = t.k;
            }

            head[i] = t;
            comparacoes++;
            trocas++; // Faz a contagem de movimentação do elemento pro bucket

            if (t.k > maxb[i]) maxb[i] = t.k;
            if (t.k < minb[i]) minb[i] = t.k;
        }

        t = aux;
        i = 0;
        while (i < M) {
            if (head[i] != null) {
                t.next = sort(head[i], minb[i], maxb[i]);
                for (; t.next != null; t = t.next);
            }
            i++;
        }
        t.next = Last;
        return aux.next;
    }

    public static void bucketSort(int[] arr, int n) {
        comparacoes = 0;
        trocas = 0;

        int i = 1, min = arr[0], max = arr[0];
        while (i < n) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
            i++;
        }

        Node head = null;
        i = n - 1;
        while (i >= 0) {
            Node novo = new Node();
            novo.k = arr[i];
            novo.next = head;
            head = novo;
            i--;
        }

        Node ordenado = sort(head, min, max);

        i = 0;
        while (ordenado != null) {
            arr[i] = ordenado.k;
            ordenado = ordenado.next;
            i++;
        }

        System.out.println("\n-BUCKET SORT-");
        imprimirVetor(arr, n);
        System.out.println("Comparações: " + comparacoes + " | Trocas: " + trocas);
    }

    // Bubble Sort com flag de parada
    public static void bubbleSort(int[] arr, int n) {
        comparacoes = 0;
        trocas = 0;

        int trocou = 1;
        // Continua enquanto tiver ao menos uma troca
        while (trocou == 1) {
            trocou = 0; // Reinicia o controle a cada passagem
            int i = 0;
            // Percorre o vetor comparando pares proximos
            while (i < n - 1) {
                comparacoes++;
                if (arr[i] > arr[i + 1]) { // Se estiver fora de ordem, troca
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    trocas++;
                    trocou = 1; // Marca que houve troca
                }
                i++;
            }
        }

        System.out.println("\n-BUBBLE SORT (FLAG)-");
        imprimirVetor(arr, n);
        System.out.println("Comparações: " + comparacoes + " | Trocas: " + trocas);
    }

    // Selection Sort
    public static void selectionSort(int[] arr, int n) {
        comparacoes = 0;
        trocas = 0;

        int i = 0;
        // Percorre o vetor um elemento por vez
        while (i < n - 1) {
            int min = i; // Assume o elemento atual como o menor
            int j = i + 1;
            while (j < n) {
                comparacoes++;
                if (arr[j] < arr[min]) { // Encontra o menor elemento a direita
                    min = j;
                }
                j++;
            }
            // Troca o menor encontrado com a posição atual
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                trocas++;
            }
            i++;
        }

        System.out.println("\n-SELECTION SORT-");
        imprimirVetor(arr, n);
        System.out.println("Comparações: " + comparacoes + " | Trocas: " + trocas);
    }

    // Cocktail Sort
    public static void cocktailSort(int[] arr, int n) {
        comparacoes = 0;
        trocas = 0;

        int trocou = 1;
        int inicio = 0;
        int fim = n - 1;

        // Percorre o vetor em ambos os sentidos
        while (trocou == 1) {
            trocou = 0;

            // Passagem da esquerda para a direita (como o Bubble)
            int i = inicio;
            while (i < fim) {
                comparacoes++;
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    trocas++;
                    trocou = 1;
                }
                i++;
            }

            fim--; // Reduz o limite do final, já que o maior foi para o fim

            // Passagem da direita para a esquerda (sentido inverso)
            i = fim;
            while (i > inicio) {
                comparacoes++;
                if (arr[i] < arr[i - 1]) { // Se estiver fora de ordem, troca
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    trocas++;
                    trocou = 1;
                }
                i--;
            }

            inicio++; // Avança o início, o menor já está no começo
        }

        System.out.println("\n-COCKTAIL SORT-");
        imprimirVetor(arr, n);
        System.out.println("Comparações: " + comparacoes + " | Trocas: " + trocas);
    }

    // Funções Aux
    public static void copiarVetor(int[] origem, int[] destino, int n) {
        int i = 0;
        while (i < n) {
            destino[i] = origem[i];
            i++;
        }
    }

    public static void imprimirVetor(int[] v, int n) {
        int i = 0;
        while (i < n) {
            System.out.print(v[i] + " ");
            i++;
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {

        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        int n = 20;
        int[] temp = new int[n];

        System.out.println("VETOR 1:");
        copiarVetor(vetor1, temp, n);
        bubbleSort(temp, n);
        copiarVetor(vetor1, temp, n);
        selectionSort(temp, n);
        copiarVetor(vetor1, temp, n);
        cocktailSort(temp, n);
        copiarVetor(vetor1, temp, n);
        gnomeSort(temp, n);
        copiarVetor(vetor1, temp, n);
        combSort(temp, n);
        copiarVetor(vetor1, temp, n);
        bucketSort(temp, n);

        System.out.println("\nVETOR 2:");
        copiarVetor(vetor2, temp, n);
        bubbleSort(temp, n);
        copiarVetor(vetor2, temp, n);
        selectionSort(temp, n);
        copiarVetor(vetor2, temp, n);
        cocktailSort(temp, n);
        copiarVetor(vetor2, temp, n);
        gnomeSort(temp, n);
        copiarVetor(vetor2, temp, n);
        combSort(temp, n);
        copiarVetor(vetor2, temp, n);
        bucketSort(temp, n);

        System.out.println("\nVETOR 3:");
        copiarVetor(vetor3, temp, n);
        bubbleSort(temp, n);
        copiarVetor(vetor3, temp, n);
        selectionSort(temp, n);
        copiarVetor(vetor3, temp, n);
        cocktailSort(temp, n);
        copiarVetor(vetor3, temp, n);
        gnomeSort(temp, n);
        copiarVetor(vetor3, temp, n);
        combSort(temp, n);
        copiarVetor(vetor3, temp, n);
        bucketSort(temp, n);
    }
}
