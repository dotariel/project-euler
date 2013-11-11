package project.euler

import org.junit.*

class Problem_06Test {
  /*
  The sum of the squares of the first ten natural numbers is,
    1^2 + 2^2 + ... + 10^2 = 385

  The square of the sum of the first ten natural numbers is,
    (1 + 2 + ... + 10)^2 = 55^2 = 3025
  
  Hence the difference between the sum of the squares of the 
  first ten natural numbers and the square of the sum 
  is 3025 − 385 = 2640.

  Find the difference between the sum of the squares of the 
  first one hundred natural numbers and the square of the sum.
  */

  @Test
  void should_get_sum_of_squares() {
    assert 385 == new Problem_06().getSumOfSquares(10)
  } 

  @Test
  void should_get_square_of_sums() {
    assert 3025 == new Problem_06().getSquareOfSums(10)
  }
}
