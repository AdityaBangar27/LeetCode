class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0; //used to traverse s string 
        int j = 0; //used to traverse t string

        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                j++;
            }
            i++;
        }

        return t.length() - j;
    }
}