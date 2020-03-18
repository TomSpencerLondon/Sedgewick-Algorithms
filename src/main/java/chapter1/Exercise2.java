package chapter1;

public class Exercise2 {

  public static void main(String[] args){
    exerciseTwo();
  }

  public static void exerciseTwo(){
    // Give the type and value of each of the following expressions
    // a. (1 + 2.236) / 2
    // b. 1 + 2 + 3 + 4.0
    // c. 4.1 >= 4
    // 1 + 2 + "3"

    double resultA = (1 + 2.236) / 2;
    double resultB = 1 + 2 + 3 + 4.0;
    boolean resultC = 4.1 >= 4;
    String resultD = 1 + 2 + "3";

    System.out.println("a) " + resultA);
    System.out.println("b) " + resultB);
    System.out.println("c) " + resultC);
    System.out.println("d) " + resultD);
  }
}
