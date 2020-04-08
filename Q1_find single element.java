import java.util.Scanner;
class Solution {
    public static int singleNumber(int[] nums) {
        
        //int l = nums.length;
        //int count=0;
        //for(int i=0;i<l-count;i++){
        //    int ch=0;
        //    for (int j=i+1;j<l-count;j++){
         //       if(nums[i]==nums[j])
         //       {
          //          int x = nums[j];
           //         nums[j] = nums[l-count-1];
             //       nums[l-count-1] = x;
               //     count++;
                 //   ch++;
                   // break;
           //     }
            //}
            //if(ch==0)
            //    return nums[i];
        //}
        
        int x=nums[0];
        for(int i = 1; i<nums.length; i++)
            x=x^nums[i];

        return x;
        
    }

    public static void main(String[] args) {
        
        Scanner br = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n=Integer.valueOf(br.nextLine());
        
        int[] nums = new int[n];

        System.out.println("enter the array: ");
        int i=0;
        while(i<n){
            nums[i] = Integer.valueOf(br.nextLine());
            i++;
        }

        int result = singleNumber(nums);
        System.out.println("only number that exists only once in the array is: "+result);

    }
}