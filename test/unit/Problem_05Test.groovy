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
  void should_get_smallest_evenly_divisible_number() {
    assert 2520 == new Problem_05().getSmallestEvenlyDivisble(10)
  }
}