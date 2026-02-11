package daa.model.strategypattern.algorithms;

import daa.model.strategypattern.instances.Instance;
import daa.model.strategypattern.solutions.Solution;
import daa.model.strategypattern.instances.MatrixInstance;
import daa.model.strategypattern.solutions.MatrixSolution;

public class MatrixColumnProductAlgorithm implements Algorithm {
  private int[] columnToArray(int[][] matrix, int columnSelect) {
    int[] column = new int[matrix.length];
    for (int i = 0; i < column.length; i++) {
      column[i] = matrix[i][columnSelect];
    }
    return column;
  }
  
  private int arraysProduct(int[] firstArray, int[] secondArray) {
    int sum = 0;
    for (int i = 0; i < firstArray.length; i++) {
      sum += firstArray[i] * secondArray[i];
    }
    return sum;
  }
  
  @Override
  public Solution solve(Instance input) {
    if (!canHandle(input)) {
      throw new IllegalArgumentException("I only handle matrices!");
    }
    MatrixInstance inputMatrix = (MatrixInstance) input;
    final int rows = inputMatrix.firstMatrix().length;
    final int columns = inputMatrix.firstMatrix()[0].length;
    int[][] productMatrix = new int[rows][columns];
    for (int i = 0; i < productMatrix.length; i++) {
      for (int j = 0; j < productMatrix.length; j++) {
        productMatrix[j][i] = arraysProduct(
            inputMatrix.firstMatrix()[j], 
            columnToArray(inputMatrix.secondMatrix(), i)
        );
      }
    }
    return new MatrixSolution(productMatrix);
  }

  @Override
  public boolean canHandle(Instance input) {
    if (input instanceof MatrixInstance matrix) {
      if (matrix.firstMatrix() == null || matrix.secondMatrix() == null || 
        matrix.firstMatrix().length == 0 || matrix.secondMatrix().length == 0) {
          return false;
        }
        int columnsA = matrix.firstMatrix()[0].length;
        int rowsB = matrix.secondMatrix().length;
        return columnsA == rowsB;
      }
    return false;
  }
}