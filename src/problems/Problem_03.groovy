package project.euler.problems

class Problem_03 extends Problem {

  public static void main(String[] args) {
    println new Problem_03().getMaxPrimeFactor(600851475143)
  }

  public Long getMaxPrimeFactor(Long number) {
    getPrimeFactors(number).max()
  }
}