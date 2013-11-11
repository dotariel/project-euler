package project.euler

import org.junit.*

class Problem_07Test {
  /*
  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
  we can see that the 6th prime is 13.

  What is the 10 001st prime number?
  */

  @Test
  void should_get_prime_numbers() {
    assert [2, 3, 5, 7, 11, 13] == new Problem_07().getPrimeNumbers(6) 
  } 
}
