// Write a Java recursive method to check if a given array is sorted in ascending order.
import java.util.*;
class code17{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements = ");
		int n = sc.nextInt();

		int a[] = new int[n];

		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}

		if(isSorted(a,n-1))
		System.out.println("Array is Sorted");

		else
		System.out.println("Array is not sorted");
	}

	public static boolean isSorted(int a[], int n ){
		if(n==0)
		return true;

		if(a[n]<a[n-1])
		return false;

		return isSorted(a, n-1);
	}
}
