package com.tekworks.day_6;

import java.util.Stack;

//155. Min Stack
public class MinStack {
  public Stack<Integer> st;
  public Stack<Integer> minSt;

  public MinStack() {
      st = new Stack<>();
      minSt = new Stack<>();
  }
  
  public void push(int val) {
      st.push(val);
      if (minSt.isEmpty() || val<=minSt.peek()) {
          minSt.push(val);
      }
  }
  
  public void pop() {
      if(st.peek().equals(minSt.peek()))
      {
         minSt.pop();
      }
  st.pop();

 }
  
  public int top() {
      return st.peek();
  }
  
  public int getMin() {
      return minSt.peek();
  }
}

/**
* Your MinStack object will be instantiated and called as such:
* MinStack obj = new MinStack();
* obj.push(val);
* obj.pop();
* int param_3 = obj.top();
* int param_4 = obj.getMin();
*/




