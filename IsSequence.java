package com.tekworks.day_6;


//392. Is Subsequence
public class IsSequence {
  public boolean isSubsequence(String s, String t) {  
      int i=0, j=0;// i for s and j for t
      while(i<s.length() && j<t.length()) {
          if(s.charAt(i) == t.charAt(j)) {
              i++;
          }
          j++;
      }
      return i==s.length()?true:false;
  }
}
