package daa.controller;

import daa.model.strategypattern.algorithms.Algorithm;
import daa.model.strategypattern.instances.MatrixInstance;
import java.util.List;

public class EvaluateAlgorithms {
  public void evaluate(
      List<MatrixInstance> matrixArray, Algorithm firstAlgorithm, Algorithm secondAlgorithm) {
    System.out.println("\n" + "=".repeat(65));
    System.out.printf("%-10s | %-20s | %-20s%n", "Tamaño (N)", "Algoritmo 1 (ms)", "Algoritmo 2 (ms)");
    System.out.println("-".repeat(65));
    for (MatrixInstance instance : matrixArray) {
      int n = instance.firstMatrix().length;
      double time1 = measureExecution(firstAlgorithm, instance);
      double time2 = measureExecution(secondAlgorithm, instance);
      System.out.printf("%-10d | %-20.5f | %-20.5f%n", n, time1, time2);
    }
    System.out.println("=".repeat(65) + "\n");
  }

  private double measureExecution(Algorithm algorithm, MatrixInstance instance) {
    if (!algorithm.canHandle(instance)) {
      return -1.0;
    }
    long startTime = System.nanoTime();
    algorithm.solve(instance);
    long endTime = System.nanoTime();
    return (endTime - startTime) / 1e6;
  }
}