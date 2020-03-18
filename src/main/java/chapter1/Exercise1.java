package chapter1;

public class Exercise1 {
  public static void main(String[] args){
    exerciseOne();
  }

  public static void exerciseOne(){
    // Give the value of each of the following expressions:
    // a. (0 + 15) / 2
    // b. 2.0e-6 * 100000000.1
    // c. true && false || true && true
    int resultA = (0 + 15) / 2;
    double resultB = 2.0e-6 * 100000000.1;
    boolean resultC = true && false || true && true;

    System.out.println("a) " + resultA);
    System.out.println("b) " + resultB);
    System.out.println("c) " + resultC);
  }
}
