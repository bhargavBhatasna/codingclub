import java.util.*;
class WordCount
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter String ");
		String s=sc.nextLine();
		int word=0,chara=0,digit=0;

	
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				word++;
			}
			if('a'<=s.charAt(i) && 'z'>=s.charAt(i))
			{
				chara++;
			}
			if('1'<=s.charAt(i) && '9'>=s.charAt(i))
			{
				digit++;
			}
		}
		System.out.println(word+1);
		System.out.println(chara);
		System.out.println(digit);
	}
}