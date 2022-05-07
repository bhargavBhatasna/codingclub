import java.util.*;

class cc2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int n=sc.nextInt();

        int a=0,b=1,c;
        for(int i=0;i<n;i++)
        {
        	
        	
            c=a+b;
            b=a;
            a=c;
            if(n<a)
            {
            	break;
            }


        }
        
        System.out.println();
         int q=a+b,w=b,e;
        for(int i=0;i<5;i++)
        {
        	
        	System.out.println(q);
            e=q+w;
            w=q;
            q=e;


        }
	}
}