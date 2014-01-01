package project.euler.util

import org.junit.*

class UtilTest {

  @Test
  void should_get_factors() {
    assert Util.getFactors(10)  == [1, 2, 5, 10]
    assert Util.getFactors(100) == [1, 2, 4, 5, 10, 20, 25, 50, 100]
  }

  @Test
  void should_get_prime_factors() {
    assert Util.getPrimeFactors(48)     == [1, 2, 3]
    assert Util.getPrimeFactors(13195)  == [1, 5, 7, 13, 29]    
    assert Util.getPrimeFactors(99)     == [1, 3, 11]
    assert Util.getPrimeFactors(100)    == [1, 2, 5]
  }

  @Test
  void should_get_specified_number_prime_numbers() {
    assert [2, 3, 5, 7, 11, 13] == Util.getPrimesTo(6) 
  }

  @Test
  void should_get_prime_numbers_through_specific_value() {
   assert [2, 3, 5, 7, 11, 13] == Util.getPrimesBelow(15)  
  }
}