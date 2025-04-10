 ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> c=new ArrayList<Integer>();
      int a=  txt.indexOf(pat);
      while (a != -1) {
            c.add(a); // Add the index to the list
            a = txt.indexOf(pat, a + 1); // Search for the next occurrence
        }
      return c;[0, 9, 12]