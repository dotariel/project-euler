package project.euler.problems

import project.euler.util.Core

class Problem_07 {
  public static void main(String[] args) {
    println new Problem_07().getLastPrime(10001).last()
  }

  public int getLastPrime(int limit) {
    Core.getPrimesTo(limit).last()
  }
}
