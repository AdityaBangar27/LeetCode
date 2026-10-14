class Solution {
    public String maxSumOfSquares(int num, int sum) {
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