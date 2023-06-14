package Assignment3;

import java.util.Scanner;

/** Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
 else print “Element not found in array”. Input the size of array, array from user and the element X from user.
 Use Linear Search to find the element. */
public class Question1 {

    public static int findElement(int[] nums , int target)
    {
        int result = -1;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == target)
            {
                return i;
            }

        }
            return result;
    }
    public static void main(String[] args) {
        int n , x;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i =0 ; i < n ;i ++)
        {
            arr[i] = in.nextInt();
        }



        System.out.println("Enter the element you want to find: ");
        x = in.nextInt();

         int a = findElement(arr ,x);
        if(a == -1)
            System.out.println("Element not found in array");
        else
            System.out.println("Element found at index: " + a);

    }
}
