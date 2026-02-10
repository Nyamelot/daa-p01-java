package daa.model.strategypattern.algorithms;

import daa.model.strategypattern.instances.Instance;
import daa.model.strategypattern.solutions.Solution;

public interface Algorithm {
  Solution solve(Instance input);
  boolean canHandle(Instance input);
}