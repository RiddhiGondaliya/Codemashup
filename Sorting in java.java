/*

Sorting is implemeted in two classes

1> Array class : which is used to sort the simple array

Arrays.sort()
-> Arrays of primitive :-int , char...[Dual pivot quick sort]
->  Arrays of object : Strings, Integer, Students [based on mearge sort adaption of timsort]


2> Collection class : which is used to sort for collections, the collections arelist
implemented classes like ArrayList, LinkedList, Vector

Collectios are used for non-primitive like string , integer, students etc..


Collections.sort : ArrayList, LinkedList..

*/

//Examples of Arrays.sort()
import java.util.Arrays;

public class Test{
    public static void main(String args[])
    {
        int arr1[] = {5,20,12,30};
        char arr2[] = {'B','B', 'A', 'C', 'A'};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2);
    }
    
}
/*O/P  :  [5,12,20,30] 
          [A, A, B, B, C]
*/
/* one more version -> sub array of a given array */

import java.util.*;

public class Test{

    public static void main(String args[]){

        int arr[] {5,30, 20, 10, 8};
        Arrays.sort(arr, 1, 4);  // start indext[1] or end index[4]
        System.out.println(Arrays.sort(arr))
    }
}

// O/P :  [5, 10, 20, 30, 8]

/*sorting array of Non-primitive type of objects */

class Point implements Comparable<point>
{
    int x, y;
    Point(int x, int y)
    {
        this.x =x;
        this.y = y;
    }
    public int compareTo(Point p)
    {
        return this.x = p.x;    }
    
}
class Test{
    public static void main (String args[]){
        Point arr[] = {new Point(10,20), new Point(3, 12), new Point(5,7)};
        Arrays.sort(arr);
        for(int i =0 ; i< arr.length; i++)
        System.out.println(arr[i].x + arr[i].y);    

    }
}

/* O/P  : 3  12
          5  7
          10 20


we can sort non- primitive type of an object only in assending order if we want ot print
in decending order then we have to reverse it
Sorting array of non-primitive type of an object using coparator

*/
class Point {
    int x, y;

    Point(int x , int y)
    {
        this.x = x;
        this.y = y;
    }

class Mycmp implements comparator(Point)
{
    public int compare(Point p1, Point p2){
        return p1.x -p2.x;  
    }
}

class Test{
    public static void main(String args[]){
        Point arr[] = {new Point(10,20), new Point(3, 12), new Point(5,7)};
        Arrays.sort(arr, new Mycmp());
        for(int i =0 ; i< arr.length; i++)
        System.out.println(arr[i].x + arr[i].y);       

    }

}  
    
}

/* using Wrapper class sort the array of primitive type */

class GFG{
    public static void main(String args[]){

        Integer arr[] = {5, 20, 10, 12};
        Arrays.sort(arr, Collections.reverseOrder());// print in decreasing order
        System.out.println(Arrays.toString(arr))
    }
}
 /* O/P : [20,12,20,5] 
 
 Sort the even and odd numbers

 */
class Mycmp implements comparator<Integer>
{
    public int comapare (Integer a, Integer b){
        return a % 2 - b % 2;
    }
}
class GFG {
    public static void main(String args[]){
        Integer arr[] = {5, 20, 10, 3, 12};

        Arrays.sort(arr, new Mycmp());
        System.out.println(Arrays.toString(arr));
    }
}

/* O/P = {20, 10, 12, 5, 3}

Collections.sort() -> it s used to sort the list collections, list collections are the collections
which implememts collection interface... ArraysList and LinkedList
*/

import java.util.*;

class GFG {
    public static void main(String args[]){
        List<Integer>list = new ArrayList<Integer>();
        list.add(10);
        list.add(5);
        list.add(20);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}

/* O/P : [5, 10, 20]
         [20, 10, 5]

  sorting collections list using comparable interface  */
  
  class Point implememts Comparable<Point>
  {
      int x, y;
      Point(int x, int y){
          this.x = x;
          this.y = y;
      }
      public int compareTo(Point p){
          return this.x - p.x;
      }


      class Mycmp implememts Comparator<Point>{
          public int comapare(Point p1, Point p2)
      }

      class GFG {
          public static void main(string arg[]){
              List<Integer>list = new ArrayList<Integer>();
              list.add(new Point(5, 10));
              list.add(new Point(2, 20));
              list.add(new Point(10, 20));

              Collections.sort(list);

              for(Point p :list){
                  System.out.println(p.x + " " + p.y);
              }

          }

          
      }
  }


























