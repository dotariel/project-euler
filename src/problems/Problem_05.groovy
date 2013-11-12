package project.euler.problems

class Problem_05 {
  public static void main(String[] args) {
    println new Problem_05().getSmallestDivisible(1, 20)
  }

  public int getSmallestDivisible(int min, int max) {
    int lcm = 1

    (min..max).each { i ->
      lcm *= (int)(i / gcd(lcm, i))
    }

    lcm
  }

  private int gcd(int min, int max) {
    while (max > 0) {
      min %= max
      if (min == 0) return max
      max %= min
    }
    min
  }

}