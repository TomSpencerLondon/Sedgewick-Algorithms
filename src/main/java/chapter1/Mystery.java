package chapter1;

public class Mystery {
  public static void main(String[] args){
    System.out.println(mysteryMultiply(2, 25));
  }

  // This method is multiplying the numbers
  // if b is 0 a * b = 0
  // if b is divisible by 2 you get 2 a + 1/2 of b
  // we return the result of the multiplication
  // + a
  //
  public static int mystery(int a, int b){
    if (b == 0)
      return 0;
    if (b % 2 == 0)
      return mystery(a+a, b/2);
    return mystery(a+a, b/2) + a;
  }

  // This method raises 2 to the power 25 for instance
  // it would recurse 25 times
  public static int mysteryMultiply(int a, int b){
    if (b == 0)
      return 1;
    if (b % 2 == 0)
      return mysteryMultiply(a*a, b/2);
    return mysteryMultiply(a*a, b/2) * a;
  }
}
