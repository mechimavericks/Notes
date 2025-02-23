import java.util.Stack;
class StackDemo{
    public static void main(String args[]){
        Stack<Integer> data = new Stack<Integer>();
        for(int i=0;i<=10;i++)
            data.push(i);
        System.out.println(data);
        System.out.println("Delete Data = "+data.pop());
        data.pop();
        System.out.println("Peek Item = "+data.peek());
        System.out.println("Item at 5 = "+data.search(5));
        System.out.println(data);
    }
}