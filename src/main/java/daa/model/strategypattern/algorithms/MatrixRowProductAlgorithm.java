package daa.model.strategypattern.algorithms;

import daa.model.strategypattern.instances.Instance;
import daa.model.strategypattern.solutions.Solution;
import daa.model.strategypattern.instances.MatrixInstance;
import daa.model.strategypattern.solutions.MatrixSolution;

public class MatrixRowProductAlgorithm implements Algorithm {
  @Override
  public Solution solve(Instance input) {
    MatrixInstance inputMatrix = (MatrixInstance) input;
    return null;
  }

  @Override
  public boolean canHandle(Instance input) {
    return true;
  }
}