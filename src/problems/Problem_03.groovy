package project.euler.problems

import project.euler.util.Core

class Problem_03 {

  public static void main(String[] args) {
    println new Problem_03().getMaxPrimeFactor(600851475143)
  }

  public Long getMaxPrimeFactor(Long number) {
    Core.getPrimeFactors(number).max()
  }
}