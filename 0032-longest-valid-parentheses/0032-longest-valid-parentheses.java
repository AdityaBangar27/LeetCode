// class Solution {
//     public int longestValidParentheses(String s) {
//         if(s.length() == 0){
//             return 0;
//         }

//         Stack<Character> stack = new Stack<>();
//         int i = 0;
//         int count = 0;
//         while(i<s.length()){
//             if(s.charAt(i) == '('){
//                 stack.push('(');
//             }
//             if(s.charAt(i) == ')'){
//                 if(!stack.isEmpty() && stack.peek() == '('){
//                     stack.pop();
//                     count += 2;
//                 }
//             }
//             i++;
//         }
//         return count;
//     }
// }

import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }

        return max;
    }
}