package com.tekworks.day_6;

//1668. Maximum Repeating Substring
public class MaximumRepeatingSubstring {
  public int maxRepeating(String sequence, String word) {
      String find = word;
      int count = 0;
      while(true) {
          if(sequence.indexOf(find) == -1) {
              return count;
          }
          count++;
          find += word;
      }
  }
}
