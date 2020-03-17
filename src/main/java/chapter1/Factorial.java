package chapter1;

public class Factorial {
  public static void main(String[] args){
    System.out.println(factorial(5));
  }

  public static int factorial(int num){
    System.out.println(num);
    if (num == 1){
      return num;
    }
    return num * factorial(num - 1);
  }
}
