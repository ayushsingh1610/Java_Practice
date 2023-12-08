public class code4 {
    public static void main(String[] args) {
        int var=1;
        int a[] = new int[10];
        for(int i=0;i<10;i++)
        {
            a[i] = var++;
        }
        for(int i=0;i<10;i=i+2)
        {
            System.out.println(a[i]);
        }
    }
    
}
