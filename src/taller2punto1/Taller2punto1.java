
package taller2punto1;

public class Taller2punto1 
{
    int minDist(int arr[], int n, int p, int q) 
    {
        int i = 0;
        int min_dist = Integer.MAX_VALUE;
        int prev=0;
       
        for (i = 0; i < n; i++) 
         {
            if (arr[i] == p || arr[i] == q) 
            {
                prev = i;
                break;
            }
        }
 
        for (; i < n; i++) 
        {
            if (arr[i] == p || arr[i] == q) 
            {
               
                if (arr[prev] != arr[i] && (i - prev) < min_dist) 
                {
                    min_dist = i - prev;
                    prev = i;
                } 
                else
                    prev = i;
            }
        }
 
        return min_dist;
    }
 
    public static void main(String[] args) {
        Taller2punto1  min = new Taller2punto1 ();
        int arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        int n = arr.length;
        int x = 3;
        int y = 6;
 
        System.out.println("la minima distancia es " + x + " and " + y
                + " is " + min.minDist(arr, n, x, y));
    }
}
