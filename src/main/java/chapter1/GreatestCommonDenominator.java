package chapter1;

public class GreatestCommonDenominator {
  public static void main(String[] args) {
    System.out.println(gcd(150, 100));
  }

  public static int gcd(int num1, int num2){
    if (num2 == 0)
      return num1;
    int modulo = num1 % num2;
    return gcd(num2, modulo);
  }
}
