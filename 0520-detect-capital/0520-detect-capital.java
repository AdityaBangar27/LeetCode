class Solution {
    public boolean detectCapitalUse(String word) {
        //int i = 0;
        // while(i != word.length()-1){
        //     if(!Character.isUpperCase(word.charAt(i))){
        //         return false;
        //     }
        // }
        // return true;

        // for (int i = 0; i < word.length(); i++) {
        //     if(Character.isUpperCase(word.charAt(0))){
        //         i+=1;
        //         if (Character.isLowerCase(word.charAt(i))) {
        //         return false;
        //         }
        //         return true;
        //     }

        //     if (Character.isLowerCase(word.charAt(i))) {
        //         return false;
        //     }
        // }
        // return true;

        int upper = 0;

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
        }

        return upper == 0 || upper == word.length() ||
               (upper == 1 && Character.isUpperCase(word.charAt(0)));
    }
}