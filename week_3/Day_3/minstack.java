package week_3.Day_3;

import java.util.Stack;

public class minstack {

    static class MinStack {
        Stack<Integer> stack;
        Stack<Integer> minStack;

        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);

            if (minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        public void pop() {
            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

    public static void main(String[] args) {
        MinStack st = new MinStack();

        st.push(5);
        st.push(3);
        st.push(7);

        System.out.println(st.getMin()); // 3

        st.pop();

        System.out.println(st.top());    // 3
        System.out.println(st.getMin()); // 3
    }
}
