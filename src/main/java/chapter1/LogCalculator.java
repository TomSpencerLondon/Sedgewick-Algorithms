package chapter1;

public class LogCalculator {

  public static void main(String[] args){
    System.out.println(logCalculator(5));
  }

  public static int logCalculator(double n) {
    if (n < 2)
      return 0;
    return 1 + logCalculator(n / 2);
  }
}
