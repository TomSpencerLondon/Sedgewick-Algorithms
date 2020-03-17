package chapter1;

import java.util.Arrays;

public class OrderReverse {
  public static void main(String[] args){
    int[] list = {1, 2, 3, 4, 5};
    System.out.println(orderReverse(list));
  }

  public static String orderReverse(int[] list) {
    int copy1 = 0;
    int copy2 = 0;


    for (int i = 0; i < list.length - (i + 1); i++) {
      int copy = list[list.length - (i + 1)]; // 6
      list[list.length - (i + 1)] = list[i];
      list[i] = copy;
    }

    return Arrays.toString(list);
  }
}
