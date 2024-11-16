package com.tekworks.day_6;

import java.util.Arrays;

//179. Largest Number
public class LargestNumber {
  public String largestNumber(int[] nums) {
      String[] stringNums = new String[nums.length];
      int index = 0;
      for(int num : nums) {
          stringNums[index++] = String.valueOf(num);
      }
      Arrays.sort(stringNums, (a,b)->(b+a).compareTo(a+b));
      if(stringNums[0].equals("0")) return "0";
      StringBuilder largestNum = new StringBuilder();
      for (String num : stringNums) {
          largestNum.append(num);
      }
      return largestNum.toString();
  }
}
