package project.euler.problems

class Problem_02 {

  public static void main(String[] args) {
    println new Problem_02().run(3999999)
  }

  public int run(int max) {
    addEvenTerms(getFibonacciSeries(max))
  }

  public int addEvenTerms(List<Integer> series) {
    series.findAll { it % 2 == 0 }.sum()
  }

  public List<Integer> getFibonacciSeries(int max) {
    List<Integer> series = [0,1]

    while (next(series) <= max) {
      series += next(series)
    }

    series
  }

  private int next(List<Integer> series) {
    series[-2] + series[-1]
  }
}
