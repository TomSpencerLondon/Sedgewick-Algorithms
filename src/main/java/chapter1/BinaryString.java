package chapter1;

public class BinaryString {
  public static void main(String[] args){
    System.out.println(binaryString(5));
  }

  public static String binaryString(int num){
    int binary;
    if (num > 0){
      binary = num % 2;
      return((binaryString(num / 2) + "" + binary));
    }
    return "";
  }
}
