// The idea to implement two stacks is to divide the array into two halves and assign two halves to two stacks, i.e., use arr[0] to arr[n/2] for stack1, and arr[(n/2) + 1] to arr[n-1] for stack2 where arr[] is the array to be used to implement two stacks and size of array be n. 
import java.util.*;
class twoStack extends Stack<Integer>
{
    int n;
    int a[];
    int top1;
    int top2;
    twoStack(int n)
    {
        a= new int[n];
        top1 =n/2 ;
        top2= n-1;
    }
    void push1(int element)
    {
        if(top1>0)
        {
            top1--;
            a[top1] = element;
            return ;
        }
        else
        {
            System.out.println("Stack is Overflow 1");
        }
    }
    void push2(int element)
    {
        if(top2 > top1) 
        {
            top2--;
            a[top2] = element;
            return ;
        }
        else
        System.out.println("Stack is Overflow 2");
    }
    int pop1()
    {
        if(top1>0)
        {
            int x = a[top1];
            top1--;
            return x;
        }
        else
        {
            System.out.println("Stack Underflow");
            return 0;
        }
    }
    int pop2()
    {
        if(top2<n)
        {
            int x = a[top2];
            top2++;
            return x;
        }
        else 
        {
            System.out.println("Stack Underflow");
            return 0;
        }
    }

    void Display()
    {
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0)
            System.out.print(a[i] + " ");
        }
    }

}
public class code02
{
    public static void main(String[] args) {
        twoStack s = new twoStack(10);
        s.push1(1);
        s.push1(2);
        s.push1(4);
        s.push2(6);
        s.push2(7);
        s.push2(8);
        System.out.println("Top element in stack 1 = " + s.pop1());
        s.Display();
        System.out.println("Top element in stack 2 = " + s.pop2());
    }
}