package chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise7 {


  public static void main(String[] args) {
    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    List<List<Integer>> numbers = new ArrayList<List<Integer>>(3);
    for (int i = 0; i < 3; i++){
      numbers.add(Arrays.asList(array[i][0], array[i][1], array[i][2]));
    }

    System.out.println(exerciseSeven(numbers));
  }
  public static List<List<Integer>> exerciseSeven(List<List<Integer>> array){
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    for (int i = 0; i < array.size(); i++) {
      List<Integer> col = new ArrayList<Integer>();
      for (List<Integer> row : array) {
        col.add(row.get(i));
      }
      result.add(col);
    }
    return result;
  }
}
