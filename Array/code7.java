public class code7 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int var=10;
        for(int i=0;i<10;i++)
        {
            a[i]=var--;
        }
        System.out.println("Before Swapping = ");
        for(int i=0;i<10;i++)
        {
            System.out.format("%d  ",a[i]);
        }
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nAfter Swapping = ");
        for(int i=0;i<10;i++)
        {
            System.out.format("%d  ",a[i]);
        }

    }
    
}
