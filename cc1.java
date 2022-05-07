import java.util.*;;

class cc1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number which you want to enter ");
		int n = sc.nextInt();

       
		int a[]=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();


		}
		int l=(a.length-1)/2;
		int j=0,temp=0;
		for(int i=a.length-1;i>l;i--)
		{
			temp=a[j];

			a[j]=a[i];
			a[i]=temp;
			j++;


		}

		
		System.out.println("     ");

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);

		}

	}
}
/*class cc1
{
	public static void main(String[] args) {
		int a[]=new int [5];
		
		for(int q=a.length;q>=0;q--)
		{
			System.out.println(a[q]);

		}

	}
}*/