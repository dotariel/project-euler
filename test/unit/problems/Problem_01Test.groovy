package project.euler.problems

import org.junit.*

class Problem_01Test {

  /*
  If we list all the natural numbers below 10 that 
  are multiples of 3 or 5, we get 3, 5, 6 and 9. 
  The sum of these multiples is 23.
  
  Find the sum of all the multiples of 3 or 5 below 1000.
  */

  @Test
  void should_include_number_in_summation() {
    assert !new Problem_01().shouldAdd(1)
    assert !new Problem_01().shouldAdd(2)
    assert !new Problem_01().shouldAdd(4)
    assert !new Problem_01().shouldAdd(7)

    assert new Problem_01().shouldAdd(3)
    assert new Problem_01().shouldAdd(5)
    assert new Problem_01().shouldAdd(6)
  }

  @Test
  void should_compute_correct_sum() {
    assert new Problem_01().run(10) == 23
    assert new Problem_01().run(1000) == 233168
  }
}
