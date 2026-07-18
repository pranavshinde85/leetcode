class Solution {
     public static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public int findGCD(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length - 1;
       int g =  gcd(nums[0],nums[n]);
       return g;


        
    }
}