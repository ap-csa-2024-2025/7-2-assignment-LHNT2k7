import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[] jennys = {8,6,7,5,3,0,9};
    for (int n : jennys)
    {
      System.out.println(n);
    }

    ArrayList<Integer> foo = new ArrayList<Integer>()
    foo.add(new Integer (1));
    foo.add(new Integer (2));
    foo.add(new Integer (5));
    foo.add(new Integer (4));

    for(Integer N : foo)
    {
      System.out.println(N);
      System.out.println(N.intValue());
    }





    Scanner sc = new Scanner(System.in);
    String input = "";

    while (!input.equals("STOP"))
    {
      System.out.println("infinite loop! replace with your code");
    }
  }

  // Problem 2 - HighestNum
  public static Integer highestNum(ArrayList<Integer> arr)
  {
    Integer n = new Integer(0);
    for (Integer N : arr)
    {
      if (N > n)
      {
        n = N;
      }

    }
    return n;
  }

  // Problem 3 - getEvens
  public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
  {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for (Integer N : arr)
    {
      if(N.intValue() % 2 == 0)
       {
        ans.add(N)
       }
    }
    return ans;
  }
}


