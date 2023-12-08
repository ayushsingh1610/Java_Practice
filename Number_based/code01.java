// Java program to display first 100 prime numbers.
class code01
{
    static boolean isPrime(int n)
    {
        boolean flag = false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            flag=true;
        }
        if(!flag)
        return true;

        else    
        return false;
    }
    public static void main(String[] args) {
        int number =1,counter =0;

        System.out.println("Prime Numbers are = ");
        while(counter<=100)
        {
            if(isPrime(number))
            {
                System.out.print(number + " ");
                counter++;
            }
            number++;
        }
    }
}