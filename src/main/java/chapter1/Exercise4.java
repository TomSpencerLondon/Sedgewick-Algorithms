package chapter1;

public class Exercise4 {
  public static void main(String[] args){
    System.out.println(exerciseFour(1, 0.45));
  }

  // check if x and y are between 0 and 1
  public static boolean exerciseFour(double x, double y){
    if ((x < 1 && x > 0) && (y < 1 && y > 0)){
      return true;
    }
    return false;
  }
}
