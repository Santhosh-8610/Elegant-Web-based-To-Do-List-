class Solution {
    int longestPrefixSuffix(String s) {
        // code here
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<=s.length()-1;j++){
              String a=s.substring(i,j);
              if(s.startsWith(a) && s.endsWith(a)){
                  if(max<a.length()){
                      max=a.length();
                  }
              }
            }
            
        }
        return max;
    }
}