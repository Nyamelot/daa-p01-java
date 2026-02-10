package daa;

import java.util.Arrays;
import daa.utils.MatrixGenerator;

public class Main {
  public String getGreeting() {
        return "Hello World!";
    }
    public static void main(String[] args) {
      System.out.println(Arrays.deepToString(new MatrixGenerator()
          .generate(1)));
    }
}