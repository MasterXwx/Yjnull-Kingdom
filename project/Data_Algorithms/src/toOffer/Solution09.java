package toOffer;

import java.util.Stack;

/**
 * 09: 用两个栈实现队列
 */
public class Solution09 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.empty()) {
            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }

        if(stack2.empty())
            throw new RuntimeException("Queue is empty!");

        return stack2.pop();
    }

    public static void main(String[] args) {

    }
}
