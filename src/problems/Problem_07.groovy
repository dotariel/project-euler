package project.euler.problems

class Problem_07 extends Problem {

  public static void main(String[] args) {
    println new Problem_07().getLastPrime(10001).last()
  }

  public int getLastPrime(int limit) {
    getPrimesTo(limit).last()
  }
}
