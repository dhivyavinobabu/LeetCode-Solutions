class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        String mer ="";
        while(i<word1.length() || j<word2.length()){
            if(i<word1.length()){
                mer +=word1.charAt(i);
                i++;
            }
            if(j<word2.length()){
                mer +=word2.charAt(j);
                j++;
            }
        }
        return mer;
    }
}