import javafx.util.Pair;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayPoints {

    //Array is sorted
      public static void isMatch(Point[] points) {
          boolean isMatch = false;
          for (int i = 0; i < points.length - 1; i++) {
              if(points[i].x == points[i + 1].x){
                  if(points[i].y == points[i+1].y){
                      isMatch = true;
                      break;
                  }
              }
          }
          System.out.println(isMatch);
      }
    public static void main(String[] args) {
        Point[] points = new Point[5];

        points[0] = (new Point(1,2));
        points[1] = (new Point(1,3));
        points[2] = (new Point(1,2));
        points[3] = (new Point(3,4));
        points[4] = (new Point(2,2));

        System.out.println(Arrays.toString(points));

        //Sort Array of awt points
        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int xCompare = Integer.compare(o1.x, o2.x);
                if(xCompare == 0)
                    return Integer.compare(o1.y, o2.y);
                else return xCompare;
            }
        });
        System.out.println(Arrays.toString(points));

        isMatch(points);
    }
}
