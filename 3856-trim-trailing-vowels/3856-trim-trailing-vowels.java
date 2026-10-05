class Solution {
    public String trimTrailingVowels(String s) {
        String vol ="";
        int index =0;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if("aeiou".indexOf(ch)==-1){
                 index =i+1;
                 break;
            }
        }
        for(int i=0;i<index;i++){
            char ch = s.charAt(i);
            vol+=ch;
        }
        return vol;
    }
}