package project.euler.problems

import project.euler.util.Util

class Problem_10 {
  public static void main(String[] args) {
    println new Problem_10().getSumOfPrimesBelow(2000000)
  }

  public Long getSumOfPrimesBelow(Long limit) {
    Long total = 0
    for (int i=2; i<limit; i++) {
      if (Util.isPrime(i)) {
        total += i  
      }
    }
    total
  }
}
