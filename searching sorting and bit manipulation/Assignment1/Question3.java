package Assignment1;

/** Q3. WAP to sort an array in decreasing order using insertion sort
 Input Array {3,5,1,6,0}
 Output Array: {6, 5, 3, 1, 0} */

public class Question3 {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1]  < arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 6, 0};
        insertionSort(nums);
        System.out.println("Descending order after insertion sort is: ");
        for(int a : nums)
        {
            System.out.print(a + " ");
        }

    }
}


