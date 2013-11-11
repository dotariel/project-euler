package project.euler

class Problem_07 {
  public static void main(String[] args) {
    println new Problem_07().getPrimeNumbers(10001).last()
  }

  public List<Integer> getPrimeNumbers(int index) {
    def list = []
    int i = 2

    while (list.size() < index) {
      if (isPrime(i)) { list << i }
      i++  
    }

    list
  }

  private List<Long> getFactors(Long number) {
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

  private boolean isPrime(Long number) {
    def factors = getFactors(number)
    factors == [1,number] || factors == [number]
  }

  private boolean isFactor(Long number, Long factor) {
    (number % factor == 0)
  }

}
