class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0 ;
        int j = 1;


        while(j < nums.length){

            if (nums.length == 0){
                return 0;
            }
    
            if(nums[i] == nums[j]){
                j++;

            }else if(nums[i] != nums[j] ){
             
                nums[i+1] = nums[j] ;
                   i ++ ;
                   j++;
            }
        }
        int[] newArr = Arrays.copyOfRange(nums, 0, i+1);
        return i+1;
        
    }
}