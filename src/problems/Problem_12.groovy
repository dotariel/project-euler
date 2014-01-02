package project.euler.problems

class Problem_12 extends Problem {

  public static void main(String[] args) {
    println new Problem_12().getFirstWithDivisorCount(500)
  }

  public int getTriangleNumber(int count) {
    (1..count).sum()
  }

  public List<Integer> getTriangleNumberSequence(int count) {
    (1..count).collect { i -> getTriangleNumber(i) }
  }

  public int getFirstWithDivisorCount(int divisorCount) {
    int n = 1
    int triangle = 1
    boolean shouldStop = false

    while (!shouldStop) {
      triangle = getTriangleNumber(n)
      def factors = getFactors(triangle)
      shouldStop = (factors.size() > divisorCount)
      n++
    }

    triangle
  }

}