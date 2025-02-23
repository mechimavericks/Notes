import java.util.Stack;
class StackDemo{
    public static void main(String args[]){
        Stack stack = new Stack();
        stack.push(102);
        stack.push(103);
        stack.push(105);
        stack.push(115);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}