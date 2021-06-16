import java.util.*;
import java.io.*;

public class Non {
 public int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            if(arr[mid]<x)
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
  public static void main(String args[]) throws IOException {

    //write your code here
    Scanner sc = new Scanner(System.in);
    int t  = sc.nextInt();
    Main ob = new Main();
    while(t>0)
    {
       t--;
      int n = sc.nextInt();
      int a[] = new int[n];
      int i,k=0;
      for(i=0;i<n;i++)
        a[i] = sc.nextInt();
      int d = sc.nextInt();
      //Arrays.sort(a);
      int j=n-1;
      i=0;
      if(n>=2)
      {
      while(i<j)
      {
        int n1 = a[i] + a[j];
        if(n1==d)
        {
          k++;
          System.out.println(i+" "+j);
          break;
        }
        else if(n1<d)
        i++;
        else if(n1>d)
        j--;
      }
      if(k==0)
      System.out.println("no");
      }
      else
      System.out.println("no");
    }

  }
}
