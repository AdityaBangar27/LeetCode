class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int candie : candies){
            if(max < candie){
                max = candie;
            }
        }

        for(int i = 0; i < candies.length; i++){
            if((candies[i]+extra) >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}