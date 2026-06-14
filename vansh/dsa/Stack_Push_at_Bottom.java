package vansh.dsa;

import java.util.Stack;

public class Stack_Push_at_Bottom {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int temp = s.pop();
        pushAtBottom(s,data);
        s.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushAtBottom(stack, 4);

        System.out.println("Stack Push At bottom ->");
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
