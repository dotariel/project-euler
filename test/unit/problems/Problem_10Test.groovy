package project.euler.problems

import org.junit.*

class Problem_10Test {
  /*
  The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

  Find the sum of all the primes below two million.
  */

  @Test
  void should_get_sum_of_primes() {
    assert 17 == new Problem_10().getSumOfPrimesBelow(10) // 2,3,5,7
    assert 77 == new Problem_10().getSumOfPrimesBelow(20) // 2,3,5,7,11,13,17,19
  }
}
