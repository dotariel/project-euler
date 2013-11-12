package project.euler

class Problem_09 {
  public static void main(String[] args) {
    int product = 1
    new Problem_09().getTriplets(1000).each { product *= it }

    println product
  }

  public List<Integer> getTriplets(int total) {
    List<Integer> numbers = []

    (1..total).each { c ->
      (1..total).each { b -> 
        int a = Math.sqrt(sqr(c) - sqr(b))  
        if (addsUp(a,b,c,total) && isTriplet(a,b,c)) {
          // println "a=${a}; b=${b}; c=${c}; total=${(a+b+c)}; addsUp=${addsUp(a,b,c,total)}"
          numbers = [a,b,c]
        }
      }      
    }
    
    numbers
  }

  public boolean isTriplet(int a, int b, int c) {
    (sqr(a) + sqr(b) == sqr(c)) && (a < b) && (b < c)
  }

  private boolean isSquare(int n) {
    Math.sqrt(n) == (int)Math.sqrt(n)
  }

  private boolean addsUp(int a, int b, int c, int total) {
    a + b + c == total
  }

  private int sqr(int a) {
    Math.pow(a,2)
  }
}
