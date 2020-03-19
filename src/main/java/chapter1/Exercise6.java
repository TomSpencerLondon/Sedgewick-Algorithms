package chapter1;

import java.util.ArrayList;
import java.util.List;

public class Exercise6 {

  public static void main(String[] args){

    boolean[][] array = {{true, false, true}, {false, true, true}};
    System.out.println(exerciseSix(array));
  }
  public static List<List<String>> exerciseSix(boolean[][] array){
    List<List<String>> result = new ArrayList<List<String>>(array.length);
    for(int i = 0; i < array.length; i++)  {
      result.add(new ArrayList<String>());
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if(array[i][j]){
          result.get(i).add("*");
        }else{
          result.get(i).add(" ");
        }
      }
    }
    return result;
  }
}
