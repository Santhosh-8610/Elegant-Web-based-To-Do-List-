class Solution {
    // Function to check if two strings are rotations of each other or not.
    public boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length()!=s2.length())
        {
            return false;
        }
        if(s1.equals(s2))
        {
            return true;
        }
        if(s1==null || s2==null)
        {
            return false;
        }
        return ((s1 + s1).contains(s2));
    }
//Input: s1 = "abcd", s2 = "cdab"
//Output: true
//Explanation: After 2 right rotations, s1 will become equal to s2.
    
}