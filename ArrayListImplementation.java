/*public class ArrayImplementation {
    static class Stack {
        int[] arr = new int[5]; 
        int idx = -1; 

        public void push(int val) {
            if (idx < arr.length - 1) {
                idx++;
                arr[idx] = val;
            } else {
                System.out.println("Stack overflow");
            }
        }

        public void pop() {
            if (idx >= 0) { 
                idx--;
            } else {
                System.out.println("Stack underflow");
            }
        }

        public void peek() {
            if (idx >= 0) { 
                System.out.println(arr[idx]);
            } else {
                System.out.println("Stack is empty");
            }
        }

        public int size() {
            return idx + 1; 
        }

        public void display() {
            if (idx >= 0) {
                for (int i = idx; i >= 0; i--) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("Stack is empty");
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        System.out.print(st.size() + " ");
        st.display();

        st.pop();
        st.pop();
        st.pop();
        st.peek();  // This will now print "Stack is empty" without throwing an exception
    }
} /* */

import java.util.ArrayList;

public class ArrayListImplementation {
    static class Stack {
        private ArrayList<Integer> arr = new ArrayList<>();

        public void push(int val) {
            arr.add(val);
        }

        public void pop() {
            if (!arr.isEmpty()) {
                arr.remove(arr.size() - 1);
            } else {
                System.out.println("Stack underflow");
            }
        }

        public void peek() {
            if (!arr.isEmpty()) {
                System.out.println(arr.get(arr.size() - 1));
            } else {
                System.out.println("Stack is empty");
            }
        }

        public int size() {
            return arr.size();
        }

        public void display() {
            if (!arr.isEmpty()) {
                for (int i = arr.size() - 1; i >= 0; i--) {
                    System.out.print(arr.get(i) + " ");
                }
                System.out.println();
            } else {
                System.out.println("Stack is empty");
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        
        st.push(10);
        st.push(20);
        st.push(30);
        
        System.out.print(st.size() + " ");
        
        st.peek();
        st.display();
        st.pop();
        st.peek();
        st.display();
        st.pop();
        st.pop();
        st.peek();
    }
}

