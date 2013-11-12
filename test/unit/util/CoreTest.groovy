package project.euler.util

import org.junit.*

class CoreTest {

  @Test
  void should_get_factors() {
    assert Core.getFactors(10)  == [1, 2, 5, 10]
    assert Core.getFactors(100) == [1, 2, 4, 5, 10, 20, 25, 50, 100]
  }

  @Test
  void should_get_prime_factors() {
    assert Core.getPrimeFactors(48)     == [1, 2, 3]
    assert Core.getPrimeFactors(13195)  == [1, 5, 7, 13, 29]    
    assert Core.getPrimeFactors(99)     == [1, 3, 11]
    assert Core.getPrimeFactors(100)    == [1, 2, 5]
  }

  @Test
  void should_get_specified_number_prime_numbers() {
    assert [2, 3, 5, 7, 11, 13] == Core.getPrimesTo(6) 
  }

  @Test
  void should_get_prime_numbers_through_specific_value() {
   assert [2, 3, 5, 7, 11, 13] == Core.getPrimesBelow(15)  
  }
}