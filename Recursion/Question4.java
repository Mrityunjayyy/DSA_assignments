/** Find the sum of the values of the array [92, 23, 15, -20, 10]. */

public class Question4 {
    public static void main(String[] args) {
        int[] arr = { 92, 23, 15, -20, 10 } ;
        System.out.println(returnSum(arr, arr.length));
    }


    public static int returnSum(int[] nums , int n)
    {
        int last = nums[n-1];


        if(n ==1 )
        return nums[0];

        else
        {
            return last + returnSum(nums, n-1);
        }
    }
}
