class Solution {
    public String removeStars(String s) {
        
         Stack<Character> stack = new Stack<>();
        int i = 0 ;
        while( i < s.length()){

           
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));

            }else{
                stack.pop();
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();

for (char ch : stack) {
    sb.append(ch);
}

String result = sb.toString();
return result;
    }
}