class Solution {
    public boolean judgeSquareSum(int c) {

        double result = Math.sqrt(c);

      double n  =  Math.ceil(result);
       boolean op = false;

       int a = 0 ;
       while(a <= n){
        if(a*a + n*n  > c){
           n -- ;


        }else if(a*a + n*n   == c){
            op = true;
            break;



        }   else{
            a++;
        }
        
       }
       return op;
        
    }
}