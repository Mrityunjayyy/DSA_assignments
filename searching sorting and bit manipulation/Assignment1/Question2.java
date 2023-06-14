package Assignment1;

/** Q2. WAP to sort an array in descending order using selection sort
 Input Array {3,5,1,6,0}
 Output Array: {6, 5, 3, 1, 0} */

public class Question2 {
    public static void selectionSort(int[] arr)
    {
        int n = arr.length ;
        for(int i =0 ; i < n ; i++)
        {
            int maxIndex = i;
            for(int j = i + 1 ; j < n ; j++)
            {
                if(arr[j]  > arr[maxIndex])
                {
                    maxIndex = j;
                }
            }

            if(maxIndex != i)
            {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = { 3,5,1,6,0};
        selectionSort(nums);
        System.out.println("Descending order after selection sort: ");
        for(int a : nums)
        {
            System.out.print(a  + " ");
        }
    }
}
