package com.company;
/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2)
    {
        int arr3 [] = new int[arr1.length+arr2.length];
        int count = 0;
        int x = 0; 
        int y = 0;
        while ((x<arr1.length-1) && (y<arr2.length-1))
        {
            if (arr1[x] < arr2[y])
            {
                arr3[count] = arr1[x];
                count++;
                x++;
            }
            else
            {
                arr3[count] = arr2[y];
                count++;
                y++;
            }
        }
        while(x<arr1.length){
            arr3[count] = arr1[x];
            count++;
            x++;
        }
        while(y<arr2.length){
            arr3[ind] = arr2[y];
            count++;
            y++;        
        }
        return arr3;
    }
}
