/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizes;

/**
 *
 * @author Gomes
 */
import java.util.Scanner;

public class Matrizes {
    
    // DECLARAÇÃO DO SCANNER COMO STATIC - CORREÇÃO PRINCIPAL
    static Scanner mat = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        
        do {
            exibirMenu();
            opcao = mat.nextInt();
            
            switch (opcao) {
                case 1:
                    exercicio1();
                    break;
                case 2:
                    exercicio2();
                    break;
                case 3:
                    exercicio3();
                    break;
                case 4:
                    exercicio4();
                    break;
                case 5:
                    exercicio5();
                    break;
                case 6:
                    exercicio6();
                    break;
                case 0:
                    System.out.println("\n*** ENCERRANDO O SISTEMA ***");
                    break;
                default:
                    System.out.println("\n*** OPÇÃO INVÁLIDA! ***");
            }
            
            if (opcao != 0) {
                System.out.println("\nPressione ENTER para continuar...");
                mat.nextLine();
                mat.nextLine();
            }
            
        } while (opcao != 0);
        
        mat.close();
    }
    
    public static void exibirMenu() {
        System.out.println("\n===========================================");
        System.out.println("   SISTEMA DE EXERCÍCIOS DE MATRIZES - JAVA     ");
        System.out.println("============================================");
        System.out.println(" 1 - Matriz 4x4: Soma e Média de Pares         ");
        System.out.println(" 2 - Criar Figuras com Matrizes                 ");
        System.out.println(" 3 - Matriz 5x5: Somas (Ímpares/Linhas/Cols)   ");
        System.out.println(" 4 - Matriz 3x5: Repetidos, Pares e Ímpares    ");
        System.out.println(" 5 - Matriz 4x4: Diagonais (Decimais)          ");
        System.out.println(" 6 - Figuras Geométricas com Matrizes          ");
        System.out.println(" 0 - SAIR                                       ");
        System.out.println("===============================================");
        System.out.print("Escolha uma opção: ");
    }
    
    // EXERCÍCIO 1 - Matriz 4x4
    public static void exercicio1() {
        System.out.println("\n=== EXERCÍCIO 1 - MATRIZ 4x4 ===");
        int[][] matriz = new int[4][4];
        int somaPares = 0;
        int contadorPares = 0;
        
        System.out.println("Digite os 16 números da matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = mat.nextInt();
                
                if (matriz[i][j] % 2 == 0) {
                    somaPares += matriz[i][j];
                    contadorPares++;
                }
            }
        }
        
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Soma dos números pares: " + somaPares);
        
        if (contadorPares > 0) {
            double media = (double) somaPares / contadorPares;
            System.out.printf("Média dos números pares: %.2f\n", media);
        } else {
            System.out.println("Não há números pares na matriz.");
        }
    }
    
// EXERCÍCIO 2 - Criar Figuras
    public static void exercicio2() {
        System.out.println("\n=== EXERCÍCIO 2 - FIGURAS COM MATRIZES ===\n");
        
        // Figura a) - Matriz de letras 4x5
        System.out.println("a) Matriz de letras 4x5:");
        char[][] figuraA = {
            {'r', 'g', 'h', 'e', 'j'},
            {'e', 'm', 'n', 'o', 'p'},
            {'q', 'r', 's', 't', 'u'}
        };
        
        for (int i = 0; i < figuraA.length; i++) {
            for (int j = 0; j < figuraA[i].length; j++) {
                System.out.print(figuraA[i][j] + "  ");
            }
            System.out.println();
        }
        
        // Figura b) - Matriz numérica 3x4
        System.out.println("\nb) Matriz numérica 3x4:");
        int[][] figuraB = {
            {19, 25, 100, 99},
            {10, 7, 25, 14},
            {35, 2, 47, 74}
        };
        
        for (int i = 0; i < figuraB.length; i++) {
            for (int j = 0; j < figuraB[i].length; j++) {
                System.out.printf("%4d ", figuraB[i][j]);
            }
            System.out.println();
        }
        
        // Figura c) - Matriz numérica 3x4
        System.out.println("\nc) Matriz numérica 3x4:");
        double[][] figuraC = {
            {1.9, 2.5, 10.0},
            {10.7, 7.8, 2.5},
            {3.5, 2.2, 4.7}
        };
        
        for (int i = 0; i < figuraC.length; i++) {
            for (int j = 0; j < figuraC[i].length; j++) {
                System.out.printf("%5.1f ", figuraC[i][j]);
            }
            System.out.println();
        }
    }

    
    // EXERCÍCIO 3 - Matriz 5x5
    public static void exercicio3() {
        System.out.println("\n=== EXERCÍCIO 3 - MATRIZ 5x5 ===");
        int[][] matriz = new int[5][5];
        int somaImpares = 0;
        int[] somaColunas = new int[5];
        int[] somaLinhas = new int[5];
        
        System.out.println("Digite os 25 números da matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = mat.nextInt();
                
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
                
                somaColunas[j] += matriz[i][j];
                somaLinhas[i] += matriz[i][j];
            }
        }
        
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("a) Soma dos números ímpares: " + somaImpares);
        
        System.out.println("\nb) Soma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            System.out.printf("   Coluna %d: %d\n", j, somaColunas[j]);
        }
        
        System.out.println("\nc) Soma de cada linha:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("   Linha %d: %d\n", i, somaLinhas[i]);
        }
    }
    
    // EXERCÍCIO 4 - Matriz 3x5
    public static void exercicio4() {
        System.out.println("\n=== EXERCÍCIO 4 - MATRIZ 3x5 ===");
        int[][] matriz = new int[3][5];
        boolean temRepetidos = false;
        int qtdPares = 0;
        int qtdImpares = 0;
        
        System.out.println("Digite os 15 números da matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = mat.nextInt();
                
                if (matriz[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (!(i == k && j == l)) {
                            if (matriz[i][j] == matriz[k][l]) {
                                temRepetidos = true;
                                break;
                            }
                        }
                    }
                    if (temRepetidos) break;
                }
                if (temRepetidos) break;
            }
            if (temRepetidos) break;
        }
        
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\n=== RESULTADOS ===");
        if (temRepetidos) {
            System.out.println("a) A matriz POSSUI elementos repetidos.");
        } else {
            System.out.println("a) A matriz NÃO possui elementos repetidos.");
        }
        System.out.println("b) Quantidade de números pares: " + qtdPares);
        System.out.println("c) Quantidade de números ímpares: " + qtdImpares);
    }
    
    // EXERCÍCIO 5 - Matriz 4x4 Decimais
    public static void exercicio5() {
        System.out.println("\n=== EXERCÍCIO 5 - MATRIZ 4x4 DECIMAIS ===");
        double[][] matriz = new double[4][4];
        
        System.out.println("Digite os 16 números decimais da matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = mat.nextDouble();
            }
        }
        
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%8.2f ", matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("a) Diagonal Principal:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("   Posição [%d][%d]: %.2f\n", i, i, matriz[i][i]);
        }
        
        System.out.println("\nb) Diagonal Secundária:");
        for (int i = 0; i < 4; i++) {
            int j = 3 - i;
            System.out.printf("   Posição [%d][%d]: %.2f\n", i, j, matriz[i][j]);
        }
    }
    
   // EXERCÍCIO 6 - Figuras Geométricas
    public static void exercicio6() {
        System.out.println("\n=== EXERCÍCIO 6 - FIGURAS GEOMÉTRICAS ===\n");
        
        // Figura a) - Retângulo 4x4
        System.out.println("a) Retângulo 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("• ");
            }
            System.out.println();
        }
        
          
        // Figura b) - Quadrado 4x4 vazio no meio (apenas bordas)
        System.out.println("\nb) Quadrado 4x4 com bordas (vazio no meio):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Imprime • apenas nas bordas (primeira/última linha ou primeira/última coluna)
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    System.out.print("• ");
                } else {
                    System.out.print("  "); // Espaço vazio no meio
                }
            }
            System.out.println();
        }
        
        // Figura c) - Triângulo crescente
        System.out.println("\nc) Triângulo crescente:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("• ");
            }
            System.out.println();
        }
    }
}
