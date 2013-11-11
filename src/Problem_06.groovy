package project.euler

class Problem_06 {
  public static void main(String[] args) {
    int a = new Problem_06().getSquareOfSums(100)
    int b = new Problem_06().getSumOfSquares(100)

    println a - b
  }

  public int getSumOfSquares(int max) {
    (1..max).sum { it*it }
  }

  public int getSquareOfSums(int max) {
    Math.pow((1..max).sum { it }, 2)
  }
}
