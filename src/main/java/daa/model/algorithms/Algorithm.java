package daa.model.algorithms;

import daa.model.Instance;
import daa.model.Solution;

public interface Algorithm {
  Solution solve(Instance input);
}