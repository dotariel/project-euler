package project.euler.problems

class Problem_04 extends Problem {

  public static void main(String[] args) {
    println new Problem_04().getPalindromes(3).max()
  }

  public List<Integer> getPalindromes(int digits) {
    int min = Math.pow(10, digits - 1)
    int max = Math.pow(10, digits) - 1
    
    List<Integer> palindromes = []

    (min..max).each { i ->
      (i..max).each { j ->
        if (isPalindrome(i * j)) {
          palindromes << (i * j)
        }
      }
    }

    palindromes
  }

  private boolean isPalindrome(int number) {
    "${number}" == "${number}".reverse()
  }
}