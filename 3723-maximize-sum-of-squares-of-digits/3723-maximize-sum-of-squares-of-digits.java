class Solution {
    public String maxSumOfSquares(int num, int sum) {

        // Greedy approch : A Greedy Algorithm solves a problem by choosing the best option available at the current step, hoping that these local best choices will produce the best overall answer. Make the best decision right now, without reconsidering previous decisions.

        if(sum > 9*num){
            return "";
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < num; i++){
            int add = 0;
            if(sum >= 9){
                add = 9;
            }else{
                add = sum;
            }

            res.append(add);
            sum-=add;
        }
        return res.toString();
    }
}