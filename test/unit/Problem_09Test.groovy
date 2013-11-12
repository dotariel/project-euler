package project.euler

import org.junit.*

class Problem_09Test {
  /*
  A Pythagorean triplet is a set of three natural numbers, 
  a < b < c, for which,
    a^2 + b^2 = c^2

  For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

  There exists exactly one Pythagorean triplet for which 
  a + b + c = 1000.

  Find the product abc.

  You need to find the a, b, and c such that 
  both a^2 + b^2 = c^2 and a + b + c = 1000. 
  Then you need to output the product a * b * c.
  */

  @Test
  void should_get_triplets() {
    assert new Problem_09().getTriplets(12) == [3,4,5]
    assert new Problem_09().getTriplets(12) == [3,4,5]
  }

  @Test
  void should_determine_triplet() {
    assert !new Problem_09().isTriplet(5,4,3)
    assert !new Problem_09().isTriplet(1,2,3)
    assert new Problem_09().isTriplet(3,4,5)
  }
}
