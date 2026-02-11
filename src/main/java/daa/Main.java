package daa;

import java.util.List;
import daa.utils.MatrixGenerator;
import daa.controller.EvaluateAlgorithms;
import daa.model.strategypattern.instances.MatrixInstance;
import daa.model.strategypattern.algorithms.MatrixColumnProductAlgorithm;
import daa.model.strategypattern.algorithms.MatrixRowProductAlgorithm;

public class Main {
  public static void main(String[] args) {
    MatrixGenerator generator = new MatrixGenerator();
    EvaluateAlgorithms program = new EvaluateAlgorithms();
    program.evaluate(
      generator.generateVariedInstanceList(10, 10, 50),
      new MatrixRowProductAlgorithm(),
      new MatrixColumnProductAlgorithm()
    );
  }
}