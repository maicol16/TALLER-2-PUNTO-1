/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2punto1;

public class Taller2punto1 {

    int minDist(int arr[], int n, int p, int q) 
    {
        int i, j;
        int min_dist = Integer.MAX_VALUE;
        for (i = 0; i < n; i++) 
        {
            for (j = i + 1; j < n; j++) 
            {
                if ((p == arr[i] && q == arr[j]
                    || q == arr[i] && p == arr[j])
                    && min_dist > Math.abs(i - j)) 
                    min_dist = Math.abs(i - j);
            }
        }
        return min_dist;
    }
 
    public static void main(String[] args) 
    {
      Taller2punto1 min = new Taller2punto1();
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int p = 1;
        int q = 6;
 
        System.out.println("Distancia mínima entre" + p + " and " + q 
                + " is " + min.minDist(arr, n, p, q));
    }
}
