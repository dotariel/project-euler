package project.euler.problems

import org.junit.*

class Problem_07Test {
  /*
  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
  we can see that the 6th prime is 13.

  What is the 10 001st prime number?
  */

  @Test
  void should_get_last_prime_number() {
    assert new Problem_07().getLastPrime(6) == 13 // [2, 3, 5, 7, 11, 13]
  } 
}
