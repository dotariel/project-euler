package project.euler

import org.junit.*

class Problem_04Test {
  /*
  A palindromic number reads the same both ways. 
  The largest palindrome made from the product of 
  two 2-digit numbers is 9009 = 91 × 99.

  Find the largest palindrome made from the product of 
  two 3-digit numbers.
  */

  @Test
  void should_get_largest_palindrome() {
    assert new Problem_04().getPalindromes(1).max() == 9
    assert new Problem_04().getPalindromes(2).max() == 9009
  }

}