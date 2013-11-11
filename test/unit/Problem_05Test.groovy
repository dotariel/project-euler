package project.euler

import org.junit.*

class Problem_05Test {
  /*
  2520 is the smallest number that can be divided by each 
  of the numbers from 1 to 10 without any remainder.

  What is the smallest positive number that is evenly 
  divisible by all of the numbers from 1 to 20?
  */

  @Test
  void should_determine_smallest_number_evenly_divisible_by_all() {
    assert 60   == new Problem_05().getSmallestDivisible(1,5)
    assert 2520 == new Problem_05().getSmallestDivisible(1,10)
  }

  @Test
  void should_determine_greatest_common_divisor() {
    assert 4  == new Problem_05().gcd(8, 12)
    assert 4  == new Problem_05().gcd(24, 28)
    assert 14 == new Problem_05().gcd(14, 84)
  }
}