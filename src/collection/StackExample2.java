package collection;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Anton");
        stack.push("Baton");
        stack.push("Sasha");
        stack.push("Oleg");

//        while(!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }

        System.out.println(stack.peek());
        System.out.println(stack);

//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack);
    }
}
