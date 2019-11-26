package isep;

public class DivideMatrix {

    public int [][] matrixIdent (int tamanho) {
        int[][] matrixIdent = new int[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i==j) {
                    matrixIdent[i][j] = 1;
                }
            }
        }
        return matrixIdent;
    }

    public int [] pivot (int [][] matrix1) {
        int linhas1 = matrix1.length;
        int colunas1 = matrix1[0].length;
        int [] vectorPivotPosicao = new int [2];
        int pivot;
        int posicaoPivot;
        for (int i=0; i<linhas1; i++) {
            for (int j=0; j<colunas1; j++) {
                if (matrix1[i][j] != 0) { // o pivot é o primeiro elemento não nulo de uma linha
                    pivot = matrix1[i][j];
                    posicaoPivot = j; //saber onde está o pivot
                    vectorPivotPosicao[0] = pivot;
                    vectorPivotPosicao[1] = posicaoPivot;
                    return vectorPivotPosicao;
                }
            }
        }
        return new int[]{0,0};
    }

    /*public int [][] matrizInversa (int [][] matrix1) {
        int linhas1 = matrix1.length;
        int colunas1 = matrix1[0].length;
        if (linhas1 != colunas1) { //verificar se a matriz é quadrada
            return new int [][]{{0},{0}};
        }
        int [][] matrizIdent = matrixIdent(linhas1); //chamar a função para criar matriz identidade


    }*/

}
