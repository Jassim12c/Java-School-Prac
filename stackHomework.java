import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class stackHomework {
    public static void main(String[] args){
        Stack<Integer> stack1 = new Stack<Integer>();
        stack1.add(34);
        stack1.add(3);
        stack1.add(31);
        stack1.add(98);
        stack1.add(92);
        stack1.add(23);

        System.out.println("Input Stack: " + stack1);
        Stack<Integer> stack2 = StackSort(stack1);
        System.out.println("Sorted Stack: " + stack2);

        Queue<Integer> linked_queue = new LinkedList<Integer>();
        linked_queue.add(10);
        linked_queue.add(8);
        linked_queue.add(4);
        linked_queue.add(23);

        System.out.println("Queue before reverse: " + linked_queue);
        Queue<Integer> qReverse = QueueReverse(linked_queue);
        System.out.println("Queue after reverse: " + qReverse);

    }

    public static Stack<Integer> StackSort(Stack<Integer> stack1){
        // New stack
        Stack<Integer> stack2 = new Stack<Integer>();

        // While the input 'stack1' is not empty keep running
        while(!stack1.empty())
        {
            // Taking top element out of the input 'stack1'
            int temp_element = stack1.pop();

            // While the new stack 'stack2' is not empty and
            // The top element in the new stack is bigger than
            // the temporary popped element keep running
            while(!stack2.empty() && stack2.peek() > temp_element)
            {
                // Pop the top element from 'stack2' and add it
                // to the top of 'stack1' until the loop returns false
                // and then the temp element is pushed to the new sorted stack
                stack1.push(stack2.pop());
            }
            stack2.push(temp_element);
        }
        return stack2;
    }

    public static Queue<Integer> QueueReverse(Queue<Integer> givenQueue){
        Queue<Integer> in_queue = new LinkedList<Integer>();
        Stack<Integer> temp_stack = new Stack<Integer>();

        while(!givenQueue.isEmpty()) {
            temp_stack.push(givenQueue.remove());

        }

        while(!temp_stack.empty()) {
            in_queue.add(temp_stack.pop());
        }

        return in_queue;
    }
}
