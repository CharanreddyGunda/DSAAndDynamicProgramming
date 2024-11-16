package com.tekworks.day_6;

//152. Maximum Product Subarray
public class MaximumProductSubArray {
  public int maxProduct(int[] nums) {
      int maxProduct = nums[0];
      int product = nums[0];
      for(int i=1 ; i<nums.length ; i++) {
          product = product*nums[i];
          if(maxProduct<product) {
              maxProduct = product;
          }
      }
      for(int i=0 ; i<nums.length ; i++) {
          if(nums[i]>maxProduct) {
              maxProduct = nums[i];
          }
      }
      return maxProduct;
  }
}
