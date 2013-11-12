package project.euler.problems

import org.junit.*

class Problem_03Test {
  /*
  The prime factors of 13195 are 5, 7, 13 and 29.
  What is the largest prime factor of the number 600851475143 ?
  */

  @Test
  void should_get_largest_prime_factor() {
    assert new Problem_03().getMaxPrimeFactor(30)           == 5
    assert new Problem_03().getMaxPrimeFactor(100000)       == 5
    assert new Problem_03().getMaxPrimeFactor(11)           == 11
    assert new Problem_03().getMaxPrimeFactor(99)           == 11
    assert new Problem_03().getMaxPrimeFactor(600851475143) == 6857
  }

}