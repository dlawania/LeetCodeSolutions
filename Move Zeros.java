class Solution {
    public void moveZeroes(int[] nums) {
        //int l = nums.length;
        //int i=0;
        //while(i<l){
        //    if(nums[i]==0){
        //        for(int j=i;j<l-1;j++){
        //            nums[j]=nums[j+1];
        //        }
        //        nums[l-1]=0;
        //        l--;
        //    }
        //    else
        //        i++;
        //}
        
        int zcount=0;
        int cpos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                zcount++;
            else{
                nums[cpos]=nums[i];
                cpos++;
            }
        }
        int i = cpos+zcount;
        while(cpos<i){
            nums[cpos]=0;
            cpos++;
        }
            
    }
}