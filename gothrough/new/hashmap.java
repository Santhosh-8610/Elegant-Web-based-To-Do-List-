class Solution{
    static int map(int n, String keys[], int arr[], String s)
    {
        // code here
        HashMap<String,Integer> a=new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            
            a.put(keys[i],arr[i]);
        }
        if(a.containsKey(s)) return a.get(s);
        else return -1;
        
        
        
    }
}