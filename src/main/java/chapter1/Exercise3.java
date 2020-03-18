package chapter1;

public class Exercise3 {

  public static void main(String[] args){
   isEqual(5, 5, 5);
  }
  public static void isEqual(int num1, int num2, int num3){
    if (num1 == num2 && num2 == num3) {
      System.out.println("Equal");
    } else {
      System.out.println("Not equal");
    }
  }
}
