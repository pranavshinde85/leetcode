class Solution {
    public int[] asteroidCollision(int[] asteroids) {


        Stack<Integer> stack  = new Stack<>();
        int i = 0 ;
        for(int a : asteroids ){

            boolean destroyed = false;

            while(!stack.isEmpty() && stack.peek() > 0 && a < 0){

                if(Math.abs(stack.peek()) > Math.abs(a)){
                     destroyed = true;
                     break;

                }else if(Math.abs(stack.peek()) == Math.abs(a)){

                     destroyed = true;
                     stack.pop();
                     break;
                }
                else{
                    stack.pop();

                }


            }
             if (!destroyed) {
                stack.push(a);
            }
       

        } 
         Integer[] temp = stack.toArray(new Integer[0]);

int[] ans = new int[temp.length];

for (int j = 0; j < temp.length; j++) {
    ans[j] = temp[j];
}

return ans;
        


        
    }
}