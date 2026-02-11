package daa.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;
import daa.model.strategypattern.instances.MatrixInstance;

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
  
  public MatrixInstance generateInstance(int size) {
    return new MatrixInstance(generate(size), generate(size));
  }
  
  public List<MatrixInstance> generateInstanceList(int count, int size) {
    List<MatrixInstance> instances = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      instances.add(generateInstance(size));
    }
    return instances;
  }
  
  public List<MatrixInstance> generateVariedInstanceList(int startSize, int step, int count) {
    List<MatrixInstance> instances = new ArrayList<>();
    int currentSize = startSize;
    for (int i = 0; i < count; i++) {
      instances.add(generateInstance(currentSize));
      currentSize += step;
    }
    return instances;
  }
}