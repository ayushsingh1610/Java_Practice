// Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. All these operations of SpecialStack must be O(1). To implement SpecialStack, you should only use standard Stack data structure and no other data structure like arrays, list, . etc.
import java.util.*;
public class code01 extends Stack<Integer>
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < 5; i++) {
            // System.out.print("Enter the element = ");
            int element = 10*(i+1);

            s.push(element);
        }
        System.out.println("Press 1 for Push");
        System.out.println("Press 2 for Pop");
        System.out.println("Press 3 for peek");
        System.out.println("Press 4 for Check the stack is Empty");
        System.out.println("Press 5 for Check the stack is Full");
        System.out.println("Press 6 for Get the minimum element.");
        System.out.println("Press 7 for View the Stack.");
        System.out.print("\nEnter the choice = ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:
            {
                System.out.print("Enter the number to be added = ");
                int l = sc.nextInt();
                for (int i = 0; i < l; i++) {
                    System.out.print("Enter the element = ");
                    int element = sc.nextInt();

                    s.push(element);
                }
                System.out.println("Elements are = " + s);
                // break;
            }
            case 2:
            {
                System.out.println(s.pop());
                break;
            }
            case 3:
            {
                int top = s.peek();
                System.out.println("Top Element is = " + top);
                break;
            }
            case 4:
            {
                if(s.isEmpty())
                System.out.println("Stack is Empty");

                else
                System.out.println("NOT empty");

                break;
            }
            case 5:
            {
                if(isFull(s))
                System.out.println("Stack is full ");

                else
                System.out.println("Stack is NOT full");

                break;
            }
            case 6:
            {
                System.out.println("Minimum is = " + getMin(s));
                break;
            }
            case 7:
            {
                System.out.println("Stack is = " + s);
                break;
            }
            default:
            System.out.println("Invaild choice.");
        }
    }
    public static boolean isFull(Stack<Integer> s)
    {
        if(s.peek()==s.lastElement())   return true;

        else    return false;
    }
    public static int getMin(Stack<Integer> s)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.size(); i++) {
            if(s.get(i)<min)
                min = s.get(i);
        }
        return min;
    }
}