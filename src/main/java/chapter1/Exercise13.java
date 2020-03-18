package chapter1;

import org.w3c.dom.css.ElementCSSInlineStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise13 {

  public static void main(String[] args){
    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    List<List<Integer>> numbers = new ArrayList<>(3);
    for (int i = 0; i < 3; i++){
      numbers.add(Arrays.asList(array[i][0], array[i][1], array[i][2]));
    }

    System.out.println(transposeArray(numbers));
  }

  // Transpose an array of numbers such that:
//  {{1, 2, 3},
//    {4, 5, 6},
//    {7, 8, 9}}
//    becomes:
//  {{1,4,7},
//    {2,5,8},
//    {3,6,9}}
  public static List<List<Integer>> transposeArray(List<List<Integer>> list){
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      List<Integer> col = new ArrayList<>();
      for(List<Integer> row : list){
        col.add(row.get(i));
      }
      result.add(col);
    }
    return result;
  }

}
