class Solution {
    public String reverseWords(String s) {
         String[] st= s.trim().split(" +");
        String ans="";
        for(int i=st.length-1;i>0;i--){
            ans+=st[i]+" ";
        }
        return ans+st[0];
    }
}
