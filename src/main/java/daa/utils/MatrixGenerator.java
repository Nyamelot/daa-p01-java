package daa.utils;

import java.util.random.RandomGenerator;

public class MatrixGenerator {
  private int randomNumber() {
    RandomGenerator generator = RandomGenerator.getDefault();
    return generator.nextInt(1, 100);
  }

  public int[][] generate(int size) {
    int[][] matrix = new int[size][size];
    for (int i = 0; i < matrix.length; ++i) {
      for(int j = 0; j < matrix[i].length; ++j) {
        matrix[i][j] = randomNumber();
      }
    }
    return matrix;
  }
}