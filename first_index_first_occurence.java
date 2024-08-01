lass Solution {
    public int strStr(String haystack, String needle) {
         int a=haystack.length();
        int b=needle.length();
        if(a<b) return -1;
        for(int i=0;i<=a-b;i++){
            int j=0;
            while(j<b && haystack.charAt(i+j)==needle.charAt(j))
            j++;
            if(j==b){
                return i;
            }
        }
        return -1;
        // or we can apply return haystack.indexOf(needle);
    }
}
