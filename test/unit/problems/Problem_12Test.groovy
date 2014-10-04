package project.euler.problems

import org.junit.Test

class Problem_12Test {

  /*
    The sequence of triangle numbers is generated by adding the natural numbers. 
    So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. 

    The first ten terms would be:
    1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

    Let us list the factors of the first seven triangle numbers:

     1: 1
     3: 1,3
     6: 1,2,3,6
    10: 1,2,5,10
    15: 1,3,5,15
    21: 1,3,7,21
    28: 1,2,4,7,14,28

    We can see that 28 is the first triangle number to have over five divisors.

    What is the value of the first triangle number to have over five hundred divisors?
  */

  def problem = new Problem_12()

  @Test
  void should_generate_triangle_number() {
    assert problem.getTriangleNumber(1) == 1
    assert problem.getTriangleNumber(2) == 3
    assert problem.getTriangleNumber(3) == 6
    assert problem.getTriangleNumber(4) == 10
    assert problem.getTriangleNumber(5) == 15
    assert problem.getTriangleNumber(6) == 21
    assert problem.getTriangleNumber(7) == 28
  }

  @Test
  void should_generate_triangle_number_sequence() {
    assert problem.getTriangleNumberSequence(1) == [1]
    assert problem.getTriangleNumberSequence(2) == [1,3]
    assert problem.getTriangleNumberSequence(3) == [1,3,6]
    assert problem.getTriangleNumberSequence(4) == [1,3,6,10]
    assert problem.getTriangleNumberSequence(10) == [1,3,6,10,15,21,28,36,45,55]
  }

  @Test
  void should_get_factors() {
    assert problem.getFactors(1) == [1]
    assert problem.getFactors(3) == [1,3]
    assert problem.getFactors(6) == [1,2,3,6]
    assert problem.getFactors(10) == [1,2,5,10]
    assert problem.getFactors(15) == [1,3,5,15]
    assert problem.getFactors(21) == [1,3,7,21]
    assert problem.getFactors(28) == [1,2,4,7,14,28]
  }

  @Test
  void should() {
    assert problem.getFirstWithDivisorCount(10) == 120
  }
}