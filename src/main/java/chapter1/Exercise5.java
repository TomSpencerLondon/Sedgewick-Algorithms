package chapter1;

public class Exercise5 {

  public static void main(String[] args){
//    System.out.println(exerciseFive(5));
    System.out.println(binaryConverter(5));
  }

  // 1. convert number to binary with for loop
  public static String exerciseFive(int num){
    String binary = "";
    for (int n = num; n > 0; n /= 2) {
      binary = (n % 2) + binary;
    }

    return binary;
  }

  // 2. convert number to binary with recursion
  public static String binaryConverter(int num){
    int y;
    if (num > 0){
      y = num % 2;
      return (binaryConverter(num / 2) + "" + y);
    }
    return "";
  }
}

