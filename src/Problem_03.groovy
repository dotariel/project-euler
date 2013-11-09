package project.euler

class Problem_03 {

  public static void main(String[] args) {
    println new Problem_03().getMaxPrimeFactor(600851475143)
  }

  public Long getMaxPrimeFactor(Long number) {
    getFactors(number).findAll { isPrime(it) }.max()
  }

  public List<Long> getPrimeFactors(Long number) {
    getFactors(number).findAll { isPrime(it) }
  }

  public List<Long> getFactors(Long number) {
    List<Long> factors = []

    for (Long i=1; i<=Math.sqrt(number); i++) {
      if (number % i == 0) {
        Long result = number/i
        if (!factors.contains(result))  factors << result
        if (!factors.contains(i))       factors << i
      }
    }

   factors.sort()
  }

  public boolean isPrime(Long number) {
    def factors = getFactors(number)
    factors == [1,number] || factors == [number]
  }

  private boolean isFactor(Long number, Long factor) {
    (number % factor == 0)
  }
}