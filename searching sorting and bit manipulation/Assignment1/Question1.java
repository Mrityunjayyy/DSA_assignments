package Assignment1;

import javax.crypto.spec.PSource;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/** Q1. Write a program to sort an array in descending order using bubble sort.
  Input Array {3,5,1,6,0}
  Output Array: {6, 5, 3, 1, 0} */

public class Question1 {

    public static void bubbleSort(int[] nums)
    {  int n = nums.length ;
        boolean isSwapped = false;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n - i -1  ; j++)
            {
                if(nums[j+1] > nums[j])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    isSwapped= true;
                }
            }

            if(!isSwapped)
            { break; }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array: ");
        for(int i = 0 ; i < n ; i++)
        { arr[i] = in.nextInt(); }

        bubbleSort(arr);

        System.out.println("After bubble sort: ");
        for(int a : arr)
        {
            System.out.print(a + " ");
        }

    }
}
