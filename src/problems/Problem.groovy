package project.euler.problems

public abstract class Problem {

  protected List<Long> getPrimeFactors(Long number) {
    getFactors(number).findAll { isPrime(it) }
  }

  protected List<Long> getFactors(Long number) {
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

  protected List<Long> getPrimesBelow(Long limit) {
    def list = []
    int i = 2

    while (i < limit) {
      if (isPrime(i) && i < limit) { list << i }
      i++  
    }

    list
  }

  protected List<Long> getPrimesTo(int count) {
    def list = []
    int i = 2

    while (list.size() < count) {
      if (isPrime(i)) { list << i }
      i++  
    }

    list
  }

  protected boolean isPrime(Long number) {
    def factors = getFactors(number)
    factors == [1,number] || factors == [number]
  }

  protected boolean isFactor(Long number, Long factor) {
    (number % factor == 0)
  }
}