class Solution {
    public String longest(List<String> names) {
        // Initialize variables to store the longest string and its length
        String longestString = "";
        int maxLength = 0;

        // Iterate through the list of names
        for (String name : names) {
            if (name.length() > maxLength) {
                longestString = name;
                maxLength = name.length();
            }
        }
        return longestString;
    }
}