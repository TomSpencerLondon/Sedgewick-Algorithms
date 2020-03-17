package chapter1;

import java.util.Arrays;
import java.util.Collections;

public class SmallestRectangle {
  public static void main (String[] args)
  {

    Integer xCoordinates[] = { 4, 3, 6, 1, -1, 12 };
    Integer yCoordinates[] = { 4, 1, 10, 3, 7, -1 };
    int n = xCoordinates.length;

    printRect(xCoordinates, yCoordinates, n);
  }

  // function to print coordinate of smallest rectangle
  static void printRect(Integer X[], Integer Y[], int n)
  {

    // find Xmax and Xmin
    int Xmax = Collections.max(Arrays.asList(X));
    int Xmin = Collections.min(Arrays.asList(X));

    // find Ymax and Ymin
    int Ymax = Collections.max(Arrays.asList(Y));
    int Ymin = Collections.min(Arrays.asList(Y));

    // print all four coordinates
    System.out.println("{" + Xmin + ", " + Ymin + "}");
    System.out.println("{" + Xmin + ", " + Ymax + "}");
    System.out.println("{" + Xmax + ", " + Ymax + "}");
    System.out.println("{" + Xmax + ", " + Ymin + "}");
  }

}
