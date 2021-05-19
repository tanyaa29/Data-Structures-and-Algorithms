public class stack_using_queue {

        /** Initialize your data structure here. */
        private Queue<Integer> q1 = new LinkedList<>();
        private Queue<Integer> q2 = new LinkedList<>();
        private int top;

        public MyStack() {

        }

        /** Push element x onto stack. */
        public void push(int x) {
            q1.add(x);
            top = x;
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            while (q1.size() > 1) {
                top = q1.remove();
                q2.add(top);
            }
            int r = q1.remove();
            Queue<Integer> tmp = q1;
            q1 = q2;
            q2 = tmp;
            return r;
        }

        /** Get the top element. */
        public int top() {
            return top;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return (q1.isEmpty() && q2.isEmpty());
        }
    }


