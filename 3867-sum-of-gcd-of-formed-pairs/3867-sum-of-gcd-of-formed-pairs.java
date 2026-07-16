class Solution {
     static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public long gcdSum(int[] nums) {

        int mxi = 0 ;
        int[] prefixGcd = new int[nums.length];
        int i = 0 ;


        while(i < nums.length){
            mxi =Math.max(nums[i], mxi );
            prefixGcd[i] =gcd(nums[i], mxi);
            i++;
        }
           Arrays.sort( prefixGcd);

           int p=0;
           int q =  prefixGcd.length-1;
          long max =0;
           while(p < q){
            max += gcd(prefixGcd[p],prefixGcd[q]);
            p++;
            q--;

           }
           return max;
        
    }
}