

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

        public int peek() {
            if (idx >= 0) { 
                return arr[idx];
            } else {
                throw new RuntimeException("Stack is empty"); 
            }
        }

        public int size() {
            return idx + 1; 
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        System.out.print(st.size() + " "); 
    }
}/* */ 

import java.util.ArrayList;

public class ArrayListImplementation {
    static class Stack {
        private ArrayList<Integer> arr = new ArrayList<>();

        public void push(int val) {
            arr.add(val);  // Automatically resizes
        }

        public void pop() {
            if (!arr.isEmpty()) {
                arr.remove(arr.size() - 1);  // Removes the last element
            } else {
                System.out.println("Stack underflow");
            }
        }

        public void peek() {
            if (!arr.isEmpty()) {
                System.out.println(arr.get(arr.size() - 1));  // Prints the last element
            } else {
                System.out.println("Stack is empty");  // Print statement instead of exception
            }
        }

        public int size() {
            return arr.size();  // Returns the number of elements
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        
        st.push(10);
        st.push(20);
        st.push(30);
        
        System.out.print(st.size() + " "); // Output: 3
        
        st.peek();  // Output: 30
        st.pop();
        st.peek();  // Output: 20
        st.pop();
        st.pop();
        st.peek();  // Output: Stack is empty
    }
}
