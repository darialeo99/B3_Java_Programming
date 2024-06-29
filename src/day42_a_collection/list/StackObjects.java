package day42_a_collection.list;

import java.util.Stack;

public class StackObjects {

    public static void main(String[] args) {

        Stack<Character> stack = new Stack<Character>();
        // push() ---> add()
        // pop() ----> remove()
        // peak () ---> get ()

        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d'); // added d at last
        System.out.println(stack);

        System.out.println("Top of my stack " + stack.peek()); // returns what was added at last - what is at the top of my data structure - last element

        stack.pop(); // removes the element which was at the top
        System.out.println(stack);
        System.out.println("Top of my stack " + stack.peek());

        System.out.println(stack.pop()); // removed what was at the top but since I used it in print statement, I will see what was removed
        System.out.println(stack);
        System.out.println("Top of my stack " + stack.peek());

        // Q: But if I want to remove from bottom? Can I?
        // A: There is a way to do it. But that is not the idea of LIFO

        stack.remove(0); // zThis will remove the First element added
        System.out.println(stack);

    }
}
