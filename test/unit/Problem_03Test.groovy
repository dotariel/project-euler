package project.euler

import org.junit.*

class Problem_03Test {
  /*
  The prime factors of 13195 are 5, 7, 13 and 29.
  What is the largest prime factor of the number 600851475143 ?
  */

  @Test
  void should_determine_prime() {
    [1, 3, 7, 11, 13].each { testPrime(it, true) }
    [4, 6, 8, 10, 50, 600851475143].each { testPrime(it, false) }
  }

  private testPrime(Long number, boolean expected) {
    assert expected == new Problem_03().isPrime(number)
  }

  @Test
  void should_get_largest_prime_factor() {
    assert new Problem_03().getMaxPrimeFactor(30)           == 5
    assert new Problem_03().getMaxPrimeFactor(100000)       == 5
    assert new Problem_03().getMaxPrimeFactor(11)           == 11
    assert new Problem_03().getMaxPrimeFactor(99)           == 11
    assert new Problem_03().getMaxPrimeFactor(600851475143) == 6857
  }

  @Test
  void should_get_factors() {
    assert new Problem_03().getFactors(10)  == [1, 2, 5, 10]
    assert new Problem_03().getFactors(100) == [1, 2, 4, 5, 10, 20, 25, 50, 100]
  }

  @Test
  void should_get_prime_factors() {
    assert new Problem_03().getPrimeFactors(48)     == [1, 2, 3]
    assert new Problem_03().getPrimeFactors(13195)  == [1, 5, 7, 13, 29]    
    assert new Problem_03().getPrimeFactors(99)     == [1, 3, 11]
    assert new Problem_03().getPrimeFactors(100)    == [1, 2, 5]
  }
}