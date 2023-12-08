public class code3 {
    public static void main(String[] args) {
        int a[] = {1,2,1,2,3};
        int counter =0;

        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(a[i]==a[j])
                {
                    counter++;
                }
            }
            if(counter>=1)
            {
                System.out.format("The Duplicate elements are %d by %d times\n",a[i],counter);
            }
            counter=0;
        }
    }
}
