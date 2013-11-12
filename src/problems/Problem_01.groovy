package project.euler.problems

class Problem_01 {

  public static void main(String[] args) {
    println new Problem_01().run(1000)
  }

  int run(int boundary) {
    (1..boundary-1).findAll { should_add(it) }.sum()
  }

  boolean should_add(int number) {
    number % 3 == 0 || number % 5 == 0
  }
}