package com.tekworks.day_6;


//98. Validate Binary Search Tree
public class ValidateBinarySearchTree {
  public boolean isValidBST(TreeNode root) {
      return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE); 
  }

  public boolean isValidBST(TreeNode root, long min, long max) {
      if (root == null) {
          return true;
      }
      if (root.val <= min || root.val >= max) {
          return false;
      }
      return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
  }
}

