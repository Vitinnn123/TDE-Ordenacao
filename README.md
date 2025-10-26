# TDE de Ordenação
- **Disciplina:** Resolução de Problemas Estruturados em Computação
- **Instituição:** Pontifícia Universidade Católica do Paraná    
- **Professor:** Andrey Cabral Meira
- **Aluno:**   
  - Victor Augusto Esmaniotto — [@Vitinnn123](https://github.com/Vitinnn123) 
---

## Objetivo

Este projeto implementa e compara diferentes algoritmos de ordenação: Comb Sort, Gnome Sort, Bucket Sort, além de Bubble Sort com flag de parada, Selection Sort e Cocktail Sort. 
O objetivo é analisar e ranquear o desempenho de cada algoritmo em três vetores distintos, considerando número de trocas e número de interações. 
Os resultados são apresentados em tabelas comparativas, destacando qual algoritmo se saiu melhor em cada cenário.

---

## Estrutura do Projeto

```
/TDE Ordenacao
└── README.md (Documentação do projeto)
  /Código Completo 
  └── Ordenacao.java
```

---

## Comparação Algoritimos de Ordenação

## VETOR 1
### Sequência: 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31

| Algoritmo              | Vetor final                                                                     | Comparações | Trocas |
| ---------------------- | ------------------------------------------------------------------------------- | ----------- | ------ |
| **BUBBLE SORT (FLAG)** | [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31] | 285         | 78     |
| **SELECTION SORT**     | [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31] | 190         | 18     |
| **COCKTAIL SORT**      | [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31] | 162         | 78     |
| **GNOME SORT**         | [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31] | 176         | 78     |
| **COMB SORT**          | [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31] | 129         | 22     |
| **BUCKET SORT**        | [9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 26, 27, 28, 30, 31] | 59          | 59     |

## VETOR 2
### Sequência: 5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32

| Algoritmo              | Vetor final                                                                   | Comparações | Trocas |
| ---------------------- | ----------------------------------------------------------------------------- | ----------- | ------ |
| **BUBBLE SORT (FLAG)** | [5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32] | 19          | 0      |
| **SELECTION SORT**     | [5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32] | 190         | 0      |
| **COCKTAIL SORT**      | [5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32] | 37          | 0      |
| **GNOME SORT**         | [5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32] | 20          | 0      |
| **COMB SORT**          | [5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32] | 110         | 0      |
| **BUCKET SORT**        | [5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32] | 60          | 60     |

## VETOR 3
### Sequência: 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 25, 30, 35, 40, 50, 60, 73, 85, 99

| Algoritmo              | Vetor final                                                                  | Comparações | Trocas |
| ---------------------- | ---------------------------------------------------------------------------- | ----------- | ------ |
| **BUBBLE SORT (FLAG)** | [6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 25, 30, 35, 40, 50, 60, 73, 85, 99] | 380         | 190    |
| **SELECTION SORT**     | [6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 25, 30, 35, 40, 50, 60, 73, 85, 99] | 190         | 10     |
| **COCKTAIL SORT**      | [6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 25, 30, 35, 40, 50, 60, 73, 85, 99] | 190         | 190    |
| **GNOME SORT**         | [6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 25, 30, 35, 40, 50, 60, 73, 85, 99] | 400         | 190    |
| **COMB SORT**          | [6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 25, 30, 35, 40, 50, 60, 73, 85, 99] | 129         | 18     |
| **BUCKET SORT**        | [6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 25, 30, 35, 40, 50, 60, 73, 85, 99] | 66          | 66     |

## Ranking por Trocas 

| Vetor | 1º                                                                                        | 2º               | 3º               | 4º                | 5º                  | 6º               |
| ----- | ----------------------------------------------------------------------------------------- | ---------------- | ---------------- | ----------------- | ------------------- | ---------------- |
| 1     | SELECTION SORT (18)                                                                       | COMB SORT (22)   | BUCKET SORT (59) | BUBBLE SORT (78)  | COCKTAIL SORT (78)  | GNOME SORT (78)  |
| 2     | BUBBLE SORT (0) / SELECTION SORT (0) / COCKTAIL SORT (0) / GNOME SORT (0) / COMB SORT (0) | BUCKET SORT (60) | -                | -                 | -                   | -                |
| 3     | SELECTION SORT (10)                                                                       | COMB SORT (18)   | BUCKET SORT (66) | BUBBLE SORT (190) | COCKTAIL SORT (190) | GNOME SORT (190) |

## Ranking por Comparações

| Vetor | 1º               | 2º              | 3º                                         | 4º                | 5º                   | 6º                   |
| ----- | ---------------- | --------------- | ------------------------------------------ | ----------------- | -------------------- | -------------------- |
| 1     | BUCKET SORT (59) | COMB SORT (129) | COCKTAIL SORT (162)                        | GNOME SORT (176)  | SELECTION SORT (190) | BUBBLE SORT (285)    |
| 2     | BUBBLE SORT (19) | GNOME SORT (20) | COCKTAIL SORT (37)                         | BUCKET SORT (60)  | COMB SORT (110)      | SELECTION SORT (190) |
| 3     | BUCKET SORT (66) | COMB SORT (129) | SELECTION SORT (190) / COCKTAIL SORT (190) | BUBBLE SORT (380) | GNOME SORT (400)     | -                    |

---

## Licença

Este projeto foi desenvolvido **exclusivamente para fins educacionais** na disciplina de *Resolução de Problemas Estruturados em Computação* da Pontifícia Universidade Católica do Paraná.
Não possui finalidade comercial e não concede direitos de uso além do contexto acadêmico.
