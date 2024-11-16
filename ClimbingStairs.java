package com.tekworks.day_6;

//70. Climbing Stairs
//same as fibanocci series
public class ClimbingStairs {
  public int climbStairs(int n) {
      if(n==1) return 1;
      int one = 1, two = 1;
      int res = 0;
      for(int i=n-1 ; i>=1 ; i--) {
          res = one+two;
          one = two;
          two = res;
      }
      return res;
  }
}
