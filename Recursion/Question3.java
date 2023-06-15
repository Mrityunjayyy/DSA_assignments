/** Q3: Print the max value of the array [ 13, 1, -3, 22, 5]. */

public class Question3 {
    public static void main(String[] args) {
        int[] nums = {13 , 1 , -3 , 22 , 5 };

        System.out.println(MaxOfArray(nums , nums.length));
    }


    public static int MaxOfArray(int[] nums ,int n )
    {

        int last = nums[n-1];


        if( n == 1)
            return nums[0];

        else
        {
            return Math.max(last , MaxOfArray(nums , n-1));
        }

    }
}

